$(function () {
    initPage();
    $("#saveBut").click(editPersionExtraInfo);
});
function editPersionExtraInfo() {
    var paramData = {};
    var vcCarNo = $("#vcCarNo").val();
    if(!isVehicleNumber(vcCarNo)){
        alert("请输入正确的车牌号！");
        return false;
    }
    paramData.vcCarNo = vcCarNo;
    var vcBrand = $("#vcBrand").val();
    if(!vcBrand){
        alert("请输入正确的车辆品牌！");
        return false;
    }
    paramData.vcBrand = vcBrand;
    var vcCarColor = $("#vcCarColor").val();
    if(!vcCarColor){
        alert("请输入正确的车辆颜色！");
        return false;
    }
    paramData.vcCarColor = vcCarColor;

    var vcRealName = $("#vcRealName").val();
    if(!vcRealName){
        alert("请输入真实姓名！");
        return false;
    }
    paramData.vcRealName = vcRealName;

    var vcIdentityNo = $("#vcIdentityNo").val();
    if(!IdentityCodeValid(vcIdentityNo)){
        alert("请输入正确的身份证号！")
        return false;
    }
    paramData.vcIdentityNo = vcIdentityNo;


    /*var vcBackCardNumber = $("#vcBackCardNumber").val();
    if(!luhmCheck(vcBackCardNumber)){
        alert("请输入正确的银行卡号！");
        return false;
    }
    paramData.vcBackCardNumber = vcBackCardNumber;
    */
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
  /*  var userInfo = JSON.parse(sessionStorage['userInfo']);
    $('#vcRealName').val(userInfo.vcRealName);
    $('#vcPhone').val(userInfo.vcPhone);*/
}