$(function () {
    getMyJobs();
});
function getMyJobs() {
    var userInfo = JSON.parse(sessionStorage['sessionStorage["userInfo"]']);
    var numUserId = userInfo.numUserId;
    var params = {};
    params.numUserId = numUserId;
    $.ajax({
        type:"post",
        url:getUrl("reposi/getMyJobs"),
        dataType:"json",
        data:{params:JSON.stringify(params)},
        success:function(data){
            console.log(JSON.stringify(data));
        },
        error:function(){
            closeMsg();
        }
    });
}