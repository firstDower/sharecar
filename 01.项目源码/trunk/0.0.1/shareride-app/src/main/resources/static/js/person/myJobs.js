$(function () {
    getMyJobs();
});
function getMyJobs() {
    var userInfo = JSON.parse(sessionStorage["userInfo"]);
    var numUserId = userInfo.numUserId;
    var params = {};
    params.numUserId = numUserId;
    $.ajax({
        type:"post",
        url:getUrl("journey/getMyJobs"),
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
                    '<span>'+(v.NUM_MANNED_TYPE=='1'?'车找人':'人找车')+'</span><br>'+
                    '<span>'+v.DAT_DEPART_DATE.substring(0, 10)+'</span>'+
                    '</div>'+
                    '<div class="myTripListTabLi myTripPeoPle">'+
                    '<span>总人数:'+v.NUM_MAX_PASSENGERS+'</span><br>'+
                    '<span>已付款:'+v.pay_sum+'</span><br>'+
                    '<span>已预约:'+v.appointment_sum+'</span>'+
                    '</div>'+
                    '<div class="myTripListTabLi myTripMon">'+
                    '<span>'+v.NUM_UNIT_PRICE+'元/人</span>'+
                    '<br>'+
                    '<button class="myTripEdit">编辑</button>'+
                    '</div>'+
                    '</li>';
            });

            $('#myJobsHtml').append(htmlStr);
        },
        error:function(){
            closeMsg();
        }
    });
}