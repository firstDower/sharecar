$(function () {
   /* $(".next-1").click(function() {
        console.log("投保人信息-下一步");
        window.location.href = getUrl("Health");
    });*/


    $("#nextSy").on("click", function() {
        var flag = $(".consents").hasClass("active");
        if (!flag) {
            alert("请阅读投保须知及服务详情");
            $(".synthesis-tab li").removeClass("active");
            $(".synthesis-tab li")
                .eq(2)
                .addClass("active");
            $(".itemBox .items")
                .eq(2)
                .show()
                .siblings()
                .hide();
            $("html,body").animate({ scrollTop: $("#consent").offset().top }, 1000);
        }else {
            window.location.href = getUrl("Health");
        }
    });

    $("#dateStart").bind("input propertychange",function(event){
        console.log($("#dateStart").val())
    });


    $("#insuranceNotes").click(function () {
        window.open('web/viewer.html?file=投保须知.pdf');
       // window.open(getUrl("pdf/insuranceNotes.pdf"));
    });
    $("#insuranceClauses").click(function () {
        window.open('web/viewer.html?file=保险条款.pdf');
        //window.open(getUrl("pdf/insuranceClauses.pdf"));
    });

    $("#insuranceClauses2").click(function () {
        window.open('web/viewer.html?file=保险条款.pdf');
       // window.open(getUrl("pdf/insuranceClauses.pdf"));
    });
    $("#declarationsAuthorizations").click(function () {
        window.open('web/viewer.html?file=投保人及被保险人声明与授权.pdf');
        //window.open(getUrl("pdf/declarationsAuthorizations.pdf"));
    });

    $("#uninsurableOccupation").click(function () {
        window.open('web/viewer.html?file=不可投保职业.pdf');
       // window.open(getUrl("pdf/uninsurableOccupation.pdf"));
    });

    $("#uninsurableOccupation2").click(function () {
        window.open('web/viewer.html?file=不可投保职业.pdf');
        //window.open(getUrl("pdf/uninsurableOccupation.pdf"));
    });

    initPage()
})
function initPage() {
    $.ajax({
        type:"post",
        url:getUrl("esbServer/getProductInfo"),
        dataType:"json",
        success:function(data){
            console.log(JSON.stringify(data));
            sessionStorage["productNo"] = data.productNo;
            sessionStorage["programmeCode"] = data.programmeCode;
        },
        error:function(){
            alert("服务异常！");
        }
    });
}