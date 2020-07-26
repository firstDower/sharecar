$(function () {
    personalCenter.init();
})
var personalCenter = {
    init:function () {
        util.checkToken();
        $("#orderList").click(function () {
            location.href= ctxPath + 'jump/weichat/orderList';
        })
        personalCenter.getUserInfo();
    },
    getUserInfo:function () {

        var userId = getQueryString("userId");
        var param = {
            'userId':userId
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
                    sessionStorage["userInfo"] = JSON.stringify(userInfo);
                }else {
                    mui.toast(data.msg);
                }
            },
            error: function(xhr, type){
            }
        });
    }
}