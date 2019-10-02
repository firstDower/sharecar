$(function() {
    var param = {};
    param.agentId = sessionStorage['agentId'];
    var prostr = JSON.stringify(param);
    $.ajax({
        type: 'POST',
        url: ctxPath + "obtainData/WD1003",
        timeout:8000,
        data : {
            params : prostr
        },
        dataType: 'json',
        success: function(data){
            var isHtml = "";
            if(data!=null && (data.code==200 || data.code=='200') && data.data.success=='true'){
                isHtml = getVideoHtml(data.data);
                $('#pread-list').append(isHtml);
                initHtml();
            }
        },
        error: function(xhr, type){

        }
    });

});


/**
 * 将分页数据转为html
 * rows 分页数据
 */
function getVideoHtml(data) {
    var htmlContent = '';
    var rows = data.msg;
    console.log("==========data.msg============="+JSON.stringify(data.msg));
    var htmlContent = '';
    var dataStorage = {};
    $.each(rows, function(id, item) {
        dataStorage[item.prdCode] = item;
        var prdName = item.prdName;
        if(prdName == undefined){
            prdName = '匿名';
        }
        var premium = item.premium;
        if(premium == undefined){
            premium = '0';
        }
        var urlStr = updateQueryStringParameter(item.prdPage,'agentId',sessionStorage['agentId']);
        //htmlContent += '<div class="items clear"><div  onclick="location=\''+urlStr+'\'" class="left">' +
        htmlContent += '<div class="items clear"><div class="left">' +
            '<img src="'+ctxPath+'display-img/'+item.prdIme+'" alt="" srcset=""/>' +
            '</div><div class="center"><h1>'+prdName+'</h1>' +
            '<h2>￥'+premium+'起 <i class="cdfeeI"> &nbsp;&nbsp;&nbsp;&nbsp;(出单费10%)</i></h2>' +
            '<p class="integral"><span>可得积分:<i>'+item.shouldCum+'</i>'+
            '</span><span>已得积分:<i>'+item.shouldCum+'</i></span></p><p>'+
            '<span>分享'+item.shareNum+'次</span> '+
            ' <span>查看'+item.vistitNum+'次</span> '+
            '<span>购买'+item.dealNum+'次</span></p>'+
            '</div><div class="right"><span prdCode="'+item.prdCode+'" class="shareBtn"></span></div></div>';
    });
    sessionStorage['dataStorage'] = JSON.stringify(dataStorage);
    return htmlContent;
}