$(function () {
    //初始化城市选择
    getTravelCityList();
    $('#creatTrip').click(creatTrip);
});

function creatTrip() {
    var params = {};
    var userInfo = JSON.parse(sessionStorage['userInfo']);
    params.numUserId = userInfo.numUserId;
    params.resPlace = $('#resPlace').val();
    params.tarPlace = $('#tarPlace').val();
    params.startTime = $('#startTime').val();
    params.passengers = trimAll($('#passengers').val());
    params.unitPrice = trimAll($('#unitPrice').val());
    params.mannedType=$("input[name='numMannedType']:checked").val();

    if(!validParams(params)){
        return false;
    }
    $.ajax({
        type:"post",
        url:getUrl("reposi/creatTrip"),
        dataType:"json",
        data:{params:JSON.stringify(params)},
        success:function(data){
            console.log(JSON.stringify(data));
            alert(data.msg);
            location.href = getUrl("goMyInfo");
        },
        error:function(){
            closeMsg();
        }
    });


}

function validParams(params) {
    if(!params.resPlace){
        alert("请选择出发城市！");
        return false;
    }
    if(!params.tarPlace){
        alert("请选择到达城市！");
        return false;
    }
    if(!params.startTime){
        alert("请选择出发时间！");
        return false;
    }
    if(!/^[1-6]$/.test(params.passengers)){
        alert("载客数必须在1~6！");
        return false;
    }
    if(!checkMoney(params.unitPrice)){
        alert("输入正确的单价！");
        return false;
    }
    return true;
}

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

    $("#startTime").val('').scroller('destroy').scroller($.extend(opt['datetime'], opt.default));
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