$(function () {
    getUsersInfo();
});
function getUsersInfo(openId) {
    var openId = getQueryString("openId");
    if(!openId){
        openId = sessionStorage["openId"];
        if(!openId){
            openId = "o_1At0Te0Bq3R0VDOkGV6qrOay60";
        }
    }
    sessionStorage["openId"] = openId;
    $.ajax({
        type:"post",
        url:getUrl("reposi/getUserInfoByOpenid"),
        dataType:"json",
        data:{params:openId},
        success:function(data){
            console.log(data);
        },
        error:function(){
            closeMsg();
        }
    });
}