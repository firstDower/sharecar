$(function () {
    custom.init();
})
    var custom = {
        init:function () {
            custom.dataInit();
        },
        dataInit:function () {
            var param = {}
            param.timeStamp = util.createTimeStamp();
            $.ajax({
                type:"post",
                url:ctxPath + "securityService/getGradeList",
                data : param,
                headers: util.initNoTokenHeaders(param),
                dataType:"json",
                success:function(data){
                    if(data.code==200){
                        var cityStr = '';
                        $.each(data.data,function(index,value){
                            cityStr += '<option value="'+value.numId+'">'+value.vcGradeName+'</option>'
                        });
                        $('#NUM_GRADE_ID').append(cityStr);
                    }
                },
                error:function(){
                    closeMsg();
                }
            });


            $.ajax({
                type:"post",
                url:ctxPath + "securityService/getSchoolList",
                data : param,
                headers: util.initNoTokenHeaders(param),
                dataType:"json",
                success:function(data){
                    if(data.code==200){
                        var cityStr = '';
                        $.each(data.data,function(index,value){
                            cityStr += '<option value="'+value.numId+'">'+value.vcSchoolName+'</option>'
                        });
                        $('#NUM_SCHOOL_ID').append(cityStr);
                    }
                },
                error:function(){
                    closeMsg();
                }
            });


            $.ajax({
                type:"post",
                url:ctxPath + "securityService/getModelList",
                data : param,
                headers: util.initNoTokenHeaders(param),
                dataType:"json",
                success:function(data){
                    if(data.code==200){
                        var cityStr = '';
                        $.each(data.data,function(index,value){
                            cityStr += '<option value="'+value.numId+'">'+value.vcModelName+'</option>'
                        });
                        $('#NUM_MODEL_ID').append(cityStr);
                    }

                },
                error:function(){
                    closeMsg();
                }
            });
        }
    }