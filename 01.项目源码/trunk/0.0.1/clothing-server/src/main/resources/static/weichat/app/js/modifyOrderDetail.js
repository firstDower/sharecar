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
        document.getElementById("promptBtn").addEventListener('tap', function(e) {
            e.detail.gesture.preventDefault(); //修复iOS 8.x平台存在的bug，使用plus.nativeUI.prompt会造成输入法闪一下又没了
            var btnArray = ['取消', '确定'];
            mui.prompt('请输入订单价格：', '修改价格', '价格', btnArray, function(e) {
                if (e.index == 1) {
                    console.log(e.value);
                    $("#goodsPrice").html(e.value);
                    var NUM_PRICE = e.value;
                    NUM_PRICE = NUM_PRICE.trim();
                    if(!checkMoney(NUM_PRICE)){
                        mui.toast("输入金额有误！")
                        return false;
                    }
                    var orderDetailData = JSON.parse(sessionStorage['orderDetail']);

                    var param = {};
                    param.NUM_ID = orderDetailData.orderDetail.numId;
                    param.NUM_PRICE = util.getNumber(Number(NUM_PRICE)*100);//取消订单：3
                    orderDetail.updataOrder(param);






                    location.reload();
                } else {

                }
            })
        });

        $("#payButton").click(function () {



            var userInfo = JSON.parse(sessionStorage['userInfo']);
            var orderData = JSON.parse(sessionStorage['orderDetail']);
            var pageData = JSON.parse(sessionStorage["pageData"]);
            var orderDetail = orderData.orderDetail;
            var param = {};
            param.numOrderId = orderDetail.numId;
            param.vcOrderNo = orderDetail.vcOrderNo;
            param.numUserId = userInfo.NUM_USER_ID;
            //商品金额
            param.numTotalFee = util.getNumber(Number(orderDetail.numPrice)*Number(orderDetail.numNum));  //商品金额


            var btnArray = ['否', '是'];
            mui.confirm('确认该订单的商品金额是：'+util.getNumber(Number(param.numTotalFee)/100) , '确认', btnArray, function(e) {
                if (e.index == 1) {
                    //实付金额
                    param.numCashFee = util.getNumber(Number($("#shifujine").html())*100);
                    //优惠金额
                    param.numDiscountFee =  util.getNumber(Number($('#NUM_DISCOUNT_NUMBER').html())*100);
                    param.useBalance =  Number($('#numUserMoney').html())*100;
                    param.useCouponId = pageData.useCouponId;
                    param.useGroupBuyId = pageData.useGroupBuyId;
                    param.useBargainId = pageData.useBargainId;
                    param.openId = sessionStorage['openId'];
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
                                //mui.toast(data.msg);

                                if(param.numCashFee==0){
                                    mui.toast("支付成功！");
                                    location.reload();
                                }else {
                                    pay(data.data);
                                }
                            }else {
                                mui.toast(data.msg);
                            }

                        }
                    });
                } else {
                    mui.toast('修改价格后支付！');
                }
            })



        });
    },
    initPage:function () {
        var pageData = {};
        pageData.useCouponId = 0;
        pageData.useGroupBuyId = 0;
        pageData.useBargainId = 0;
        sessionStorage["pageData"] = JSON.stringify(pageData);
        mui.init();
        mui('.mui-scroll-wrapper').scroll();
        mui('body').on('hidden', '.mui-popover', function (e) {
            //checkbox1
            var checkbox1 = $("input[name='checkbox1']:checked").val();
            var dataNumber = $("input[name='checkbox1']:checked").attr("dataNumber");
            if(!checkbox1){
                checkbox1 = 0;dataNumber = 0;
            }
            console.log(checkbox1, dataNumber);//detail为当前popover元素
            $("#NUM_DISCOUNT_NUMBER").val(Number(dataNumber)/100);
            orderDetail.showMoneyHtml(Number(dataNumber)/100);
            var pageData = JSON.parse(sessionStorage["pageData"]);
            pageData.useCouponId = checkbox1;
            sessionStorage["pageData"] = JSON.stringify(pageData);
        });

        //弹出层确定按钮！
        mui("body").on('tap','#openPopover',function(){
            mui('.mui-popover').popover('toggle');
        })
        //openPopoverFalse
        mui("body").on('tap','#openPopoverFalse',function(){
            $("input[name='checkbox1']").prop('checked',false);
            //mui('.mui-popover').popover('toggle');
        })
       //mui只能点击一次
       /* $("#openPopoverFalse").click(function () {
            console.log("openPopoverFalse::click")
            //$("input[name='checkbox1']").attr("checked",false);  //只有第一次有效
            $("input[name='checkbox1']").prop('checked',false);
        })*/
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
    showUserCoupons:function (userCoupons) {
        var userCouponLiStr = "";
        if(userCoupons.length==0){
            $("#userCouponLiStrA");
            mui("body").off("tap","#userCouponLiStrA");


            return false;
        }else {
            mui("body").on('tap','#userCouponLiStrA',function(){
                mui('.mui-popover').popover('toggle');
            })
        }
        mui.each(userCoupons,function(index,item){
            var NUM_ID = item.NUM_ID;
            var DAT_CREAT_DATE = item.DAT_CREAT_DATE;
            var DAT_END_DATE = item.DAT_END_DATE;
            var NUM_DISCOUNT_NUMBER = item.NUM_DISCOUNT_NUMBER;
            var NUM_LIMIT_PRICE = item.NUM_LIMIT_PRICE;
            userCouponLiStr += '<li class="mui-table-view-cell">'+
                '<div class="mui-inline mui-btn-primary">'+
                '<div class="mui-content-padded">'+
                '<div class="mui-card-content">'+
                '<div class="mui-text-center">￥'+Number(NUM_DISCOUNT_NUMBER)/100+'元</div>'+
                '<div class="mui-text-center">满'+ Number(NUM_LIMIT_PRICE)/100 +'元可用</div>'+   //NUM_LIMIT_PRICE
                '</div>'+
                '</div>'+
                '</div>'+
                '<div class="mui-inline">'+
                '<div class="mui-content-padded">'+
                '<div class="mui-card-content">'+
                '<div class="mui-text-left">羚猩制衣</div>'+
                '<div class="mui-text-center">'+DAT_CREAT_DATE.substring(0,10)+'-'+DAT_END_DATE.substring(0,10)+'</div>'+
                '</div>'+
                '</div>'+
                '</div>'+
                '<div class="mui-inline">'+
                '<div class="mui-content-padded">'+
                '<div class="mui-card-content mui-radio mui-left">'+
                '<input name="checkbox1" dataNumber="'+NUM_DISCOUNT_NUMBER+'" value="'+NUM_ID+'" type="radio">'+
                '</div>'+
                '</div>'+
                '</div>'+
                '</li>';
        })
        $("#userCouponLiStr").html(userCouponLiStr);
        $("input[name='checkbox1']").eq(0).attr("checked","checked")
    },
    showPage:function () {
        var orderDetailData = JSON.parse(sessionStorage["orderDetail"]);
        var orderData = orderDetailData.orderDetail;
        var userCoupons = orderDetailData.userCoupons;
        var userinfo = orderDetailData.userinfo;

        orderDetail.showUserCoupons(userCoupons);
        //***************************
        var datCreatTime = orderData.datCreatTime;
        $("#datCreatTime").html(datCreatTime);
        var datUpdateTime = orderData.datUpdateTime;
        $("#datUpdateTime").html(datUpdateTime);

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
        var vcSchoolName = orderData.VC_SCHOOL_NAME;
        $("#vcSchoolName").html(vcSchoolName);
        var vcModelName = orderData.VC_MODEL_NAME;
        $("#vcModelName").html(vcModelName);
        var vcGradeName = orderData.VC_GRADE_NAME;
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
            $(".notMOdifyLi").show();
            numParTypeStr = "定制"
        }else if(numParType==2){
            $(".notMOdifyLi").show();
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
        var NUM_CASH_FEE = orderData.NUM_CASH_FEE;
        if(numPayState==5){
            //$("#erchantsmSetPrice").html("等待商家设置价格或者选择线下支付");
        }
        var numPayStateStr = "待支付";
        if(numPayState==1){
            numPayStateStr = "待支付";
        }else if(numPayState==2){
            numPayStateStr = "待付款";
        }else if(numPayState==3){
            numPayStateStr = "已支付";
        }
        //支付价格=商品价格*数量
        $("#numPayPrice").html(Number(numPrice)/100*Number(numNum));
        $("#numPayStateStr").html(numPayStateStr);

        var numPayTypeStr = "微信支付";
        if(numPayType==1){
            numPayTypeStr = "线下支付";
        }else {
            numPayTypeStr = "微信支付";
        }
        $("#numPayTypeStr").html(numPayTypeStr);



        //支付方式为，微信支付。订单未取消
        if(numPayType==2&&numState!=3&&(numPayState==1||numPayState==2||numPayState==3)){
            $(".weichatPayment").show();
            if(numPayState==1){
                var numUserMoney = Number(userinfo.numUserMoney)/100;
                $("#numUserMoneyTotal").html(numUserMoney);
                $(".numUserMoneyTotal").show();
                orderDetail.showMoneyHtml(0);
                $(".payment,.promptBtnLi").show();
            }
            if(numPayState==2){
                var NUM_AMOUNT = 0;
                var NUM_DISCOUNT_NUMBER = 0;
                if(orderData.NUM_AMOUNT){
                    NUM_AMOUNT = Number(orderData.NUM_AMOUNT)/100;
                }
                if(orderData.NUM_DISCOUNT_NUMBER){
                    NUM_DISCOUNT_NUMBER = Number(orderData.NUM_DISCOUNT_NUMBER)/100;
                }
                $('#numUserMoney').html(NUM_AMOUNT);
                $('#NUM_DISCOUNT_NUMBER').html(NUM_DISCOUNT_NUMBER);

                var totalManay = Number(numPrice)/100*Number(numNum);
                $("#yiyouhuijine").html(NUM_DISCOUNT_NUMBER);
                $("#numPayPrice,#shifujine,#shifujine1").html((totalManay-NUM_AMOUNT-NUM_DISCOUNT_NUMBER).toFixed(2));

                $(".payment").show();
                mui("body").off("tap","#userCouponLiStrA");
            }
            if(numPayState==3){
                var NUM_AMOUNT = 0;
                var NUM_DISCOUNT_NUMBER = 0;
                if(orderData.NUM_AMOUNT){
                    NUM_AMOUNT = Number(orderData.NUM_AMOUNT)/100;
                }
                if(orderData.NUM_DISCOUNT_NUMBER){
                    NUM_DISCOUNT_NUMBER = Number(orderData.NUM_DISCOUNT_NUMBER)/100;
                }
                $('#numUserMoney').html(NUM_AMOUNT);
                $('#NUM_DISCOUNT_NUMBER').html(NUM_DISCOUNT_NUMBER);
                var totalManay = Number(numPrice)/100*Number(numNum);
                $("#yiyouhuijine").html(NUM_DISCOUNT_NUMBER);
                $("#numPayPrice,#shifujine,#shifujine1").html((totalManay-NUM_AMOUNT-NUM_DISCOUNT_NUMBER).toFixed(2));
                //orderDetail.showMoneyHtml(0);
                mui("body").off("tap","#userCouponLiStrA");
            }
        }

        if(numPayState==1&&numState!=3&&numState!=7){
            $("#payButton").show();
        }

        if(numState==1&&numState!=3&&numPayState!=3){
            $(".stateBtn").show();
        }



        //==========================================================
        mui("body").on('tap', '.stateBtn', function (e) {
            var numId = orderData.numId;
            var param = {};
            param.vcOrderNo = vcOrderNo;
            orderDetail.cancelOrder(param);
            /*param.NUM_ID = numId;
            param.NUM_STATE = 3;//取消订单：3
            orderDetail.updataOrder(param);*/
        });
    },
    showMoneyHtml:function (userCoupon) {
        var orderDetailData = JSON.parse(sessionStorage["orderDetail"]);
        var orderData = orderDetailData.orderDetail;
        var userinfo = orderDetailData.userinfo;
        var numPrice = orderData.numPrice;
        var numNum = orderData.numNum;
        var numUserMoney = Number(userinfo.numUserMoney)/100;;
        var totalManay = Number(numPrice)/100*Number(numNum);
        if(totalManay-userCoupon<=numUserMoney){
            $('#numUserMoney').html(totalManay-userCoupon);
        }else {
            $('#numUserMoney').html(numUserMoney);
        }

        $('#NUM_DISCOUNT_NUMBER,#yiyouhuijine').html(userCoupon);
        var shifujine = (totalManay-numUserMoney-userCoupon).toFixed(2);
        if(shifujine<0){
            shifujine = 0
        }
        $("#shifujine,#shifujine1").html(Number(shifujine).toFixed(2));
    },
    updataOrder:function (param) {
        param.timeStamp = util.createTimeStamp();
        console.log(JSON.stringify(param));
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
    },
    cancelOrder:function (obj) {
        var param = {};
        param.vcOrderNo = obj.vcOrderNo;
        param.timeStamp = util.createTimeStamp();
        $.ajax({
            type: 'POST',
            url: ctxPath + "securityService/cancelOrder",
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