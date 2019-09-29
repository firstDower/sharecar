$(function () {
    $("#assign").click(function() {
        var occCode = $("#professionThree").val();
        if(!occCode||occCode==0){
            alert("请选择职业！");
            $("html,body").animate({ scrollTop: $("#assign").offset().top }, 1);
            return false;
        }else{
            sessionStorage['occCode'] = occCode;
            window.location.href = getUrl("index");
        }
    });

    $("#cancelBtn").click(function () {
        alert("被保人健康不符合投保要求");
        //window.location.href = getUrl("");
    });

    getprofessionMessage();


    $("#professionOne").change(function(){
        var professionInfo = JSON.parse(sessionStorage['professionInfo']);
        var occCode = $(this).val();
        if(occCode==0){
            $("#professionTwo").html("");
            $("#professionTwo").append('<option style="font-size: .4rem" value="0" selected>请选择</option>');
            $("#professionThree").html("");
            $("#professionThree").append('<option style="font-size: .4rem" value="0" selected>请选择</option>');
            $("#professionTwo").val(0)
            $("#professionThree").val(0)
            return false;
        }
        var data = "";
        $.each(professionInfo,function(idx,obj){
            var occCodeEmp = obj.occCode;
            if(occCodeEmp==occCode){
                data = obj[occCode]
            }
        });
        sessionStorage['professionInfoTwo'] = JSON.stringify(data);
        var htmlStr = '<option style="font-size: .4rem" value="0" selected>请选择</option>';
        $.each(data,function(idx,obj){
            var occName = obj.occName;
            var occCode = obj.occCode;
            htmlStr += '<option style="font-size: .4rem" value="'+occCode+'">'+occName+'</option>';
        });
        $("#professionTwo").html("");
        $("#professionTwo").append(htmlStr);

    })

    $("#professionTwo").change(function(){
        var professionInfoTwo = JSON.parse(sessionStorage['professionInfoTwo']);
        var occCode = $(this).val();

        if(occCode==0){
            $("#professionThree").html("");
            $("#professionThree").append('<option style="font-size: .4rem" value="0" selected>请选择</option>');
            $("#professionThree").val(0)
            return false;
        }
        var data = "";
        $.each(professionInfoTwo,function(idx,obj){
            var occCodeEmp = obj.occCode;
            if(occCodeEmp==occCode){
                data = obj[occCode]
            }
        });
        sessionStorage['professionInfoThree'] = JSON.stringify(data);
        var htmlStr = '<option style="font-size: .4rem" value="0" selected>请选择</option>';
        $.each(data,function(idx,obj){
            var occName = obj.occName;
            var occCode = obj.occCode;
            htmlStr += '<option style="font-size: .4rem" value="'+occCode+'">'+occName+'</option>';
        });
        $("#professionThree").html("");
        $("#professionThree").append(htmlStr);
    })

})
function getprofessionMessage(){
    var param = {'proName':'zhlh'};
    $.ajax({
        type:"post",
        url:getUrl("esbServer/professionMessage"),
        dataType:"json",
        data:{params:JSON.stringify(param)},
        success:function(data){
            console.log(JSON.stringify(data));
            if(data.code==200){
                data = data.data.ret;
                sessionStorage['professionInfo'] = JSON.stringify(data);
                var htmlStr = '<option value="0" style="font-size: .4rem" selected>请选择</option>';
                $.each(data,function(idx,obj){
                    var occName = obj.occName;
                    var occCode = obj.occCode;
                    htmlStr += '<option style="font-size: .4rem" value="'+occCode+'">'+occName+'</option>';
                });
                $("#professionOne").html("");
                $("#professionOne").append(htmlStr);
            }else{

            }

        }
    });
}
