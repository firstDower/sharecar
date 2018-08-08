function getUrl(url){

    //return "http://localhost:8102/"+url;
    //return "http://192.168.99.143:8080/yingda.app.web/"+url;
    //return "http://testcarins.huanlebaoxian.cn/yingda.app.web/"+url;
    return "http://dhtest.tiancaibaoxian.com/"+url;
}

function getPayUrl(obj) {
    return "http://zhcx.4009006666.cn:2046/ae/insure/weixinPay?orderNo="+obj+"&ds=03";
}
//判断是否微信登陆
$(document).ready(function() {
    //禁止浏览器访问
    /*var ua = window.navigator.userAgent;
     if(ua.indexOf("MicroMessenger")<=0&&ua.indexOf("Windows Phone")<=0){
     location.href=getUrl("error.html");
     }*/

    var ua2 = window.navigator.userAgent.toLowerCase();
    if (ua2.match(/MicroMessenger/i) == 'micromessenger') {
        $(".navtit").hide();
    }
    //ajax设置
    $.ajaxSetup( {
        //设置ajax请求结束后的执行动作
        complete: function(XMLHttpRequest, textStatus) {
            // 通过XMLHttpRequest取得响应头，sessionstatus
            var sessionstatus = XMLHttpRequest.getResponseHeader("sessionStatus");
            if(sessionstatus=="timeout"){
                showMessage("用户长时间未操作，请重新进入车险首页！");
                setTimeout(redirectUrl,5000);
            }
        }
    });

    $('.popbox article .mqd').click(function () {
        $('.lady').hide();
        $('.popbox').hide();
    })
});

function redirectUrl(){
    var win = window;
    while (win != win.top){
        win = win.top;
    }
    win.location.href= getUrl("ajax/content/record/carInfo.html");
}


/**
 * 访问图片地址
 * @param url
 * @returns
 */
function getImgUrl(url){
    return "http://localhost:8080/"+url;
    //return "http://testcarins.huanlebaoxian.cn/"+url;
    //return "http://chexian.huanlebaoxian.cn/"+url;
}

/**
 * 信息提示框（带确定、取消按钮）
 * @param message
 */
function showMessageConfirm(message){
    $('.lady').show();
    $('.popboxconfirm').show();
    $('#confirmmessageId').html(message);
    $('.popboxconfirm article .mqd').click(function () {
        $('.lady').hide();
        $('.popboxconfirm').hide();
    })
}

/**
 * 信息提示框（带确定按钮）
 * @param message
 */
function showMessage(message){
    $('.lady').css("display","inline");
    $('.popbox').show();
    $('#messageId').html(message);
}

/**
 * 信息提示层（不带按钮）
 * @param msg
 */
function alertMsg(msg){
    $(".prom").html(msg);
    $(".prom").show();
    $(".lady").show();
}

/**
 * 关闭信息提示层（不带确定按钮）
 */
function closeMsg(){
    $(".lady").hide();
    $(".prom").hide();
    $(".prom").html("");
}
/**
 * 点击遮罩层，关闭提示信息（）
 */
$(".lady").click(function(){
    closeMsg();
    $(".popbox").hide();
});


/**
 * 获取url参数
 * @param name
 * @returns
 */
function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return r[2]; return null;
}

//制保留2位小数，如：2，会在2后面补上00.即2.00
function toDecimal2(x) {
    var f = parseFloat(x);
    if (isNaN(f)) {
        return false;
    }
    var f = Math.round(x*100)/100;
    var s = f.toString();
    var rs = s.indexOf('.');
    if (rs < 0) {
        rs = s.length;
        s += '.';
    }
    while (s.length <= rs + 2) {
        s += '0';
    }
    return s;
}
//校验车牌号
function checkCarNo(carNo) {
    var result = false;
    if (carNo.length == 7){
      var express = /^[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}[A-Z0-9]{4}[A-Z0-9挂学警港澳]{1}$/;
      result = express.test(carNo);
    }else if(carNo.length == 8){
      //新能源汽车校验规则
      var express = /^(([\u4e00-\u9fa5]{1}[A-Z]{1})[-]?|([wW][Jj][\u4e00-\u9fa5]{1}[-]?)|([a-zA-Z]{2}))([A-Za-z0-9]{5}|[DdFf][A-HJ-NP-Za-hj-np-z0-9][0-9]{4}|[0-9]{5}[DdFf])$/;
      result = express.test(carNo);
    }
    return result;
}
//验证邮政编码
function checkPostCode(v){
     var re= /^[1-9][0-9]{5}$/
     if(re.test(v)){
    	return true;
     }else{
       return false
     }
}

//验证手机号码
function checkMobile(mobile){
    var mobileReg =/^((\(\d{3}\))|(\d{3}\-))?(1(3\d|5\d|8\d|7[0678]))\d{8}?$/;
    if(mobileReg.test(mobile)) {
        return true;
    }else{
        return false;
    }
}
//验证邮箱
function checkEmail(str){
    var re = /^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/
    if(!re.test(str)){
        return false;
    }else{
        return true;
    }
}

var publicCarNameLength=4;
/*
 验证身份证的合法性
 根据〖中华人民共和国国家标准 GB 11643-1999〗中有关公民身份号码的规定，公民身份号码是特征组合码，由十七位数字本体码和一位数字校验码组成。排列顺序从左至右依次为：六位数字地址码，八位数字出生日期码，三位数字顺序码和一位数字校验码。
 地址码表示编码对象常住户口所在县(市、旗、区)的行政区划代码。
 出生日期码表示编码对象出生的年、月、日，其中年份用四位数字表示，年、月、日之间不用分隔符。
 顺序码表示同一地址码所标识的区域范围内，对同年、月、日出生的人员编定的顺序号。顺序码的奇数分给男性，偶数分给女性。
 校验码是根据前面十七位数字码，按照ISO 7064:1983.MOD 11-2校验码计算出来的检验码。

 出生日期计算方法。
 15位的身份证编码首先把出生年扩展为4位，简单的就是增加一个19或18,这样就包含了所有1800-1999年出生的人;
 2000年后出生的肯定都是18位的了没有这个烦恼，至于1800年前出生的,那啥那时应该还没身份证号这个东东，⊙﹏⊙b汗...
 下面是正则表达式:
 出生日期1800-2099  (18|19|20)?\d{2}(0[1-9]|1[12])(0[1-9]|[12]\d|3[01])
 身份证正则表达式 /^\d{6}(18|19|20)?\d{2}(0[1-9]|1[12])(0[1-9]|[12]\d|3[01])\d{3}(\d|X)$/i
 15位校验规则 6位地址编码+6位出生日期+3位顺序号
 18位校验规则 6位地址编码+8位出生日期+3位顺序号+1位校验位

 校验位规则     公式:∑(ai×Wi)(mod 11)……………………………………(1)
 公式(1)中：
 i----表示号码字符从由至左包括校验码在内的位置序号；
 ai----表示第i位置上的号码字符值；
 Wi----示第i位置上的加权因子，其数值依据公式Wi=2^(n-1）(mod 11)计算得出。
 i 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
 Wi 7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2 1

 */
//身份证号合法性验证
//支持15位和18位身份证号
//支持地址编码、出生日期、校验位验证
function IdentityCodeValid(code) {

    var city={11:"北京",12:"天津",13:"河北",14:"山西",15:"内蒙古",21:"辽宁",22:"吉林",23:"黑龙江 ",31:"上海",32:"江苏",33:"浙江",34:"安徽",35:"福建",36:"江西",37:"山东",41:"河南",42:"湖北 ",43:"湖南",44:"广东",45:"广西",46:"海南",50:"重庆",51:"四川",52:"贵州",53:"云南",54:"西藏 ",61:"陕西",62:"甘肃",63:"青海",64:"宁夏",65:"新疆",71:"台湾",81:"香港",82:"澳门",91:"国外 "};
    var tip = "";
    var pass= true;

    if (!code || !/^[1-9][0-9]{5}(19[0-9]{2}|200[0-9]|2010)(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])[0-9]{3}[0-9xX]$/i.test(code)) {
        tip = "身份证号格式错误";
        pass = false;
    }

    else if(!city[code.substr(0,2)]){
        tip = "地址编码错误";
        pass = false;
    }
    else{
        //18位身份证需要验证最后一位校验位
        if(code.length == 18){
            code = code.split('');
            //∑(ai×Wi)(mod 11)
            //加权因子
            var factor = [ 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 ];
            //校验位
            var parity = [ 1, 0, 'X', 9, 8, 7, 6, 5, 4, 3, 2 ];
            var sum = 0;
            var ai = 0;
            var wi = 0;
            for (var i = 0; i < 17; i++)
            {
                ai = code[i];
                wi = factor[i];
                sum += ai * wi;
            }
            var last = parity[sum % 11];
            if(parity[sum % 11] != code[17].toUpperCase()){
                tip = "校验位错误";
                pass =false;
            }
        }
    }

    return pass;
}

//计算天数差的函数，通用
function GetDateDiff(startDate,endDate) {
    var startTime = new Date(Date.parse(startDate.replace(/-/g,   "/"))).getTime();
    var endTime = new Date(Date.parse(endDate.replace(/-/g,   "/"))).getTime();
    var dates = Math.ceil((startTime - endTime)/(1000*60*60*24));
    return  dates;
}
/**
 * 日期比较
 * @param date1
 * @param date2
 * @returns {Boolean}
 */
function compareDate(date1,date2){
    var oDate1 = new Date(date1);
    var oDate2 = new Date();
    if(date2!=null){
    	oDate2 = new Date(date2);
    }    
    if(oDate1.getTime() > oDate2.getTime()){
        return true;
    } else {
        return false;
    }
}
//获取当前日期格式：2016-03-22
function getNowFormatDate() {
    var date = new Date();
    var seperator1 = "-";
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate;
    return currentdate;
}

//转换str为JSON
function stringToJson(body){
    return eval("(" + body + ")");
}

/*格式化时间戳，用于剩余多少时间，返回格式：几天,时:分:秒 */
function time_format(s) {
	var t;
	if(s > -1){
		hour = Math.floor(s/3600);
		min = Math.floor(s/60) % 60;
		sec = s % 60;
		day = parseInt(hour / 24);
		if (day > 0) {
			hour = hour - 24 * day;
			t = day + "天," + hour + ":";
        }else{
			t = hour + ":";
		}

		if(min < 10){t += "0";}
        t += min + ":";
		if(sec < 10){t += "0";}
        t += sec;
	}else{
		t = "0:00:0x";
	}
	return t;
}

/*获取当前日期，格式yyyy-MM-dd HH:MM:SS*/
function getNowFormatDateTime() {
    var date = new Date();
    var seperator1 = "-";
    var seperator2 = ":";
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
        + " " + date.getHours() + seperator2 + date.getMinutes()
        + seperator2 + date.getSeconds();
    return currentdate;
}

//日期格式：2016-03-22
function getStringFormatDate(date) {
    //var date = new Date();
    var seperator1 = "-";
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    var hour  = date.getHours();

    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    if (hour >= 0 && hour <= 9) {
        hour = "0" + hour;
    }
    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate + " " +hour;
    return currentdate;
}

/*获取当前时间戳*/
function getNowTimestamp() {
	return Date.parse(new Date());
}

//字符串转成Time(dateDiff)所需方法 时间格式：yyyy-MM-dd hh:mm:ss
function stringToTime(string){
    var f = string.split(' ', 2);
    var d = (f[0] ? f[0] : '').split('-', 3);
    var t = (f[1] ? f[1] : '').split(':', 3);
    return (new Date(
        parseInt(d[0], 10) || null,
        (parseInt(d[1], 10) || 1)-1,
        parseInt(d[2], 10) || null,
        parseInt(t[0], 10) || null,
        parseInt(t[1], 10) || null,
        parseInt(t[2], 10) || null
    )).getTime();
}

/*获取某个日期的时间戳 时间格式：yyyy-MM-dd hh:mm:ss*/
function getDateTimestamp(date){
	var type = typeof date;
	if(type == 'string'){
		date = stringToTime(date);
	}else if(date.getTime){
		date = date.getTime();
	}

    return date;//结果是毫秒
}

//核保查询
function getUnderwritingFlag(orderId,isNotPay){
    $(".indexZZ").show();
    $.ajax({
        url: "/getUnderwritingFlag",
        type: "get",
        contentType: "application/json",
        dataType: "json",
        data: {
            orderId: orderId
        },
        success: function(data) {
           // alert(JSON.stringify(data));
            $(".indexZZ").hide();
            var msg = "订单核保中，无法支付，详细信息可电话咨询!";
            try {
                if(data.status != 2){//没成功
                    if(data.status == 1){//核保中
                        alert(msg);
                    }else{//核保失败
                        var message = data.msg;
                        if(message){
                            alert("订单核保失败，无法支付，失败原因：" + message + "，详细信息可电话咨询!");
                        }else{
                            alert("订单核保失败，无法支付，详细信息可电话咨询!");
                        }
                    }
                    if(isNotPay){
                    }else{
                        location.href="/myOrder";
                    }
                } else{
                    //alert("订单核保成功，可以支付!");
                    if(isNotPay){
                        alert("订单核保成功，可以支付!");
                    }else{
                        payOrder(data.orderId);//支付
                    }
                }
            }catch (e){
                alert(JSON.stringify(e));
                alert(msg);
                location.href="/myOrder";
            }
        },error: function(e) {
            $(".indexZZ").hide();
            alert(msg);
            location.href="/myOrder";
        }
    });
}

//支付订单
function payOrder(orderId){
    try{
        var user = sessionStorage["user"];
        user = eval("(" + user + ")");
        var payInfo="";
        $.ajax({
            url: "/confirmPay",
            type: "get",
            async: true,
            contentType: "application/json",
            dataType: "json",
            data: {
                orderId: sessionStorage["orderId"],
                openId: user.userOpenId
            },
            success: function (data) {
                payInfo = data;
                alert("私车支付信息:"+JSON.stringify(payInfo));
                post("http://chexian.chelenet.com/agentPayment",{chargeInfo:JSON.stringify(payInfo),numSalePrice:sessionStorage["totalBasePrice"],orderId:sessionStorage["orderId"],carTypeValue:1,hebaoState:2});
               }
        });
    }catch(e){
        window.location.href="/myOrder";
    }

}

/**
 * 小写数字转中文大写
 * @param n
 * @returns {String}
 */
function DX(n) {
    if (!/^(0|[1-9]\d*)(\.\d+)?$/.test(n))
        return "数据非法";
    var unit = "千百拾亿千百拾万千百拾元角分", str = "";
        n += "00";
    var p = n.indexOf('.');
    if (p >= 0)
        n = n.substring(0, p) + n.substr(p+1, 2);
        unit = unit.substr(unit.length - n.length);
    for (var i=0; i < n.length; i++)
        str += '零壹贰叁肆伍陆柒捌玖'.charAt(n.charAt(i)) + unit.charAt(i);
    return str.replace(/零(千|百|拾|角)/g, "零").replace(/(零)+/g, "零").replace(/零(万|亿|元)/g, "$1").replace(/(亿)万|壹(拾)/g, "$1$2").replace(/^元零?|零分/g, "").replace(/元$/g, "元整");
}

function getPolicyStatus(status){
	var policyStatus ="";
	if(status == 1){
		policyStatus="核保中";
	}else if(status == 2){
		policyStatus="核保失败";
	}else if(status == 3){
		policyStatus="待支付";
	}else if(status == 4){
		policyStatus="支付失败";
	}else if(status == 5){
		policyStatus="待承保";
	}else if(status == 6){
		policyStatus="已承保";
	}else if(status == 7){
		policyStatus="承保失败";
	}else if(status == 8){
		policyStatus="订单失效";
	}else if(status == 9){
		policyStatus="已退保";
	}else if(status == 10){
		policyStatus="人工核保";
	}
	return policyStatus;
}

/**
 *
 *
 */
function testNum(obj) {
    var r =/^[0-9]*[1-9][0-9]*$/ ;//正整数
}
/**
 * 转大写字母  onkeyup="toUpperCase(this)"
 * @param obj
 */
function toUpperCase(obj)
{
    obj.value = obj.value.toUpperCase()
}

/**
 * 去除左右空格
 * @param str
 * @returns
 */
function trim(str){ 
    return str.replace(/(^\s*)|(\s*$)/g, ""); 
}
/**
 * 去除所有空格
 * @param str
 * @param is_global
 * @returns
 */
function trimAll(str){    
    return str.replace(/\s/g,"");
}

