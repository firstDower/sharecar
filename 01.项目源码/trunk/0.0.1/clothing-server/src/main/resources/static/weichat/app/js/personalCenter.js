$(function () {
    personalCenter.init();
})
var personalCenter = {
    init:function () {
        util.checkToken();
        $(".orderIcon").click(function () {
            location.href= ctxPath + 'jump/weichat/orderList';
        })
        mui("body").on('tap', '#shareList', function (e) {
            location.href= ctxPath + 'jump/weichat/myShareList';
        });
        //客服电话
        document.getElementById("tel").addEventListener('tap', function() {
            if(mui.os.plus){
                plus.device.dial("13546506216");
            }else{
                location.href = 'tel:13546506216';
            }

        });

        personalCenter.getUserInfo();
    },
    getUserInfo:function () {

        var userId = getQueryString("userId");
        var openId = getQueryString("openId");
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