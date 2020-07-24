$(function () {
    personalCenter.init();
})
var personalCenter = {
    init:function () {
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
        $.ajax({
            type: 'POST',
            url: ctxPath + "reposi/getUserInfo",
            timeout:8000,
            data : JSON.stringify(param),
            contentType: 'application/json',
            dataType: 'json',
            success: function(data){
                console.log("==========="+JSON.stringify(data));
                if(data.success){
                    var userInfo = data.resultInfo;
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