$(function () {
    orderList.init();
})
var pageNo = 1,pageSize=10;
var falg = false;
var pageData = {'NUM_STATE':''};
var orderList = {
    init:function () {
        mui.init({
            pullRefresh: {
                container: '#pullrefresh',
                down : {
                    height:50,//可选,默认50.触发下拉刷新拖动距离,
                    auto: false,//可选,默认false.首次加载自动下拉刷新一次
                    contentdown : "下拉可以刷新",//可选，在下拉可刷新状态时，下拉刷新控件上显示的标题内容
                    contentover : "释放立即刷新",//可选，在释放可刷新状态时，下拉刷新控件上显示的标题内容
                    contentrefresh : "正在刷新...",//可选，正在刷新状态时，下拉刷新控件上显示的标题内容
                    callback :orderList.pulldownRefresh  //必选，刷新函数，根据具体业务来编写，比如通过ajax从服务器获取新数据；
                },
                up: {
                    height: 50, //可选.默认50.触发上拉加载拖动距离
                    auto: true, //可选,默认false.自动上拉加载一次
                    contentrefresh: "正在加载...", //可选，正在加载状态时，上拉加载控件上显示的标题内容
                    contentnomore: '没有更多数据了', //可选，请求完毕若没有更多数据时显示的提醒内容；
                    callback: orderList.pullupRefresh
                }
            }
        });

        $(".mui-control-item").click(function () {
            var NUM_STATE = $(this).attr("NUM_STATE");
            pageData.NUM_STATE = NUM_STATE;
            $("#dataUl").html("");
            pageNo=1;
            falg = false;
            mui('#pullrefresh').pullRefresh().refresh(true);
            orderList.getOrderData();
        })
        mui("#pullrefresh").on('tap', '.mui-table-view-cell', function () {
            var numId = $(this).attr('numId');
            var orderData = $(this).attr('orderData');
            sessionStorage["vcOrderNo"] = JSON.parse(orderData).vcOrderNo;
            //location.href= ctxPath + 'jump/weichat/orderDetail';
            mui.openWindow({
                url:ctxPath + 'jump/weichat/orderDetail',
                id: "orderDetail",//详情页webview的id
                show: {
                    aniShow: 'none', //页面不显示动画
                    duration: '0' //
                }
            });
        });
        mui("#pullrefresh").on('tap', '.mui-btn', function (e) {
            e.stopPropagation();
            var numId = $(this).parents('.mui-table-view-cell').attr('numId');
            var param = {};
            param.NUM_ID = numId;
            param.NUM_STATE = 3;//取消订单：3
            orderList.updataOrder(param);
        });
    },
    pulldownRefresh:function () {
        $("#dataUl").html("");
        pageNo=1;
        orderList.getOrderData();
    },
    pullupRefresh:function () {
        orderList.getOrderData();
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
                }else {
                    mui.toast(data.msg);
                }
            },
            error: function(xhr, type){
            }
        });
    },
    getOrderData:function () {
        var userInfo = JSON.parse(sessionStorage["userInfo"]);
        var userId = userInfo.NUM_USER_ID;
        var param = {};
        param.VC_USER_ID = userId;
        param.pageNum = pageNo;
        param.pageSize = pageSize;
        $.extend(param, pageData);
        param.timeStamp = util.createTimeStamp();
        $.ajax({
            type: 'POST',
            url: ctxPath + "securityService/queryProductPage",
            timeout:8000,
            data : param,
            headers: util.initHeaders(param),
            dataType: 'json',
            success: function(data){
                console.log("========="+JSON.stringify(data));
                if(data.code==200){
                    var list = data.data.list;
                    pageNo++;
                    if(list.length<pageSize){
                        falg = true;
                    }
                    orderList.showPage(list);
                    mui('#pullrefresh').pullRefresh().endPulldownToRefresh();
                    mui('#pullrefresh').pullRefresh().endPullupToRefresh(falg);
                }else {

                }
            },
            error: function(xhr, type){
            }
        });
    },
    showPage:function (data) {
        var htmlStr = "";
        $.each(data,function (index,item) {
            var numParType = item.numParType;
            var numParTypeStr = "";
            if(numParType==1){
                numParTypeStr = "定制"
            }else if(numParType==2){
                numParTypeStr = "修改"
            }
            var numType = item.numType;
            var numTypeStr = "";
            if(numType==1){
                numTypeStr = "校服裤"
            }else if(numType==2){
                numTypeStr = "半袖"
            }
            var numState = item.numState;
            var numStateStr = "";
            if(numState==1){
                numStateStr = "已预约"
            }else if(numState==2){
                numStateStr = "确定制作"
            }else if(numState==3){
                numStateStr = "取消"
            }else if(numState==4){
                numStateStr = "制作完成"
            }else if(numState==5){
                numStateStr = "待取货"
            }else if(numState==6){
                numStateStr = "制作修改"
            }else if(numState==7){
                numStateStr = "已完成"
            }

            var numPayState = item.numPayState;
            var numPayStateStr = "待支付";
            if(numPayState==1){
                numPayStateStr = "待支付";
            }else if(numPayState==2){
                numPayStateStr = "待付款";
            }else if(numPayState==3){
                numPayStateStr = "已支付";
            }

            /*htmlStr +=
                '<li class="mui-table-view-cell" orderData=\''+JSON.stringify(item)+'\' numId="'+item.numId+'"><div>'+
                '<img class="mui-media-object mui-pull-left" src="'+ctxPath+'weichat/app/img/4.jpg">'+
                '<div class="mui-media-body">'+
                '<p class="mui-ellipsis"><span>'+numParTypeStr+numTypeStr+'</span><span class="mui-text-right">&nbsp&nbsp&nbsp&nbsp&nbsp'+numStateStr+'</span>';
                    if(item.numState == 1){
                        htmlStr +='<button type="button" class="mui-btn" style="float: right;">取消</button>' ;
                    }
            htmlStr +='</p>'+
                '<p class="mui-ellipsis"><span>'+item.vcName+'</span></p>'+
                '<p class="mui-ellipsis"><span>'+item.datCreatTime+'</span><button type="button" class="mui-btn" style="float: right;">去支付</butten></p>'+
                '</div>'+
                '</div></li>';*/


            htmlStr += '<li class="mui-table-view-cell mui-media"  orderData=\''+JSON.stringify(item)+'\' numId="'+item.numId+'">'+
            '<a href="javascript:;" data-guid="5310906" class="">'+
            '<img src="'+ctxPath+'weichat/app/img/4.jpg" class="mui-media-object mui-pull-left">'+
            '<div class="meta-info-up">'+
            '<div class="author"><span>'+item.vcName+'</span> <span>'+numParTypeStr+numTypeStr+'</span></div>'+
            '<div class="time">'+numPayStateStr+' ， '+numStateStr+'</div>'+
            '</div>'+
            '<div class="meta-info-right">'+
            '<div class="button">';
            /*if(item.numState == 1&&numPayState!=3){
                htmlStr += '<button type="button" class="mui-btn" style="float: right;">取消</butten>' ;
            }*/
            htmlStr +=  '</div>'+
            '</div>'+
            '<div class="meta-info">'+
            '<div class="author">2020-07-29 13:32:55</div>'+
            '<div class="time"></div>'+
            '</div>'+
            '</a>'+
            '</li>';

        })
        $("#dataUl").append(htmlStr);
    }
}