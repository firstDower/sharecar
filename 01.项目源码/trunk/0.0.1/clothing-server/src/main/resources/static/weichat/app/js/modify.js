$(function () {
    custom.init();
})
    var custom = {
        init:function () {
            util.checkToken();
            custom.getUserInfo();
            $("#subBut").click(this.addOrder);
        },
        addOrder:function () {
            var param = {}
            param.product_id = 1;
            var userInfo = JSON.parse(sessionStorage["userInfo"]);
            param.VC_USER_ID = userInfo.NUM_USER_ID;
            param.VC_OPEN_ID = sessionStorage['openId'];
            //1：定制；2 ：修改
            //param.NUM_PAR_TYPE = 2;
            //param.NUM_TYPE = "3";
            param.NUM_PRICE = 0;

            var VC_NAME = $("#VC_NAME").val();

            param.VC_NAME = VC_NAME;
            var VC_PHONE = $("#VC_PHONE").val();
            if(!VC_PHONE){
                mui.toast("请输入联系手机号！");
                return false;
            }
            param.VC_PHONE = VC_PHONE;
            var VC_NOTES = $("#VC_NOTES").val();


            param.VC_NOTES = VC_NOTES;
            param.timeStamp = util.createTimeStamp();

            console.log("获取表单参数：："+JSON.stringify(param));

            $.ajax({
                type: 'POST',
                url: ctxPath + "securityService/creatProduct",
                timeout:8000,
                data : param,
                headers: util.initHeaders(param),
                dataType: 'json',
                success: function(data){
                    if(data.code==200){
                        var btnArray = ['否', '是'];
                        mui.confirm('确认去订单详情支付？', '添加定制成功!', btnArray, function(e) {
                            if (e.index == 1) {
                                var vcOrderNo = data.data;
                                sessionStorage['vcOrderNo'] = vcOrderNo
                                mui.openWindow({
                                    url:ctxPath + 'jump/weichat/modifyOrderDetail',
                                    id: "orderDetail",//详情页webview的id
                                    show: {
                                        aniShow: 'none', //页面不显示动画
                                        duration: '0' //
                                    }
                                });
                                //mui.toast("去订单详情！");
                            } else {
                                mui.toast("继续添加订单！");
                            }
                        })

                    }else {

                    }
                },
                error: function(xhr, type){
                }
            });
        },
        getUserInfo:function () {

            var userId = getQueryString("userId");
            var openId = getQueryString("openId");
            var shareUserId = getQueryString("shareUserId");
            if(shareUserId){
                sessionStorage['shareUserId'] = shareUserId;
            }else {
                sessionStorage.removeItem('shareUserId');
            }
            sessionStorage['openId'] = openId;
            var param = {
                'userId':userId,
                'openId':openId
            }
            param.timeStamp = util.createTimeStamp();
            $.ajax({
                type: 'POST',
                url: ctxPath + "securityService/getUserInfo",
                timeout:8000,
                data : param,
                headers: util.initHeaders(param),
                contentType: 'application/json',
                dataType: 'json',
                success: function(data){
                    console.log("==========="+JSON.stringify(data));
                    if(data.code==200){
                        var userInfo = data.data;
                        var VC_HEAD_IMG_URL = userInfo.VC_HEAD_IMG_URL;
                        $("#VC_HEAD_IMG_URL").attr("src",VC_HEAD_IMG_URL);
                        var VC_NICKNAME = userInfo.VC_NICKNAME;
                        $("#VC_NICKNAME").html(VC_NICKNAME);
                        sessionStorage["userInfo"] = JSON.stringify(userInfo);
                        var subscribeBool = userInfo.subscribeBool;
                        util.showSubscribe(subscribeBool);
                    }else {
                        mui.toast(data.msg);
                    }
                },
                error: function(xhr, type){
                }
            });
        }
    }