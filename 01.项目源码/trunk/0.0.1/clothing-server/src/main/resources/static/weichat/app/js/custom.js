$(function () {
    custom.init();
})
    var custom = {
        init:function () {
            custom.dataInit();
        },
        dataInit:function () {
            $.ajax({
                type:"post",
                url:ctxPath + "reposi/getGradeList",
                dataType:"json",
                success:function(data){
                    console.log("================"+data)
                    var cityStr = '';
                    $.each(data.resultInfo,function(index,value){
                        cityStr += '<option value="'+value.numId+'">'+value.vcGradeName+'</option>'
                    });
                    $('#NUM_GRADE_ID').append(cityStr);
                },
                error:function(){
                    closeMsg();
                }
            });


            $.ajax({
                type:"post",
                url:ctxPath + "reposi/getSchoolList",
                dataType:"json",
                success:function(data){
                    var cityStr = '';
                    $.each(data.resultInfo,function(index,value){
                        cityStr += '<option value="'+value.numId+'">'+value.vcSchoolName+'</option>'
                    });
                    $('#NUM_SCHOOL_ID').append(cityStr);
                },
                error:function(){
                    closeMsg();
                }
            });


            $.ajax({
                type:"post",
                url:ctxPath + "reposi/getModelList",
                dataType:"json",
                success:function(data){
                    var cityStr = '';
                    $.each(data.resultInfo,function(index,value){
                        cityStr += '<option value="'+value.numId+'">'+value.vcModelName+'</option>'
                    });
                    $('#NUM_MODEL_ID').append(cityStr);
                },
                error:function(){
                    closeMsg();
                }
            });
        }
    }