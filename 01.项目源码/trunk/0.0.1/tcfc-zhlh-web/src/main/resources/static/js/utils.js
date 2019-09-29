
function getUrl(url){
    return "/cicp.zhyl/"+url;
    //return "http://threeadmin.tiancaibaoxian.com/cicp.zhyl/"+url;
    //return "http://threeadmin.tiancaibaoxian.com/cicp.zhyl/"+url;
    //return "http://send.tiancaibaoxian.com/cicp.zhyl/"+url;
}
/*获取当前时间日*/
function getNowDay() {
    var now = new Date();
    return now.getDate();
}

/*获取保险期限开始*/
function getInsurStartDate() {
    var numDay = getNowDay();
    var startDate = "";

    if(numDay<15){
        startDate = new Date().setDate(22);
        startDate = new Date(startDate).format('yyyy-MM-dd');
    }else {
        startDate = new Date().setDate(7);
        startDate = new Date(startDate).setMonth((new Date().getMonth()+1))
        startDate = new Date(startDate).format('yyyy-MM-dd');
    }
    return startDate;
}
/*获取保险期限结束*/
function getInsurEndDate() {
    var numDay = getNowDay();
    var endDate = "";
    if(numDay<15){
        endDate = new Date().setDate(23);
        endDate = new Date(endDate).setFullYear(new Date().getFullYear()+1);
        endDate = new Date(endDate).format('yyyy-MM-dd');
    }else {
        endDate = new Date().setDate(7);
        endDate = new Date(endDate).setMonth((new Date().getMonth()+1));
        endDate = new Date(endDate).setFullYear(new Date().getFullYear()+1);
        endDate = new Date(endDate).format('yyyy-MM-dd');
    }
    return endDate;
}
    /**
 * @author 陈维斌 http://www.cnblogs.com/Orange-C/p/4042242.html%20
 * 如果想将日期字符串格式化,需先将其转换为日期类型Date
 * 以下是提供几种常用的
 *
 * var da = new Date().format('yyyy-MM-dd hh:mm:ss'); //将日期格式串,转换成先要的格式
 * alert("格式化日期类型 \n" + new Date() + "\n 为字符串：" + da);
 *
 * var str = "2014/01/01 01:01:01" // yyyy/mm/dd这种格式转化成日期对像可以用new Date(str);在转换成指定格式
 * alert("格式化字符串\n" + str + " 为日期格式 \n" + new Date(str).format('yyyy-MM-dd hh:mm:ss'))
 *
 *
 * var str1 = "2014-12-31 00:55:55" // yyyy-mm-dd这种格式的字符串转化成日期对象可以用new Date(Date.parse(str.replace(/-/g,"/")));
 * alert("格式化字符串\n" + str1 + " 为日期格式 \n" + new Date(Date.parse(str1.replace(/-/g, "/"))).format('yyyy-MM-dd hh:mm:ss'))
 *
 *
 * 日期加月
 * 先将字符转换成Date类型才可以使用
 * var str1 = "2014-12-31 00:55:55" // yyyy-mm-dd这种格式的字符串转化成日期对象可以用new Date(Date.parse(str.replace(/-/g,"/")));
 * 例如 var saveDate = new Date(Date.parse(str1.replace(/-/g, "/"))).addMonth(5)
 * addMonth(月数) 必须为整数
 */

Date.prototype.format = function (format) {
    var date = {
        "M+": this.getMonth() + 1,
        "d+": this.getDate(),
        "h+": this.getHours(),
        "m+": this.getMinutes(),
        "s+": this.getSeconds(),
        "q+": Math.floor((this.getMonth() + 3) / 3),
        "S+": this.getMilliseconds()
    };
    if (/(y+)/i.test(format)) {
        format = format.replace(RegExp.$1, (this.getFullYear() + '').substr(4 - RegExp.$1.length));
    }
    for (var k in date) {
        if (new RegExp("(" + k + ")").test(format)) {
            format = format.replace(RegExp.$1, RegExp.$1.length == 1
                ? date[k] : ("00" + date[k]).substr(("" + date[k]).length));
        }
    }
    return format;
}
Date.daysInMonth = function (year, month) {
    if (month == 1) {
        if (year % 4 == 0 && year % 100 != 0)
            return 29;
        else
            return 28;
    } else if ((month <= 6 && month % 2 == 0) || (month = 6 && month % 2 == 1))
        return 31;
    else
        return 30;
};
Date.prototype.addMonth = function (addMonth) {
    var y = this.getFullYear();
    var m = this.getMonth();
    var nextY = y;
    var nextM = m;
    //如果当前月+要加上的月>11 这里之所以用11是因为 js的月份从0开始
    if (m > 11) {
        nextY = y + 1;
        nextM = parseInt(m + addMonth) - 11;
    } else {
        nextM = this.getMonth() + addMonth
    }
    var daysInNextMonth = Date.daysInMonth(nextY, nextM);
    var day = this.getDate();
    if (day > daysInNextMonth) {
        day = daysInNextMonth;
    }
    return new Date(nextY, nextM, day);
};

/*根据身份证计算生日*/
function getDateByIDNO (insureIDNumber){
    var year = insureIDNumber.substr(6,4);
    var month = insureIDNumber.substr(10,2);
    var day = insureIDNumber.substr(12,2);
    return year+'-'+month+'-'+day;
}

/*根据出生日期算出年龄*/
function jsGetAge(strBirthday){
    var returnAge;
    var strBirthdayArr=strBirthday.split("-");
    var birthYear = strBirthdayArr[0];
    var birthMonth = strBirthdayArr[1];
    var birthDay = strBirthdayArr[2];

    d = new Date();
    var nowYear = d.getFullYear();
    var nowMonth = d.getMonth() + 1;
    var nowDay = d.getDate();

    if(nowYear == birthYear){
        returnAge = 0;//同年 则为0岁
    }
    else{
        var ageDiff = nowYear - birthYear ; //年之差
        if(ageDiff > 0){
            if(nowMonth == birthMonth) {
                var dayDiff = nowDay - birthDay;//日之差
                if(dayDiff < 0)
                {
                    returnAge = ageDiff - 1;
                }
                else
                {
                    returnAge = ageDiff ;
                }
            }
            else
            {
                var monthDiff = nowMonth - birthMonth;//月之差
                if(monthDiff < 0)
                {
                    returnAge = ageDiff - 1;
                }
                else
                {
                    returnAge = ageDiff ;
                }
            }
        }
        else
        {
            returnAge = -1;//返回-1 表示出生日期输入错误 晚于今天
        }
    }

    return returnAge;//返回周岁年龄

}
/*根据年龄计算保费*/
function getPriceByAge(strBirthday) {
    var age = jsGetAge(strBirthday);
    var strPrice = 0;
    if(age<=10){
        strPrice = 590
    }else if(age>10 && age<= 20){
        strPrice = 455
    }else if(age>20&&age<=30){
        strPrice = 410
    }else if(age>30&&age<=40){
        strPrice = 500
    }else if(age>40&&age<=50){
        strPrice = 760
    }else if(age>50&&age<=60){
        strPrice = 950
    }else if(age>60&&age<=65){
        strPrice = 1400
    }else{
        //strPrice = -1
    }
    return strPrice;
}

function validateIdCard(idCard){
    var vcity={ 11:"北京",12:"天津",13:"河北",14:"山西",15:"内蒙古",
        21:"辽宁",22:"吉林",23:"黑龙江",31:"上海",32:"江苏",
        33:"浙江",34:"安徽",35:"福建",36:"江西",37:"山东",41:"河南",
        42:"湖北",43:"湖南",44:"广东",45:"广西",46:"海南",50:"重庆",
        51:"四川",52:"贵州",53:"云南",54:"西藏",61:"陕西",62:"甘肃",
        63:"青海",64:"宁夏",65:"新疆",71:"台湾",81:"香港",82:"澳门",91:"国外"
    };
    //是否为空
    if(idCard === ''){
        return false;
    }
    //校验长度，类型
    if(isCardNo(idCard) === false){
        return false;
    }
    //检查省份
    if(checkProvince(idCard,vcity) === false){
        return false;
    }
    //校验生日
    if(checkBirthday(idCard) === false){
        return false;
    }
    //检验位的检测
    if(checkParity(idCard) === false){
        return false;
    }
    return true;
}
//检查号码是否符合规范，包括长度，类型
function isCardNo(card){
    //身份证号码为15位或者18位，15位时全为数字，18位前17位为数字，最后一位是校验位，可能为数字或字符X
    var reg = /(^\d{15}$)|(^\d{17}(\d|X|x)$)/;
    if(reg.test(card) === false){
        return false;
    }
    return true;
}
//取身份证前两位,校验省份
function checkProvince(card,vcity){
    var province = card.substr(0,2);
    if(vcity[province] == undefined){
        return false;
    }
    return true;
};
//检查生日是否正确
function checkBirthday(card){
    var len = card.length;
    //身份证15位时，次序为省（3位）市（3位）年（2位）月（2位）日（2位）校验位（3位），皆为数字
    if(len == '15'){
        var re_fifteen = /^(\d{6})(\d{2})(\d{2})(\d{2})(\d{3})$/;
        var arr_data = card.match(re_fifteen);
        var year = arr_data[2];
        var month = arr_data[3];
        var day = arr_data[4];
        var birthday = new Date('19'+year+'/'+month+'/'+day);
        return verifyBirthday('19'+year,month,day,birthday);
    }
    //身份证18位时，次序为省（3位）市（3位）年（4位）月（2位）日（2位）校验位（4位），校验位末尾可能为X
    if(len == '18'){
        var re_eighteen = /^(\d{6})(\d{4})(\d{2})(\d{2})(\d{3})([0-9]|X|x)$/;
        var arr_data = card.match(re_eighteen);
        var year = arr_data[2];
        var month = arr_data[3];
        var day = arr_data[4];
        var birthday = new Date(year+'/'+month+'/'+day);
        return verifyBirthday(year,month,day,birthday);
    }
    return false;
};
//校验日期
function verifyBirthday(year,month,day,birthday)
{
    var now = new Date();
    var now_year = now.getFullYear();
    //年月日是否合理
    if(birthday.getFullYear() == year && (birthday.getMonth() + 1) == month && birthday.getDate() == day)
    {
        //判断年份的范围（0岁到100岁之间)
        var time = now_year - year;
        if(time >= 0 && time <= 100)
        {
            return true;
        }
        return false;
    }
    return false;
}
//校验位的检测
function checkParity(card){
    //15位转18位
    card = changeFivteenToEighteen(card);
    var len = card.length;
    if(len == '18'){
        var arrInt = new Array(7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2);
        var arrCh = new Array('1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2');
        var cardTemp = 0, i, valnum;
        for(i = 0; i < 17; i ++) {
            cardTemp += card.substr(i, 1) * arrInt[i];
        }
        valnum = arrCh[cardTemp % 11];
        if (valnum == card.substr(17, 1).toLocaleUpperCase())
        {
            return true;
        }
        return false;
    }
    return false;
}
//15位转18位身份证号
function changeFivteenToEighteen(card){
    if(card.length == '15')
    {
        var arrInt = new Array(7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2);
        var arrCh = new Array('1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2');
        var cardTemp = 0, i;
        card = card.substr(0, 6) + '19' + card.substr(6, card.length - 6);
        for(i = 0; i < 17; i ++)
        {
            cardTemp += card.substr(i, 1) * arrInt[i];
        }
        card += arrCh[cardTemp % 11];
        return card;
    }
    return card;
}

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

//姓名验证
function isName(name) {
    if (name.search(/^[\u4e00-\u9fa5 ]{2,20}$/) != -1){

        return true;
    }
    else{
        //alert("姓名格式错误");

        return false;
    }
}
//邮箱验证
function isEmail(str) {
    var re = /^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/
    if(!re.test(str)){
        return false;
    }else{
        return true;
    }
}

//验证手机号码
function fucCheckTEL(mobile)
{
    var mobileReg =/^((\(\d{3}\))|(\d{3}\-))?(1(3\d|5\d|8\d|7[0678]))\d{8}?$/;
    if(mobileReg.test(mobile)) {
        return true;
    }else{
        return false;
    }
}