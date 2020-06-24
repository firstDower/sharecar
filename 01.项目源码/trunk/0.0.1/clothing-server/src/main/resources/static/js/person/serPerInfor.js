$(function () {
    initPage();
    $("#saveBut").click(editPersionInfo);
});
function editPersionInfo() {
    var paramData = {};
    paramData.vcRealName = $("#vcRealName").val();
    paramData.vcPhone = $("#vcPhone").val();
    var userInfo = JSON.parse(sessionStorage['userInfo']);
    paramData.numUserId = userInfo.numUserId;
    var numState = userInfo.numState;
    if(numState=="1"){
        numState="2";
    }
    paramData.numState = numState;
    $.ajax({
        type:"post",
        url:getUrl("reposi/editUserInfo"),
        dataType:"json",
        data:{params:JSON.stringify(paramData)},
        success:function(data){
            console.log(data);
            if(data.success){
                alert("修改成功！");
            }
        },
        error:function(){
            closeMsg();
        }
    });
}
function initPage() {
    var userInfo = JSON.parse(sessionStorage['userInfo']);
    $('#vcRealName').val(userInfo.vcRealName);
    $('#vcPhone').val(userInfo.vcPhone);
}