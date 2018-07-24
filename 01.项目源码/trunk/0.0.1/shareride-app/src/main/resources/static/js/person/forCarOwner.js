$(function () {
    initPage();
    $("#saveBut").click(editPersionExtraInfo);
});
function editPersionExtraInfo() {
    var paramData = {};
    var vcIdcardNumber = $("#vcIdcardNumber").val();
    if(!IdentityCodeValid(vcIdcardNumber)){
        alert("请输入正确的身份证号！")
        return false;
    }
    paramData.vcIdcardNumber = vcIdcardNumber;
    var vcBackCardNumber = $("#vcBackCardNumber").val();
    if(!luhmCheck(vcBackCardNumber)){
        alert("请输入正确的银行卡号！");
        return false;
    }
    paramData.vcBackCardNumber = vcBackCardNumber;
    var userInfo = JSON.parse(sessionStorage['userInfo']);
    paramData.numUserId = userInfo.numUserId;
    paramData.numState = "3";
    $.ajax({
        type:"post",
        url:getUrl("reposi/editPersionExtraInfo"),
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