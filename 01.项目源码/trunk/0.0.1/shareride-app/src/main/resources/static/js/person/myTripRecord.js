$(function () {
    getMyTripRecord();
});

function toPayment(obj) {
    if(confirm("确认支付？")){
        $.ajax({
            type : "POST",
            url : getUrl("wxpay"),
            dataType : "json",
            data : {openid:openId},
            success : function(data) {
                //alert(JSON.stringify(data));
                pay(data);
            }
        });
    }
}

//查询我的坐车记录
function getMyTripRecord() {
    var userInfo = JSON.parse(sessionStorage["userInfo"]);
    var numUserId = userInfo.numUserId;
    var params = {};
    params.numUserId = numUserId;
    $.ajax({
        type:"post",
        url:getUrl("journey/getMyTripRecord"),
        dataType:"json",
        data:{params:JSON.stringify(params)},
        success:function(data){
            console.log(JSON.stringify(data));
            var htmlStr = ""
            $.each(data,function(index,v){
                htmlStr += '<li class="clear">'+
             '<div class="myTripListTabLi myTripCarImg">'+
             '<img src="img/car.jpg" alt="">'+
             '</div>'+
             '<div class="myTripListTabLi myTripCarMeg">'+
             '<span>'+v.start_city_name+'-'+v.end_city_name+'</span><br>'+
             '<span>'+v.VC_REAL_NAME+'</span><br>'+
             '<span>'+v.START_TIME+'</span>'+
             '</div>'+
             '<div class="myTripListTabLi myTripPeoPle">'+
             '<span>总人数:'+v.NUM_MAX_PASSENGERS+'</span><br>'+
             '<span>已付款:'+v.pay_sum+'</span><br>'+
             '<span>已预约:'+v.appointment_sum+'</span>'+
             '</div>'+
             '<div class="myTripListTabLi myTripMon">'+
             '<span>'+v.NUM_UNIT_PRICE+'元/人</span>'+
             '<br>';
              //支付状态  1：未支付；2：已支付
              var NUM_PAY_STATE = v.NUM_PAY_STATE;
              //1：预定；2：行驶中；3：已完成；4：取消
              var NUM_STATE = v.NUM_STATE;
              if(NUM_PAY_STATE==1){
                  htmlStr +='<button class="myTripEdit" onclick="toPayment('+v.NUM_NNT_USER_JOURNEY_ID+');">预支付</button></div></li>';
              }else {
                  htmlStr +='<button class="myTripEdit">已支付</button></div></li>';
              }

            });

            $('#getMyTripRecord').append(htmlStr);
        },
        error:function(){
            closeMsg();
        }
    });
}