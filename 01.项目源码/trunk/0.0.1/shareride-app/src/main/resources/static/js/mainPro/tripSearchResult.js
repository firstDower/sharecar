$(function () {
    showPage();
});
var showPage = function () {
    var tripSearchResult = stringToJson(sessionStorage['tripSearchResult']);
    var htmlStr = "";
    $.each(tripSearchResult,function(index,v){
        htmlStr += '<li class="clear">'+
        '<div class="ownerImg">'+
        '<img src="img/people.png" alt="">'+
        '</div>'+
        '<div class="ownerSelf">'+
        '<p>'+v.VC_REAL_NAME+'</p>'+
        '<span>'+v.VC_BRAND+'</span> <span>'+v.VC_CAR_NO+'</span> <br>'+
        '<span class="seekP">正在寻找乘客</span><span>剩余'+(Number(v.NUM_MAX_PASSENGERS)-Number(v.pay_sum))+'个座位</span>'+
        '</div>'+
        '<div class="carBegDet">'+
        '<button class="carBegDetBtn" NUM_ROUTE_ID="'+v.NUM_ROUTE_ID+'">详情</button>'+
        '</div>'+
        '</li>';
    });
    $('#searchTripList').append(htmlStr);
}