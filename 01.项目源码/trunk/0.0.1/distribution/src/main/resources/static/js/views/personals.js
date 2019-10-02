$(function () {





    personals.initPage();
});
var personals = {
    alertSelf:function (obj) {
        $.alert({content: '<h1 style="display:flex;justify-content:center;">提示</h1>' + '<p>' + obj +'</p>'})
    },
    initPage:function () {
        if(!sessionStorage['agentId']){
            sessionStorage['agentId'] = 0;
        }

        var userinfo = getQueryString('userinfo');
        if(userinfo){
            userinfo = decodeURIComponent(userinfo);
            console.log("userinfo============"+userinfo);
            sessionStorage['userinfo'] = userinfo;
        }else {
            userinfo = sessionStorage['userinfo'];
        }

        if(userinfo){
            userinfo = JSON.parse(userinfo);
            //第一步，获取用户信息
            personals.getUsersInfo(userinfo);
        }else {
            personals.showPageYouKe();
        }




    },
    showPage:function (obj) {
        var agentId = sessionStorage['agentId'];
        if(!agentId){
            agentId = 0;
        }
        //alert("222222222"+obj.mechName)
        $('#nickname').html(obj.nickname);
        $('#admin').html(obj.mechName);

        $("#personInfo").click(function () {
            window.location.href = getUrl('jump/-/views/-/index');
        });
        $("#toSharePage").click(function () {
            window.location.href = getUrl('jump/-/views/-/share');
        });
        $("#integral").click(function () {
            window.location.href = getUrl('jump/-/views/-/integral');
        });
        $("#fellows").click(function () {
            window.location.href = getUrl('jump/-/views/-/partner');
        });
        $("#message").click(function () {
            window.location.href = getUrl('jump/-/views/-/message');
        });
        /*var origen = window.location.origin;
        var url = 'https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx718d6424da177316&redirect_uri='+origen+'/distribution/rediractHomeUrl&response_type=code&scope=snsapi_base&state=%7b%22redictNo%22%3a%22005%22%2c%22pId%22%3a%22parentid%22%7d&connect_redirect=1#wechat_redirect';
        url = url.replace(/parentid/, agentId);*/

        personals.createQrcode(agentId);
    },
    showPageYouKe:function () {
        sessionStorage['agentId'] = 0;
        $('.youKe').hide();
        $("#personInfo,#integral,#fellows,#message,#toSharePage").click(function () {
            //personals.alertSelf("目前为内测版本，请联系管理员注册后查看");
            $.tips({
                content : '请联系管理员注册后查看',
                stayTime : 2000,
                type : "warn"
            });
        });
        /*$("#toSharePage").click(function () {
            window.location.href = getUrl('jump/-/views/-/share');
        });*/
    },
    getUsersInfo:function (userinfo) {
        var param = {
            'openId':userinfo.openid,
            'agentName':userinfo.nickname
        };
        if(userinfo.pId){
            param.pId = userinfo.pId;
        }
        $.ajax({
            type:"post",
            url:getUrl("esbServer/getUserInfoByOpenid"),
            dataType:"json",
            data:{params:JSON.stringify(param)},
            success:function(data){
                console.log(JSON.stringify(data));
                if(data.code==200){//正常用户
                    var data = data.data.msg;
                    var agentId = data.agentId;
                    if(agentId){
                        var openId = data.openId;
                        var isTemporary = data.isTemporary;
                        var pName = data.pName;
                        if(isTemporary==0){
                            sessionStorage['agentInfo'] = JSON.stringify(data);
                            sessionStorage['agentId'] = agentId;
                            sessionStorage['openId'] = openId;
                            userinfo.agentId = data.agentId;
                            userinfo.nickname = data.agentName;
                            userinfo.mechName = data.mechName;
                            //alert("111111111111"+data.mechName)
                            personals.showPage(userinfo);
                        }else if(isTemporary==1){
                            var param = {};
                            param.openId = openId;
                            layer.open({
                                content: '确认成为'+pName+'的下级业务员吗？'
                                ,btn: ['取消', '确定']
                                ,skin: 'footer'
                                ,yes: function(index){
                                    layer.closeAll();
                                    param.confirm = 1;
                                    personals.editRelation(param);
                                },no: function(index){
                                    layer.closeAll();
                                    param.confirm = 0;
                                    personals.editRelation(param);
                                }
                            });
                        }
                    }else{//游客
                        personals.showPageYouKe();
                    }
                }else{//游客
                    personals.showPageYouKe();
                }

            }
        });

    },
    makeCodePro:function( obj) {
        //二维码生成
        var qrcode = new QRCode(document.getElementById("qrcode"), {
            width : 190,
            height : 190
        });
        if (!obj) {
            alert("Input a text");
            elText.focus();
            return;
        }
        qrcode.makeCode(obj);
    },
    createQrcode:function (agentId) {
        $.ajax({
            type:"post",
            url:getUrl("weichat/createQrcode"),
            dataType:"text",
            data:{agentId:agentId},
            success:function(data){
                $("#createQrcode").attr("src","https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket="+data);
            },
            error:function () {
            }
        });
    },
    editRelation:function (obj) {
        $.ajax({
            type:"post",
            url:getUrl("obtainData/WD2003"),
            dataType:"json",
            data:{params:JSON.stringify(obj)},
            success:function(data){
                console.log(JSON.stringify(data));
                if(data!=null && (data.code==200 || data.code=='200') && data.data.success=='true'){
                    personals.initPage();
                }
            },
            error:function () {
            }
        });
    }
}