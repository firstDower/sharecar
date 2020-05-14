$(function () {
    getRouteDetailById();
    $('#subscribeTrip').click(subscribeTrip);
});

//防止重复提交
var perventRepeatSub = function () {
    alert("行程已预约成功，可以去个人中心查看！");
}
//预约行程
var subscribeTrip = function () {
    $("#subscribeTrip").unbind();
    $('#subscribeTrip').click(perventRepeatSub);
    var numUserId = stringToJson(sessionStorage['userInfo']).numUserId;
    var numRouteId = sessionStorage['NUM_ROUTE_ID'];
    var params = {};
    params.numRouteId = numRouteId;
    params.numUserId = numUserId;
    $.ajax({
        type:"post",
        url:getUrl("journey/subscribeTrip"),
        dataType:"json",
        data:{params:JSON.stringify(params)},
        success:function(data){
            alert(data.msg);
            console.log(JSON.stringify(data));
        },
        error:function(){
            closeMsg();
        }
    });
}

//获取行程详情
function getRouteDetailById() {
    var params = {};
    params.numRouteId = sessionStorage["NUM_ROUTE_ID"];
    $.ajax({
        type:"post",
        url:getUrl("journey/getRouteDetailById"),
        dataType:"json",
        data:{params:JSON.stringify(params)},
        success:function(data){
            console.log(JSON.stringify(data));
            showPage(data)
        },
        error:function(){
            closeMsg();
        }
    });
}

function showPage(obj) {
    //车牌号
    $("#VC_CAR_NO").html(obj.VC_CAR_NO);
    //车辆品牌
    $("#VC_BRAND").html(obj.VC_BRAND);
    //车颜色
    $("#VC_CAR_COLOR").html(obj.VC_CAR_COLOR);
    //车主姓名
    $("#VC_REAL_NAME").html(obj.VC_REAL_NAME);
    //开始城市
    $('#start_city_name').html(obj.start_city_name);
    //目的城市
    $("#end_city_name").html(obj.end_city_name);
    //单价
    $("#NUM_UNIT_PRICE").html(obj.NUM_UNIT_PRICE);
    //发车时间
    $("#START_TIME").html(obj.START_TIME);
    //剩余座位数
    $("#remainSeats").html(Number(obj.NUM_MAX_PASSENGERS)-Number(obj.pay_sum));
}