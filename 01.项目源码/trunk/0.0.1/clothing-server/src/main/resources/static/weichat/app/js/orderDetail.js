$(function () {
    orderDetail.init();
})
function pay(data){

    if (typeof WeixinJSBridge == "undefined"){
        if( document.addEventListener ){
            document.addEventListener('WeixinJSBridgeReady', onBridgeReady, false);
        }else if (document.attachEvent){
            document.attachEvent('WeixinJSBridgeReady', onBridgeReady);
            document.attachEvent('onWeixinJSBridgeReady', onBridgeReady);
        }
    }else{

        onBridgeReady(data);
    }

}
function onBridgeReady(data) {
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
                mui.toast("支付成功！");
                location.reload();
            }
        });
}
var orderDetail = {
    init:function () {
        orderDetail.initPage();
        orderDetail.initWeixin();
    },


    initWeixin:function () {
        $("#payButton").click(function () {
            var userInfo = JSON.parse(sessionStorage['userInfo']);
            var orderData = JSON.parse(sessionStorage['orderDetail']);
            var orderDetail = orderData.orderDetail;
            var param = {};
            param.numOrderId = orderDetail.numId;
            param.vcOrderNo = orderDetail.vcOrderNo;
            param.numUserId = userInfo.NUM_USER_ID;
            //商品金额
            param.numTotalFee = Number(orderDetail.numPrice)*Number(orderDetail.numNum);  //商品金额
            //实付金额
            param.numCashFee = Number($("#shifujine").html())*100;
            //优惠金额
            param.numDiscountFee =  Number($('#NUM_DISCOUNT_NUMBER').html())*100;
            param.useBalance =  Number($('#numUserMoney').html())*100;
            param.useCouponId = 1;
            param.useGroupBuyId = 0;
            param.useBargainId = 0;
            param.openId = userInfo.VC_OPENID;
            param.timeStamp = util.createTimeStamp();
            $.ajax({
                type : "POST",
                url : ctxPath + "securityService/weichatPayment",
                dataType : "json",
                data : param,
                headers: util.initHeaders(param),
                success : function(data) {
                    //alert(JSON.stringify(data));
                    console.log("支付返回结果"+JSON.stringify(data))
                    if(data.code==200){
                        mui.toast(data.msg);
                        pay(data.data);
                    }else {
                        mui.toast(data.msg);
                    }

                }
            });
        });
    },
    initPage:function () {
        var userInfo = JSON.parse(sessionStorage["userInfo"]);
        var userId = userInfo.NUM_USER_ID;
        var param = {};
        param.vcOrderNo = sessionStorage["vcOrderNo"];
        param.vcUserId = userId;
        param.timeStamp = util.createTimeStamp();
        $.ajax({
            type: 'POST',
            url: ctxPath + "securityService/getOrderDetail",
            timeout:8000,
            data : param,
            headers: util.initHeaders(param),
            dataType: 'json',
            success: function(data){
                console.log("========="+JSON.stringify(data));
                if(data.code==200){
                    //mui.toast("操作成功！");
                    sessionStorage["orderDetail"] = JSON.stringify(data.data);
                    orderDetail.showPage();
                }else {
                    mui.toast(data.msg);
                }
            },
            error: function(xhr, type){
            }
        });




    },
    showPage:function () {
        var orderDetailData = JSON.parse(sessionStorage["orderDetail"]);
        var orderData = orderDetailData.orderDetail;
        var userCoupons = orderDetailData.userCoupons;
        var userinfo = orderDetailData.userinfo;


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
        $("#numStateStr").html(numStateStr);
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
        $("#numPrice").html(Number(numPrice)/100);
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
        var numPayType = orderData.numPayType;
        //支付方式为，微信支付。订单未取消
        if(numPayType==2&&numState!=3){
            $(".weichatPayment").show();
            if(numPayState==1){
                var numUserMoney = Number(userinfo.numUserMoney)/100;
                $('#numUserMoney').html(numUserMoney);
                var userCoupon = 5;
                $('#NUM_DISCOUNT_NUMBER').html(userCoupon);
                var totalManay = Number(numPrice)/100*Number(numNum);
                $("#yiyouhuijine").html(userCoupon);
                $("#shifujine,#shifujine1").html((totalManay-numUserMoney-userCoupon).toFixed(2));
                $(".payment").show();
            }
            if(numPayState==2){
                var NUM_AMOUNT = Number(orderData.NUM_AMOUNT)/100;
                var NUM_DISCOUNT_NUMBER = Number(orderData.NUM_DISCOUNT_NUMBER)/100;
                $('#numUserMoney').html(NUM_AMOUNT);
                $('#NUM_DISCOUNT_NUMBER').html(NUM_DISCOUNT_NUMBER);

                var totalManay = Number(numPrice)/100*Number(numNum);
                $("#yiyouhuijine").html(NUM_AMOUNT);
                $("#shifujine,#shifujine1").html((totalManay-NUM_AMOUNT-NUM_DISCOUNT_NUMBER).toFixed(2));

                $(".payment").show();
            }
        }

        if(numPayState==1&&numState!=3&&numState!=7){
            $("#payButton").show();
        }

        if(numState==1){
            $(".stateBtn").show();
        }



        //==========================================================
        mui("body").on('tap', '.stateBtn', function (e) {
            var numId = orderData.numId;
            var param = {};
            param.NUM_ID = numId;
            param.NUM_STATE = 3;//取消订单：3
            orderDetail.updataOrder(param);
        });
    },
    updataOrder:function (obj) {
        var userInfo = JSON.parse(sessionStorage["userInfo"]);
        var userId = userInfo.NUM_USER_ID;
        var param = {};
        param.VC_USER_ID = userId;
        param.NUM_ID = obj.NUM_ID;
        var NUM_STATE = obj.NUM_STATE;
        if(NUM_STATE){
            param.NUM_STATE = NUM_STATE;
        }
        param.timeStamp = util.createTimeStamp();
        $.ajax({
            type: 'POST',
            url: ctxPath + "securityService/updateProduct",
            timeout:8000,
            data : param,
            headers: util.initHeaders(param),
            dataType: 'json',
            success: function(data){
                console.log("========="+JSON.stringify(data));
                if(data.code==200){
                    mui.toast("操作成功！");
                    location.reload();
                }else {
                    mui.toast(data.msg);
                }
            },
            error: function(xhr, type){
            }
        });
    }
}