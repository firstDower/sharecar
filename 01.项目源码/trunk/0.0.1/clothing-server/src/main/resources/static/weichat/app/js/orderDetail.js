$(function () {
    orderDetail.init();
})
var orderDetail = {
    init:function () {
        orderDetail.initPage();
        orderDetail.initWeixin();
    },
    onBridgeReady:function (data) {
        WeixinJSBridge.invoke(
            'getBrandWCPayRequest', {
                "appId":data.appId,     //公众号名称，由商户传入
                "timeStamp":data.timeStamp,         //时间戳，自1970年以来的秒数
                "nonceStr":data.nonceStr, //随机串
                "package":data.package,
                "signType":data.signType,         //微信签名方式：
                "paySign":data.paySign //微信签名
            },
            function(res){
                if(res.err_msg == "get_brand_wcpay_request:ok" ){
                    alert("支付成功！");
                }
            });
    },
    pay:function(data){

        if (typeof WeixinJSBridge == "undefined"){
            if( document.addEventListener ){
                document.addEventListener('WeixinJSBridgeReady', onBridgeReady, false);
            }else if (document.attachEvent){
                document.attachEvent('WeixinJSBridgeReady', onBridgeReady);
                document.attachEvent('onWeixinJSBridgeReady', onBridgeReady);
            }
        }else{

            orderDetail.onBridgeReady(data);
        }

    },
    initWeixin:function () {
        var orderData = JSON.parse(sessionStorage['orderData']);
        var numId = orderData.numId;
        var userInfo = JSON.parse(sessionStorage['userInfo']);
        var VC_OPENID = userInfo.VC_OPENID;
        $("#payButton").click(function () {
            $.ajax({
                type : "POST",
                url : ctxPath + "weichat/wxpay",
                dataType : "json",
                data : {numId:numId,openId:VC_OPENID},
                success : function(data) {
                    alert(JSON.stringify(data));
                    orderDetail.pay(data);
                }
            });
        });
    },
    initPage:function () {
        var orderData = JSON.parse(sessionStorage['orderData']);
        var numId = orderData.numId;
        var datCreatTime = orderData.datCreatTime;
        $("#datCreatTime").html(datCreatTime);
        var datUpdateTime = orderData.datUpdateTime;
        $("#datUpdateTime").html(datUpdateTime);
        var vcSchoolName = orderData.vcSchoolName;

        $("#vcSchoolName").html(vcSchoolName);
        var vcPhone = orderData.vcPhone;
        $("#vcPhone").html(vcPhone);
        var numState = orderData.numState;
        var numStateStr = "";
        if(numState==1){
            numStateStr = "已预约"
        }else if(numState==2){
            numStateStr = "确认制作"
        }else if(numState==3){
            numStateStr = "取消制作"
        }else if(numState==4){
            numStateStr = "制作完成"
        }else if(numState==5){
            numStateStr = "通知取货"
        }else if(numState==6){
            numStateStr = "制作修改"
        }else if(numState==7){
            numStateStr = "完成"
        }
        $("#numState").html(numStateStr)
        var vcName = orderData.vcName;
        $("#vcName").html(vcName);
        var vcModelName = orderData.vcModelName;
        $("#vcModelName").html(vcModelName);
        var vcGradeName = orderData.vcGradeName;
        $("#vcGradeName").html(vcGradeName);
        var vcHight = orderData.vcHight;
        $("#vcHight").html(vcHight);
        var vcWight = orderData.vcWight;
        $("#vcWight").html(vcWight);
        var numPrice = orderData.numPrice;
        $("#numPrice").html(numPrice);
        var numNum = orderData.numNum;
        $("#numNum").html(numNum);
        var vcNotes = orderData.vcNotes;
        $("#vcNotes").html(vcNotes);
        var numParType = orderData.numParType;
        var numParTypeStr = "";
        if(numParType==1){
            numParTypeStr = "定制"
        }else if(numParType==2){
            numParTypeStr = "修改"
        }
        $("#numParTypeStr").html(numParTypeStr);
        var vcOrderNo = orderData.vcOrderNo;
        $("#vcOrderNo").html(vcOrderNo);
        var numType = orderData.numType;
        var numTypeStr = "";
        if(numType==1){
            numTypeStr = "校服裤"
        }else if(numType==2){
            numTypeStr = "半袖"
        }
        $("#numType").html(numTypeStr)
        var numPayState = orderData.numPayState;
        if(numPayState==1&&numState!=3&&numState!=7){
            $("#payButton").show();
        }

    }
}