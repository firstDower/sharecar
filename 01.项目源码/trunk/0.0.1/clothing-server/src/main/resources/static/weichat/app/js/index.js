$(function () {
    index.init();
})
var index = {
    init:function () {
        util.checkToken();
        index.getUserInfo();
        index.selectGoodsListWap();

        $("#modifyLi").click(function () {
            location.href= ctxPath + 'jump/weichat/modify';
        })

        mui("body").on('tap', '.mui-table-view-cell', function (e) {
            var goodsData = $(this).attr('goodsData');
            sessionStorage["goodsData"] = goodsData;
            location.href= ctxPath + 'jump/weichat/customNew';
        });
        wxSignature();
        //shareDiv
        mui("body").on('tap', '.shareDiv', function (e) {
            e.stopPropagation();
            console.log("============");
            $(".showPopove,.my-popove").show();
        });



        //返回公众号首页
        pushHistory();
        //监听触发物理返回按钮
        window.addEventListener("popstate", function(e) {
            f_close();//执行关闭浏览器窗口，返回公众号首页
            return;
        }, false);
        function pushHistory() {
            var state = {
                title: "title",
                url: "#"
            };
            window.history.pushState(state, "title", "#");
        }
        function f_close(){
            //http://weixin.qq.com/r/lUTz6_fEaLoXraOI9xGH
            window.location.href = "https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzIwODQ1ODA1MQ==&scene=110#wechat_redirect";
            if(typeof(WeixinJSBridge)!="undefined"){
                WeixinJSBridge.call('closeWindow');
            }else{
                if (navigator.userAgent.indexOf("MSIE") > 0) {
                    if (navigator.userAgent.indexOf("MSIE 6.0") > 0) {
                        window.opener = null; window.close();
                    } else {
                        window.open('', '_top'); window.top.close();
                    }
                } else if (navigator.userAgent.indexOf("Firefox") > 0) {
                    window.location.href = 'about:blank ';
                } else {
                    window.opener = null;
                    window.open('', '_self', '');
                    window.close();
                }
            }
        }

    },
    selectGoodsListWap:function () {
        var param = {}
        param.timeStamp = util.createTimeStamp();
        $.ajax({
            type: 'POST',
            url: ctxPath + "securityService/selectGoodsListWap",
            timeout:8000,
            data : param,
            headers: util.initHeaders(param),
            dataType: 'json',
            success: function(data){
                if(data.code==200){
                    var htmlStr = ""
                    $.each(data.data,function (index,item) {
                        htmlStr += '<li id="modifyLi" goodsData=\''+JSON.stringify(item)+'\' class="mui-table-view-cell mui-media">'+
                        '<a href="javascript:;"class="linkmedia" >'+
                        '<img class="mui-media-object mui-pull-left" src="'+ctxPath+item.pic_url+'">'+
                        '<div class="mui-media-body">'+
                        '<div class="">'+item.product_name+'</div>'+
                        '<div class="font14">'+item.VC_MODEL_NAME+'</div>'+
                        '<div class="font14">'+item.VC_SCHOOL_NAME+'</div>'+
                        '</div>'+
                        '<div class="meta-info shareDiv">'+
                        '<img src="'+ctxPath+'/weichat/app/img/share.png" alt="" class="share">'+
                        '</div>'+
                        '</a>'+
                        '</li>';


                        /*htmlStr += '<li id="modifyLi"   goodsData=\''+JSON.stringify(item)+'\' class="mui-table-view-cell mui-media">'+
                            '<a href="javascript:;"class="linkmedia" >'+
                            '<img class="mui-media-object mui-pull-left" src="'+ctxPath+'/imgServer/'+item.pic_url+'">'+
                            '<div class="mui-media-body">'+
                            '<div class="mui-ellipsis-1 title"></div>'+
                            '<div class="mui-ellipsis-2 describe">描述语言关于衣服定制的描述语</div>'+
                            '</div>'+
                            '<div class="meta-info shareDiv">'+
                            '<img src="'+ctxPath+'/weichat/app/img/share.png" alt="" class="share">'+
                            '</div>'+
                            '</a>'+
                            '</li>'*/
                    })
                    $("#dynamicData").html(htmlStr);
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
function wxSignature() {
    var url = window.location.href;
    $.ajax({
        type:"post",
        url:ctxPath + "weichat/wxSignature",
        dataType:"json",
        data:{url:url},
        success:function(data){
            console.log(JSON.stringify(data));
            if(data.code==200){
                data = data.data;
                wx.config({
                    debug: false, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
                    appId: data.appId,
                    timestamp: data.timestamp,
                    nonceStr: data.nonceStr,
                    signature: data.signature,
                    jsApiList: [
                        'onMenuShareTimeline',
                        'onMenuShareAppMessage'
                    ]
                });
                wx.ready(function(){
                    // config信息验证后会执行ready方法，所有接口调用都必须在config接口获得结果之后，config是一个客户端的异步操作，所以如果需要在页面加载时就调用相关接口，则须把相关接口放在ready函数中调用来确保正确执行。对于用户触发时才调用的接口，则可以直接调用，不需要放在ready函数中。
                    setShare();  //定义函数
                });
                wx.error(function(res){
                    // config信息验证失败会执行error函数，如签名过期导致验证失败，具体错误信息可以打开config的debug模式查看，也可以在返回的res参数中查看，对于SPA可以在这里更新签名。
                    alert("error:"+JSON.stringify(res));
                });
            }
        }
    });
}

/**
 * 微信分享功能实现
 */
function setShare() {

    var userId = getQueryString("userId");
    var origen = window.location.origin;
    var url = origen+ ctxPath + 'weiChatShare/'+userId;
    var imgUrl = "https://img.36krcdn.com/20200410/v2_1a1ff700db9947bd9183e3e29410aabd_img_png";
    var title = "校服定制";
    var desc = "专注中高端校服定制，保质保量，舒适耐用，终身免费售后";
    console.log("url=============="+url)
//  获取“分享到朋友圈”按钮点击状态及自定义分享内容接口
    wx.ready(function () {   //需在用户可能点击分享按钮前就先调用
        wx.onMenuShareTimeline({
            title: title, // 分享标题
            desc: desc, // 分享描述
            link: url, // 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
            imgUrl: imgUrl, // 分享图标
            success: function () {
                //mui.toast('分享到朋友圈success');
                $(".showPopove,.my-popove").hide();
            }
        })
    });


    // 获取“分享给朋友”按钮点击状态及自定义分享内容接口
    wx.ready(function () {   //需在用户可能点击分享按钮前就先调用
        wx.onMenuShareAppMessage({
            title: title, // 分享标题
            desc: desc, // 分享描述
            link: url, // 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
            imgUrl: imgUrl, // 分享图标
            success: function () {
                $(".showPopove,.my-popove").hide();
            }
        })
    });

}