$(function () {
    $(".underAge").hide();
    $(".underAge2").show();
    var startDate = getInsurStartDate();
    var endDate = getInsurEndDate();
    $('#startDate').html(startDate+ ' 0时');
    $('#endDate').html(endDate+ ' 0时');
    console.log("startDate:"+startDate+";endDate:"+endDate);

    $("#insureIDNumber").blur(function () {

        var insureIDNumber = $(this).val();

        if(!validateIdCard(insureIDNumber)){
            return false;
        }

        var year = insureIDNumber.substr(6,4);
        var month = insureIDNumber.substr(10,2);
        var day = insureIDNumber.substr(12,2);
        var flag = insureIDNumber.substr(16,1);
        var brithday = year+'-'+month+'-'+day;
        var sexFlag = "";
        if(flag%2==1){
            sexFlag = "男";
            var htmlOp = '<option style="font-size: .4rem" value="母子">母子</option><option style="font-size: .4rem" value="父子">父子</option>';
            $("#guardianVc2Rel").html("");
            $("#guardianVc2Rel").append(htmlOp)

            $("#guardianVc2Rel").val("母子");
        }else{
            sexFlag = "女";
            var htmlOp = '<option style="font-size: .4rem" value="母女">母女</option><option style="font-size: .4rem" value="父女">父女</option>';
            $("#guardianVc2Rel").html("");
            $("#guardianVc2Rel").append(htmlOp)
            $("#guardianVc2Rel").val("母女");
        }
        $('#insureBrithday').val(brithday);
        $('#insureSex').val(sexFlag);


        var priceStr = getPriceByAge(brithday);
        sessionStorage['priceStr'] = priceStr;
        $('#salePremium').html(priceStr);



        var ageNum = jsGetAge(brithday);

        sessionStorage["ageNum"] = ageNum;

        if(ageNum<18){
            sessionStorage['underAgeFlag'] = 1;
            $(".underAge").show();
            $(".underAge2").hide();
        }else{
            $(".underAge").hide();
            $(".underAge2").show();
            sessionStorage['underAgeFlag'] = 0;
        }

        //=================================
        var ageNum = sessionStorage["ageNum"];
        var priceStr = sessionStorage['priceStr'];
        if(ageNum>65||priceStr==0){
            alert("投保年龄须出生满30天~65周岁！");
            return false;
        }
        //=================================
        console.log("brithday:"+brithday+";sexFlag:"+sexFlag)
    });

    $("#guardianIDNumber").blur(function () {
        var insureIDNumber = $(this).val();
        if(!validateIdCard(insureIDNumber)){
            return false;
        }
        var year = insureIDNumber.substr(6,4);
        var month = insureIDNumber.substr(10,2);
        var day = insureIDNumber.substr(12,2);
        var flag = insureIDNumber.substr(16,1);
        var brithday = year+'-'+month+'-'+day;
        var sexFlag = "";
        if(flag%2==1){
            sexFlag = "男"
        }else{
            sexFlag = "女"
        }
        $('#guardianBrithday').val(brithday);
        $('#guardianSex').val(sexFlag);

    });

    $(".next-1").click(function () {
        var ageNum = sessionStorage["ageNum"];
        var priceStr = sessionStorage['priceStr'];
        if(ageNum>65||priceStr==0){
            alert("投保年龄须出生满30天~65周岁！");
            return false;
        }
        creatOrder();
    });
})


function creatOrder() {
    var cacheData = {};
    var param = {}
    param.productNo = sessionStorage["productNo"];
    param.schemeNo = sessionStorage["programmeCode"];
    param.startDate = getInsurStartDate();
    cacheData.startDate = param.startDate;
    param.endDate = getInsurEndDate();
    cacheData.endDate = getInsurEndDate();
    param.salePremium = sessionStorage['priceStr']; //销售保费

    var persons = [];
    var person = {};
    var name = $("#insureName").val();
    if(!name||name.length>30){
        alert("请输入正确的被保人姓名！");
        return false;
    }
    person.name = name;
    cacheData.insureName = name;
    var sex = 1;
    var insureSex = $("#insureSex").val();
    if(insureSex=='女'){
        sex = 2;
    }

    person.sex = sex;
    cacheData.insureSex = insureSex;
    cacheData.insureBrithday = $("#insureBrithday").val();
    person.certType = 1;
    var certNo = $("#insureIDNumber").val();
    if(!validateIdCard(certNo)){
        alert("请输入正确的身份证号！");
        return false;
    }
    person.certNo = certNo;
    cacheData.insureIDNumber = certNo;
    //person.insureIDNumber =
    var phone = $("#insurePhone").val();
    if(!fucCheckTEL(phone)){
        alert("请输入正确的手机号！");
        return false;
    }
    person.phone = phone;
    cacheData.insurePhone = phone
    var email = $("#insureMail").val();
    if(!isEmail(email)){
        alert("请输入正确的邮箱！");
        return false;
    }
    cacheData.insureMail = email;
    person.email = email;
    person.dicCode = 'insured';
    person.occCode = sessionStorage['occCode'];
    persons.push(person);
    var underAgeFlag = sessionStorage['underAgeFlag'];
    cacheData.underAgeFlag = underAgeFlag;
    if(underAgeFlag==1){
        var personGuardian = {};
        personGuardian.vc2Rel = $("#guardianVc2Rel").val();
        cacheData.vc2Rel = personGuardian.vc2Rel;
        var guardianName = $("#guardianName").val();
        if(!isName(guardianName)){
            alert("请输入监护人姓名！");
            return false;
        }
        personGuardian.name = guardianName;
        cacheData.guardianName = guardianName;
        personGuardian.certType = '1';

        var guardianIDNumber = $("#guardianIDNumber").val();
        if(!validateIdCard(guardianIDNumber)){
            alert("请输入正确的监护人身份证号！");
            return false;
        }
        personGuardian.certNo = guardianIDNumber;
        cacheData.guardianIDNumber = guardianIDNumber;
        param.guardianCertNo = guardianIDNumber;
        personGuardian.birth = $("#guardianBrithday").val();
        cacheData.guardianBrithday = personGuardian.birth;
        var guardianSexNum = 1;
        var guardianSex = $("#insureSex").val();
        if(guardianSex=='女'){
            guardianSexNum = 2;
        }
        personGuardian.sex = guardianSexNum;
        cacheData.guardianSex = guardianSex;
        var guardianPhone = $("#guardianPhone").val();
        if(!fucCheckTEL(guardianPhone)){
            alert("请输入正确的监护人手机号！");
            return false;
        }
        personGuardian.phone = guardianPhone;
        cacheData.guardianPhone = guardianPhone;
        var guardianMail = $("#guardianMail").val();
        if(!isEmail(guardianMail)){
            alert("请输入正确的监护人邮箱！");
            return false;
        }
        personGuardian.email = guardianMail;
        cacheData.guardianMail = guardianMail;
        personGuardian.dicCode = 'guardian';
        persons.push(personGuardian);
    }
    sessionStorage['cacheData'] = JSON.stringify(cacheData);
    param.persons = persons;
    $.ajax({
        type:"post",
        url:getUrl("esbServer/creatOrder"),
        dataType:"json",
        data:{params:JSON.stringify(param)},
        success:function(data){
            console.log(JSON.stringify(data));
            if(data.code==200){
                var policySeq = data.data.policySeq;
                sessionStorage['policySeq'] = policySeq;
                window.location.href = getUrl("Message");
            }else {
                alert(data.message);
            }

        },
        error:function(){
            alert("服务异常！");
        }
    });
}
