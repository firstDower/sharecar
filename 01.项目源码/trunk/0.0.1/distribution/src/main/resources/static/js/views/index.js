$(function() {

    index.initPage();
})
var timeNum = 60;
var index = {
    initPage:function () {
        var agentInfo = JSON.parse(sessionStorage['agentInfo']);
        var phone = agentInfo.agentPhon;
        var agentName = agentInfo.agentName;
        if(phone){
            $("#phone").val(phone);
        }
        if(agentName){
            $("#name").val(agentName);
        }
        index.setListener();
    },
    setListener:function () {
        $("#verification").click(function () {
            var phone = $("#phone").val();
            if(!checkMobile(phone)){
                index.alertSelf("请输入正确的手机号");
                return false;
            }
            index.getValidata(phone);
            $("#verification").hide();
            $("#verificationTime").css("display","inline-block");
            t1=setInterval("index.timeFun(timeNum)",1000);
        });
        $("#save").click(function () {
            index.updateInfo();
        });
    },
    timeFun:function (t) {
        if(t>=0){
            timeNum--;
            $("#verificationTime").html(t);
        }else {
            window.clearInterval(t1);
            timeNum=60;
            $("#verificationTime").hide();
            $("#verification").css("display","inline-block");
        }
    },
    toVValidata:function () {
        var param = {};

        $.ajax({
            type: 'POST',
            url: ctxPath + "obtainData/QS1003",
            timeout:8000,
            data : {
                params : JSON.stringify(param)
            },
            dataType: 'json',
            success: function(data){
                console.log("data="+data);
                if(data!=null && (data.code==200 || data.code=='200') && data.data.success=='true'){


                }

            },
            error: function(xhr, type){
                index.alertSelf('Ajax error!');
                // 即使加载出错，也得重置
                dropload.resetload();
            }
        });
    },
    getValidata:function (obj) {

        var param = {};
        param.mobile = obj;
        param.verLength = 6;
        $.ajax({
            type: 'POST',
            url: ctxPath + "obtainData/QS1002",
            timeout:8000,
            data : {
                params : JSON.stringify(param)
            },
            dataType: 'json',
            success: function(data){
                console.log("data="+JSON.stringify(data));
                if(data!=null && (data.code==200 || data.code=='200') && data.data.success=='true'){

                }

            },
            error: function(xhr, type){
                index.alertSelf('Ajax error!');
                // 即使加载出错，也得重置
                dropload.resetload();
            }
        });
    },
    alertSelf:function (obj) {
        $.tips({
            content : obj,
            stayTime : 3000,
            type : "warn"
        });
    },
    updateInfo:function () {
        var phone = $("#phone").val();
        if(!checkMobile(phone)){
            index.alertSelf("请输入正确的手机号");
            return false;
        }
        var name = $("#name").val();
        if(!name||name.length>8){
            index.alertSelf("请输入正确姓名");
            return false;
        }
        var validate = $("#validate").val();
        if(!validate||validate.length!=6){
            index.alertSelf("请输入正确的验证码");
            return false;
        }
        var param = {};
        param.agentId = sessionStorage["agentId"];
        param.agentName = name;
        param.agentPhone = phone;
        param.verCode = validate;
        param.mobile = phone;
        $.ajax({
            type: 'POST',
            url: ctxPath + "obtainData/WD2001",
            timeout:8000,
            data : {
                params : JSON.stringify(param)
            },
            dataType: 'json',
            success: function(data){
                console.log("data="+JSON.stringify(data));
                if(data!=null && (data.code==200 || data.code=='200') && data.data.success=='true'){
                    index.alertSelf("个人信息修改成功");
                    setTimeout("window.location.href = getUrl('jump/-/views/-/personals');",'5000');
                       // ;
                }else {
                    index.alertSelf(data.message);
                }
            },
            error: function(xhr, type){
                index.alertSelf('Ajax error!');
                // 即使加载出错，也得重置
                dropload.resetload();
            }
        });
    }
}