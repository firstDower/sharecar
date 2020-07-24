
var util = {
    getParamData: function (jsonobj) {
        var signstr = this.obj2str(jsonobj)
        signstr = signstr + '&key=' + this.pro_pass;
        console.log("signstrkey:",signstr)
        var sign = hex_md5(signstr);
        sign = sign.toUpperCase();
        return sign;
    },
    //object转string,用于签名计算
    obj2str: function (args) {
        var keys = Object.keys(args)
        keys = keys.sort() //参数名ASCII码从小到大排序（字典序）；
        var newArgs = {}
        keys.forEach(function (key) {
            //如果参数的值为空 、undefined不参与签名；
            if (args[key] != "" && args[key] != 'undefined'&&typeof(args[key]) != "undefined") {
                newArgs[key] = args[key]  //参数名区分大小写；
            }

        })
        var string = ''
        for (var k in newArgs) {
            string += '&' + k + '=' + newArgs[k]
        }
        string = string.substr(1)
        return string
    },
    //时间戳产生的函数, 当前时间以证书表达，精确到秒的字符串
    createTimeStamp: function () {
        return parseInt(new Date().getTime() / 1000) + ''
    },
    pro_pass : "MtD3AyxboTqTiPDPc9nO359Y8Qs66l7eAnK2T64C65Jwpm7kWFoumUFHrj7IFrYz5UNPtXtVGCus3i53DldSNdGgaknkzJsizXQR",
    pro_name : "telrgJVOZuiOUCV"
    ,
    getToken:function () {
        var token = sessionStorage["token"];
        if(token)
            return token;
        var param = {}
        param.pro_name = this.pro_name;
        var timeStamp = util.createTimeStamp();
        param.timeStamp = timeStamp;
        var sign = util.getParamData(param);
        $.ajax({
            type: 'POST',
            url: ctxPath + "apiService/getToken",
            timeout:8000,
            data : param,
            headers: {
                'sign':sign,
                'Content-Type': 'application/x-www-form-urlencoded',
                'pro_name':util.pro_name
            },
            async: false,
            dataType: 'json',
            success: function(data){
                console.log("=========="+JSON.stringify(data));
                if(data.code==200){
                    data = data.data;
                    var token = data.token;
                    sessionStorage["token"] = token;
                    return token;
                }else {
                    console.log("获取toke异常，"+data.msg)
                }
            },
            error: function(xhr, type){
            }
        });
    }
}

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



//Create Time:  07/28/2011
//Operator:     刘政伟
//Description:  银行卡号Luhm校验

//Luhm校验规则：16位银行卡号（19位通用）:

// 1.将未带校验位的 15（或18）位卡号从右依次编号 1 到 15（18），位于奇数位号上的数字乘以 2。
// 2.将奇位乘积的个十位全部相加，再加上所有偶数位上的数字。
// 3.将加法和加上校验位能被 10 整除。

//方法步骤很清晰，易理解，需要在页面引用Jquery.js


//bankno为银行卡号 banknoInfo为显示提示信息的DIV或其他控件
function luhmCheck(bankno){
    var lastNum=bankno.substr(bankno.length-1,1);//取出最后一位（与luhm进行比较）

    var first15Num=bankno.substr(0,bankno.length-1);//前15或18位
    var newArr=new Array();
    for(var i=first15Num.length-1;i>-1;i--){    //前15或18位倒序存进数组
        newArr.push(first15Num.substr(i,1));
    }
    var arrJiShu=new Array();  //奇数位*2的积 <9
    var arrJiShu2=new Array(); //奇数位*2的积 >9

    var arrOuShu=new Array();  //偶数位数组
    for(var j=0;j<newArr.length;j++){
        if((j+1)%2==1){//奇数位
            if(parseInt(newArr[j])*2<9)
                arrJiShu.push(parseInt(newArr[j])*2);
            else
                arrJiShu2.push(parseInt(newArr[j])*2);
        }
        else //偶数位
            arrOuShu.push(newArr[j]);
    }

    var jishu_child1=new Array();//奇数位*2 >9 的分割之后的数组个位数
    var jishu_child2=new Array();//奇数位*2 >9 的分割之后的数组十位数
    for(var h=0;h<arrJiShu2.length;h++){
        jishu_child1.push(parseInt(arrJiShu2[h])%10);
        jishu_child2.push(parseInt(arrJiShu2[h])/10);
    }

    var sumJiShu=0; //奇数位*2 < 9 的数组之和
    var sumOuShu=0; //偶数位数组之和
    var sumJiShuChild1=0; //奇数位*2 >9 的分割之后的数组个位数之和
    var sumJiShuChild2=0; //奇数位*2 >9 的分割之后的数组十位数之和
    var sumTotal=0;
    for(var m=0;m<arrJiShu.length;m++){
        sumJiShu=sumJiShu+parseInt(arrJiShu[m]);
    }

    for(var n=0;n<arrOuShu.length;n++){
        sumOuShu=sumOuShu+parseInt(arrOuShu[n]);
    }

    for(var p=0;p<jishu_child1.length;p++){
        sumJiShuChild1=sumJiShuChild1+parseInt(jishu_child1[p]);
        sumJiShuChild2=sumJiShuChild2+parseInt(jishu_child2[p]);
    }
    //计算总和
    sumTotal=parseInt(sumJiShu)+parseInt(sumOuShu)+parseInt(sumJiShuChild1)+parseInt(sumJiShuChild2);

    //计算Luhm值
    var k= parseInt(sumTotal)%10==0?10:parseInt(sumTotal)%10;
    var luhm= 10-k;

    if(lastNum==luhm && lastNum.length != 0){
        return true;
    }
    else{

        return false;
    }
}

/*
车牌号验证
 */
function isVehicleNumber(vehicleNumber) {
    var result = false;
    if (vehicleNumber.length == 7){
        var express = /^[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}[A-Z0-9]{4}[A-Z0-9挂学警港澳]{1}$/;
        result = express.test(vehicleNumber);
    }
    return result;
}


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

function checkMoney(v) {
    var reg = /(^[1-9]([0-9]+)?(\.[0-9]{1,2})?$)|(^(0){1}$)|(^[0-9]\.[0-9]([0-9])?$)/;
    if (reg.test(v)) {
        return true;
    }else{
        return false;
    }
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

