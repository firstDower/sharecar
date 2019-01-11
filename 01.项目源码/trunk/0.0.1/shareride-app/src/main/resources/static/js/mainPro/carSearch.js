$(function () {
    //初始化城市选择
    getTravelCityList();
    getUsersInfo();
});

function getTravelCityList() {
    $.ajax({
        type:"post",
        url:getUrl("reposi/getTravelCityList"),
        dataType:"json",
        success:function(data){
            var cityStr = '';
            $.each(data,function(index,value){
                cityStr += '<option value="'+value.numTravelCityId+'">'+value.vcCityName+'</option>'
            });
            $('#resPlace').append(cityStr);
            $('#tarPlace').append(cityStr);
            initPage();
        },
        error:function(){
            closeMsg();
        }
    });
}


function initPage() {
    var curr = new Date().getFullYear();
    var opt = {};
    opt.date = {preset: 'date'};
    opt.datetime = {
        preset: 'datetime',
        minDate: new Date(2012, 3, 10, 9, 22),
        maxDate: new Date(2014, 7, 30, 15, 44),
        stepMinute: 5
    };
    opt.time = {preset: 'time'};
    opt.tree_list = {preset: 'list', labels: ['Region', 'Country', 'City']};
    opt.image_text = {preset: 'list', labels: ['Cars']};
    opt.select = {preset: 'select'};

    var d = new Date();
    d.setMonth(d.getMonth() + 2);

    opt.default = {
        theme: 'android-ics light', //皮肤样式
        display: 'modal', //显示方式
        mode: 'scroller', //日期选择模式
        dateFormat: 'yyyy-mm-dd',
        dateOrder: 'yyyymmdd',
        lang: 'zh',
        //showNow: true,
        nowText: "今天",
        stepMinute: 5,
        startYear: curr, //开始年份
        endYear: curr + 100, //结束年份
        minDate: new Date(new Date().getTime()),
        maxDate: d,
        defaultValue: new Date(2018, 2, 9, 0),
        onSelect: function (value) {
        },
        onBeforeShow: function (event, inst) {
        },
        onCancel: function (inst) {
        },
        onMarkupReady: function (inst) {
        }
    };

    $("#yuYueTime").val('').scroller('destroy').scroller($.extend(opt['date'], opt.default));
    $("#resPlace").val('').scroller('destroy').scroller($.extend(opt['select'], opt.default));
    $("#tarPlace").val('').scroller('destroy').scroller($.extend(opt['select'], opt.default));
    initcss();
}
function initcss() {
    $('#resPlace_dummy,#tarPlace_dummy').css({
        'width':'40%',
        'float': 'left',
        'border':'1px solid #999',
        'height':'1.7rem',
        'line-height':'1.7rem',
        'font-size': '.75rem',
        'color':'#333'
    }).attr("placeholder","选择出发地");
    $('#tarPlace_dummy').css({
        'float': 'right'
    }).attr("placeholder","选择目的地");
}






function getUsersInfo(openId) {
    var openId = getQueryString("openId");
    if(!openId){
        openId = sessionStorage["openId"];
        if(!openId){
            openId = "o_1At0Te0Bq3R0VDOkGV6qrOay60";
        }
    }
    sessionStorage["openId"] = openId;
    $.ajax({
        type:"post",
        url:getUrl("reposi/getUserInfoByOpenid"),
        dataType:"json",
        data:{params:openId},
        success:function(data){
            console.log(data);
        },
        error:function(){
            closeMsg();
        }
    });
}