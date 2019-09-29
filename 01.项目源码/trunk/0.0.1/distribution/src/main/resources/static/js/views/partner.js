/** 页数 */
var pageNum = 0;

/** 每页加载个数 */
var pageSize = 15;
var agentId = sessionStorage['agentId'];
if(!agentId){
    agentId = 0;
}
$(function() {

    var dropload = $('#partnerList').dropload({
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
            // 拼接HTML
            var result = '';
            //var prostr = '{"agentId":"'+sessionStorage.getItem('agentId')+'","pageNo":"'+pageNum+'","pageSize":"'+pageSize+'"}';
            var prostr = '{"agentId":"'+agentId+'","pageNo":"'+pageNum+'","pageSize":"'+pageSize+'"}';
            $.ajax({
                type: 'POST',
                url: ctxPath + "obtainData/WD1001",
                timeout:8000,
                data : {
                    params : prostr
                },
                dataType: 'json',
                success: function(data){
                    var isHtml = "";
                    if(data!=null && (data.code==200 || data.code=='200') && data.data.success=='true'){
                        isHtml = getVideoHtml(data.data);
                        // 如果没有数据
                    }else{
                        $.tips({
                            content : '暂无好友信息',
                            stayTime : 2000,
                            type : "warn"
                        });
                    }


                    // 为了测试，延迟1秒加载
                    setTimeout(function(){
                        $('#partner_list').html(isHtml);
                        // 每次数据加载完，必须重置
                        dropload.resetload();
                        // 解锁loadDownFn里锁定的情况
                        dropload.unlock();
                        dropload.noData(false);
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
            pageNum++;
            // 拼接HTML
            var agentId = sessionStorage['agentId'];
            if(!agentId){
                agentId = 0;
            }
            //var prostr = '{"agentId":"'+sessionStorage.getItem('agentId')+'","pageNo":"'+pageNum+'","pageSize":"'+pageSize+'"}';
            var prostr = '{"agentId":"'+agentId+'","pageNo":"'+pageNum+'","pageSize":"'+pageSize+'"}';
            $.ajax({
                type: 'POST',
                url: ctxPath + "obtainData/WD1001",
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
                            content : '暂无好友信息',
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
                        $('#partner_list').append(isHtml);
                        // 每次数据加载完，必须重置
                        dropload.resetload();
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


/**
 * 将分页数据转为html
 * rows 分页数据
 */
function getVideoHtml(data) {
    var htmlContent = '';
    var rows = data.msg;
    var htmlContent = '';


    $.each(rows, function(id, item) {
        var agentName = item.agentName;
        if(agentName == undefined){
            agentName = '匿名';
        }
        var agentPhone = item.agentPhone;
        if(agentPhone == undefined){
            agentPhone = '';
        }
        if(id==0 && pageNum==1){
            agentName += '<span style="color:red;">(管理员)</span>';
        }else if(id==1 && pageNum==1){
            agentName += '<span style="color:#0000FF;">(自己)</span>';
        }
        htmlContent += '<p><span class="left"  style="width: 53%;display: inline-block;vertical-align: middle;">';
        if(item.headimgurl == undefined || item.headimgurl == '' || item.headimgurl == null){
            htmlContent += '<i class="logo"></i>';
        }else{
            htmlContent += '<img src="'+item.headimgurl+'" class="logo" />';
        }
        htmlContent += '<i style="margin-left: .1rem;">'+agentName+'</i></span>';
        htmlContent += '<span class="right">'+agentPhone+'</span></p>';
    });
    return htmlContent;
}