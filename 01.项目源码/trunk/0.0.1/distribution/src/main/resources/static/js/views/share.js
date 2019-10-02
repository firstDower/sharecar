$(function() {
    wxSignature();
});

function initHtml() {
    $(".shareBtn").on("click", function() {
        var prdCode = $(this).attr("prdCode");
        sessionStorage['prdCode'] = prdCode;
        console.log(prdCode);
        $(".shareBox").show();
        $(".shareBox").click(function () {
            $(this).hide();
        })
    });

    $(".btn").on("click", ".shareImg", function() {
        console.log("分享图片");
        $(".shareBox").hide();
        //imgBasService%7CimgBasePoi/views/
        var prdCode = sessionStorage['prdCode'];
        var dataStorage = JSON.parse(sessionStorage['dataStorage']);
        var dataStr = dataStorage[prdCode];
        statistical(prdCode);
        window.location.href = getUrl('jump/imgBasService%7CimgBasePoi/views/'+dataStr.prdImgPath+'/noDisease');
    });
    $(".btn").on("click", ".shareLink", function() {
        console.log("分享链接");
        shareLink();
        $(".shareBox").hide();
        $("#mcover").show();
        $("#mcover").click(function () {
            $(this).hide();
        })
    });
}


function shareLink(){
    var prdCode = sessionStorage['prdCode'];
    var dataStorage = JSON.parse(sessionStorage['dataStorage']);
    var dataStr = dataStorage[prdCode];
    var origen = window.location.origin;
    console.log("========dataStr.prdPage========dataStr====="+JSON.stringify(dataStr));
    var urlStr = updateQueryStringParameter(dataStr.prdPage,'agentId',sessionStorage['agentId']);
    var link = origen+getUrl('rediractUrl?url='+urlStr);
    var imgUrl = origen+ctxPath+'display-img/'+dataStr.prdIme;
    // 在这里调用 API，分享朋友圈
    //alert(imgUrl)
    wx.onMenuShareTimeline({
        title: dataStr.prdName, // 分享标题
        link: link, // 分享链接
        desc: dataStr.brief,
        imgUrl: imgUrl, // 分享显示的缩略图
        success: function () {
            // 用户确认分享后执行的回调函数
            // alert('分享完成');
            statistical(prdCode);
        },
        cancel: function () {
            // 用户取消分享后执行的回调函数
            // alert('淘气了哦，你取消分享');
        },fail: function (res) {
            //alert('fail');
            //alert(JSON.stringify(res));
        }
    });
    //分享给朋友
    wx.onMenuShareAppMessage({
        title: dataStr.prdName, // 分享标题
        link: link, // 分享链接
        desc: dataStr.brief,
        imgUrl: imgUrl, // 分享显示的缩略图
        success: function () {
            // 用户确认分享后执行的回调函数
            //alert(origen+getUrl('rediractUrl?url='+dataStr.prdPage));

        },
        cancel: function () {
            // 用户取消分享后执行的回调函数
            // alert('淘气了哦，你取消分享');
        },fail: function (res) {
            //alert('分享给朋友fail');
            //alert(JSON.stringify(res));
        }
    });
}
function wxSignature() {
    var url = window.location.href;
    $.ajax({
        type:"post",
        url:getUrl("wxSignature"),
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
                    //setShare();  //定义函数
                });
                wx.error(function(res){
                    // config信息验证失败会执行error函数，如签名过期导致验证失败，具体错误信息可以打开config的debug模式查看，也可以在返回的res参数中查看，对于SPA可以在这里更新签名。
                    alert("error:"+JSON.stringify(res));
                });
            }
        }
    });
}

function statistical(obj) {
    var param = {};
    param.agentId = sessionStorage['agentId'];
    param.productCode = obj;
    param.mode = 2;
    var prostr = JSON.stringify(param);
    $.ajax({
        type: 'POST',
        url: ctxPath + "obtainData/WD1004",
        timeout:8000,
        data : {
            params : prostr
        },
        dataType: 'json',
        success: function(data){
            console.log(data);

        },
        error: function(xhr, type){

        }
    });
}