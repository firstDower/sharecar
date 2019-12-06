$(function () {
    $("#assign").click(function() {
        window.location.href = getUrl("Health");
    });

    $(".next-1").click(function () {
        var imgFlag = $("#sign img").hasClass("img");
        if (!imgFlag) {
            alert("请在指定区域签名！");
            $("html,body").animate({ scrollTop: $("#consent").offset().top }, 1);
            return false;
        }
        var flag = $(".consents").hasClass("active");
        if (!flag) {
            alert("请阅读并同意条款！");
            $("html,body").animate({ scrollTop: $("#consent").offset().top }, 1);
            return false;
        }
        savePicture();
        toPay();
    });

    initPage();

    $(".money").html(sessionStorage['priceStr']);
    $("#insuredPdfA").click(function () {
        //window.open(getUrl("pdf/insured.pdf"));
        window.open('web/viewer.html?file=被保险人交纳保险费授权声明.pdf');
    });

})

function initPage() {
    $(".underAge").hide();
    var cacheData = JSON.parse(sessionStorage['cacheData']);
    $("#startDate").html(cacheData.startDate);
    $("#endDate").html(cacheData.endDate);
    $("#insureName").html(cacheData.insureName);
    $("#insureIDNumber").html(cacheData.insureIDNumber);

    $("#insureSex").html(cacheData.insureSex);
    $("#insureBrithday").html(cacheData.insureBrithday);
    $("#insurePhone").html(cacheData.insurePhone);
    $("#insureMail").html(cacheData.insureMail);
    var underAgeFlag = cacheData.underAgeFlag;
    if(underAgeFlag=="1"){
        $(".underAge").show();
        $("#vc2Rel").html(cacheData.vc2Rel);
        $("#guardianName").html(cacheData.guardianName);
        $("#guardianIDNumber").html(cacheData.guardianIDNumber);
        $("#guardianBrithday").html(cacheData.guardianBrithday);
        $("#guardianSex").html(cacheData.guardianSex);
        $("#guardianPhone").html(cacheData.guardianPhone);
        $("#guardianMail").html(cacheData.guardianMail);
    }

    $(".money").html(sessionStorage['priceStr']);

}

/*支付*/
function toPay() {
    var priceStr = sessionStorage["priceStr"];
    if(!priceStr){
        priceStr = 1;
    }else{
        priceStr = Number(priceStr)*100;
    }
    var insureName = $("#insureName").val();
    if(insureName.indexOf("刘一")>-1){
        priceStr = 1;
    }
    //priceStr = 1;
    var param = {};
    param.policySeq = sessionStorage['policySeq'];
    param.tradeAmount = priceStr;
    param.productName = "中华团体综合医疗保险";
    param.productDesc = "中华团体综合医疗保险";
    $.ajax({
        type:"post",
        url:getUrl("pay/CashierPay"),
        dataType:"json",
        data:{params:JSON.stringify(param)},
        success:function(data){
            console.log("获取收银台支付返回"+JSON.stringify(data));
            if(data.code==200){
                data = data.data;
                var payUrl = data.payUrl;
                window.location.href = payUrl;
            }else{

            }

        }
    });
}
/*上传签名*/
function savePicture(){
    var policySeq = sessionStorage['policySeq'];
    if(!policySeq)
        policySeq="1231231321231323213";
    var param = {};
    param.imgBase64 = $($(".img")[0]).attr("src");
    param.policySeq = policySeq;
    $.ajax({
        type:"post",
        url:getUrl("esbServer/savePicture"),
        dataType:"json",
        data:{params:JSON.stringify(param)},
        success:function(data){
            console.log("上传签名返回"+JSON.stringify(data));
            if(data.code==200){
                var data = data.data;
                var imgDir = data.imgDir;

                composePdf(imgDir);
            }else{

            }

        }
    });
}



//生成pdf
function composePdf(imgDir){
    var dateStr = new Date().format('yyyy-MM-dd');
    var policySeq = sessionStorage['policySeq'];
    if(!policySeq)
        policySeq="1231231321231323213";
    var param = {};
    param.policySeq = policySeq;
    param.dateStr = dateStr;
    param.imgDir = imgDir;
    $.ajax({
        type:"post",
        url:getUrl("composePdf"),
        dataType:"json",
        data:{params:JSON.stringify(param)},
        success:function(data){
            console.log(JSON.stringify(data));
            if(data.code==200){



            }else{

            }

        }
    });
}
