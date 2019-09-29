/** 页数 */
var pageNum = 1;

/** 每页加载个数 */
var pageSize = 25;
var agentId = sessionStorage['agentId'];
if(!agentId){
    agentId = 0;
}
$(function() {

    var dropload = $('#dataPre').dropload({
        domUp : {
            domClass   : 'dropload-up',
            domRefresh : '<div class="dropload-refresh">↓下拉刷新</div>',
            domUpdate  : '<div class="dropload-update">↑释放更新</div>',
            domLoad    : '<div class="dropload-load"><span class="loading"></span>加载中...</div>'
        },
        domDown : {
            domClass   : 'dropload-down',
            domRefresh : '<div class="dropload-refresh">↑上拉加载更多</div>',
            domLoad    : '<div class="dropload-load"><span class="loading"></span>加载中...</div>',
            domNoData  : '<div class="dropload-noData">加载完成</div>'
        },
        loadUpFn : function(me){

            pageNum = 1;
            console.log("loadUpFn==============="+pageNum)
            // 拼接HTML
            var result = '';
            //var prostr = '{"agentId":"'+sessionStorage.getItem('agentId')+'","pageNo":"'+pageNum+'","pageSize":"'+pageSize+'"}';
            var prostr = '{"agentId":"'+agentId+'","pageNo":"'+pageNum+'","pageSize":"'+pageSize+'"}';
            $.ajax({
                type: 'POST',
                url: ctxPath + "obtainData/WD1006",
                timeout:8000,
                data : {
                    params : prostr
                },
                dataType: 'json',
                success: function(data){
                    var isHtml = "";
                    if(data!=null && (data.code==200 || data.code=='200') && data.data.success=='true'){
                        isHtml = getVideoHtml(data.data);

                    }else{
                        $.tips({
                            content : '暂无信息',
                            stayTime : 2000,
                            type : "warn"
                        });
                    }

                    $('#dataStr').html(isHtml);
                    pageNum++;
                    // 每次数据加载完，必须重置
                    dropload.resetload();
                    // 解锁loadDownFn里锁定的情况
                    dropload.unlock();
                    dropload.noData(false);
                    // 为了测试，延迟1秒加载
                    setTimeout(function(){

                    },1000);
                },
                error: function(xhr, type){
                    $.tips({
                        content : '加载失败，稍后重试！',
                        stayTime : 2000,
                        type : "warn"
                    });
                    // 即使加载出错，也得重置
                    dropload.resetload();
                }
            });
        },
        loadDownFn : function(me){
            console.log("loadDownFn==============="+pageNum)
            // 拼接HTML
            var agentId = sessionStorage['agentId'];
            if(!agentId){
                agentId = 0;
            }
            //var prostr = '{"agentId":"'+sessionStorage.getItem('agentId')+'","pageNo":"'+pageNum+'","pageSize":"'+pageSize+'"}';
            var prostr = '{"agentId":"'+agentId+'","pageNo":"'+pageNum+'","pageSize":"'+pageSize+'"}';
            $.ajax({
                type: 'POST',
                url: ctxPath + "obtainData/WD1006",
                timeout:8000,
                data : {
                    params : prostr
                },
                dataType: 'json',
                success: function(data){
                    var isHtml = '';
                    if(data!=null && (data.code==200 || data.code=='200') && data.data.success=='true'){
                        isHtml = getVideoHtml(data.data);
                        // 如果没有数据
                        if(data.data.msg.length < pageSize){
                            // 锁定
                            me.lock();
                            // 无数据
                            me.noData();
                        }
                    }else {
                        $.tips({
                            content : '暂无信息',
                            stayTime : 2000,
                            type : "warn"
                        });
                        // 锁定
                        me.lock();
                        // 无数据
                        me.noData();
                    }
                    // 为了测试，延迟1秒加载
                    setTimeout(function(){
                        $('#dataStr').append(isHtml);
                        pageNum++;
                        // 每次数据加载完，必须重置
                        me.resetload();
                    },1000);
                },
                error: function(xhr, type){
                    $.tips({
                        content : '加载失败，稍后重试！',
                        stayTime : 2000,
                        type : "warn"
                    });
                    // 即使加载出错，也得重置
                    dropload.resetload();
                }
            });
        },
        threshold : 50 // 什么作用
    });


});

function getIntegralSum() {
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
}
getIntegralSum();
/**
 * 将分页数据转为html
 * rows 分页数据
 */
function getVideoHtml(data) {
    var htmlContent = '';
    var rows = data.msg;
    var htmlContent = '';


    $.each(rows, function(id, item) {
        var xwz = '--';
        if(item.behavior==1 || item.behavior=='1'){
            xwz = '投保';
        }
        var isitem = item.createTime;
        if(isitem == undefined || isitem == 'undefined'){
            isitem = '--';
        }
        var pdName = item.pdName;
        if(pdName == undefined || pdName == 'undefined'){
            pdName = '--';
        }else if(pdName.length>9){
            pdName =pdName.substring(0,7) + '..';
        }
        htmlContent+='<div style="height: 0.9rem;line-height: 1rem;"><span style="width: 35%;display: inline-block;text-align: center;">'+isitem+'</span><span style="width: 35%;display: inline-block;text-align: center;">'+pdName+'</span><span style="width: 20%;display: inline-block;text-align: center;">'+xwz+'</span><span style="width: 10%;display: inline-block;text-align: center;">'+item.score+'</span></div>';
    });
    return htmlContent;
}