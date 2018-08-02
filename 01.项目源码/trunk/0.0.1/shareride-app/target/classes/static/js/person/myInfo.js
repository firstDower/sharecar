$(function () {
    $(".myTrip,.goTrip,.tripList").hide();
    getUsersInfo();
    $("#forCarOwner").click(forCarOwner);
    $("#setPerInfo").click(setPerInfo);
    $("#goTrip").click(goTrip);
    $("#goMyJobs").click(goMyJobs);
    $("#goMyTripRecord").click(goMyTripRecord);
});

function goMyTripRecord() {
    location.href = getUrl("goMyTripRecord");
}

function goMyJobs() {
    location.href = getUrl("goMyJobs");
}

function goTrip() {
    location.href = getUrl("goGoTrip");
}

function getUsersInfo() {
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
            sessionStorage["userInfo"] = JSON.stringify(data);
            console.log(JSON.stringify(data));
            showHtml(data.numState);
        },
        error:function(){
            closeMsg();
        }
    });

}

function showHtml(obj) {
    if(obj=="1"){//游客
        $(".personInfo").children("a").html("完善个人信息");
    }else if(obj=="2"){//已经注册用户
        $(".myTrip").show();
    }else if(obj=="3"){//车主
        $(".myTrip,.goTrip,.tripList").show();
    }else{//非法用户

    }
}

function setPerInfo() {
    location.href = getUrl("goSetPersonInfo");
}

//注册成为车主
function forCarOwner() {
    var userInfo = JSON.parse(sessionStorage["userInfo"]);
    var numState = userInfo.numState;
    if(numState == "1"){
        alert("必需先完善个人信息!");
    }else if(numState == "3"){
        alert("您已经是车主！");
    }else{
        location.href = getUrl("goForCarOwner");
    }

}