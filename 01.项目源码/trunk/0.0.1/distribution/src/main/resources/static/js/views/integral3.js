
$(function() {
    integral.initPage();
})
var page=1; //当前页的页码
var pageSize=25;
var flagNoData = false; //false
var allpage; //总页码，会从后台获取
var is_extending = false; //防止连续加载
var integral = {
    initPage:function () {
        $('#dataStr').dropload({
            scrollArea : window,
            loadUpFn : function (me) {
                console.log("==========loadUpFn=============");
                me.resetload();
            }
        });

        console.log('=======================initPage:')
        integral.getIntegralSum();
        $(window).bind("scroll",integral.scrollFn);    //绑定滚动事件
        integral.getIntegralPage(page);

    },
    getIntegralSum:function () {
        console.log('=======================getIntegralSum:')
        var param = {};
        param.agentId = sessionStorage['agentId'];
        var prostr = JSON.stringify(param);
        $.ajax({
            type: 'POST',
            url: ctxPath + "obtainData/WD1005",
            timeout:8000,
            data : {
                params : prostr
            },
            dataType: 'json',
            success: function(data){
                console.log(JSON.stringify(data));
                if(data!=null && data.code==200 && data.data.success=='true'){
                    var msg = data.data.msg;
                    $("#integralSum").html(msg);
                }

            },
            error: function(xhr, type){

            }
        });
    },
    getIntegralPage:function () {
        console.log('=======================getIntegralPage:')
        var param = {};
        param.agentId = sessionStorage['agentId'];
        param.pageNo = page;
        param.pageSize = pageSize;
        var prostr = JSON.stringify(param);
        $.ajax({
            type: 'POST',
            url: ctxPath + "obtainData/WD1006",
            timeout:8000,
            data : {
                params : prostr
            },
            dataType: 'json',
            success: function(data){


                if(data!=null && (data.code==200 || data.code=='200') && data.data.success=='true') {
                    if(data.data.msg.length<pageSize){
                        flagNoData=true;
                        console.log("============flagNoData="+flagNoData);
                    }
                    var isHtml = integral.showHtml(data.data);
                    $('#dataStr').append(isHtml);
                    is_extending = true;
                }
                page += 1;

            },
            error: function(xhr, type){
                console.log(JSON.stringify(data));
            }
        });
    },
    showHtml:function (data) {
        console.log('=======================showHtml:')
        var htmlContent = '';
        var rows = data.msg;


        $.each(rows, function(id, item) {
            var xwz = '未知';
            if(item.behavior==1 || item.behavior=='1'){
                xwz = '投保';
            }
            htmlContent+='<div style="height: 0.9rem;line-height: 1rem;"><span style="width: 35%;display: inline-block;text-align: center;">'+(item.hasOwnProperty("createTime")?item.createTime:"")+'</span><span style="width: 30%;display: inline-block;text-align: center;">'+item.pdName+'</span><span style="width: 25%;display: inline-block;text-align: center;">'+xwz+'</span><span style="width: 10%;display: inline-block;text-align: center;">'+item.score+'</span></div>';
        });
        return htmlContent;
    }
};