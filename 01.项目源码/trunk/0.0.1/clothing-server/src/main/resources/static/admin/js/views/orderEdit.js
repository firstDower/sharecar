layui.use(['form', 'layer'],

    function() {
        $ = layui.jquery;
        var form = layui.form,
            layer = layui.layer;
        var pageData = sessionStorage["pageData"]
        //alert(pageData);
        pageData = JSON.parse(pageData);
        initPage();
        function initPage() {

            $("#NUM_PAR_TYPE").val(pageData.numParType);
            $("#NUM_TYPE").val(pageData.numType);
            $("#VC_NAME").val(pageData.vcName);
            $("#VC_PHONE").val(pageData.vcPhone);
            $("#VC_HIGHT").val(pageData.vcHight);
            $("#VC_WIGHT").val(pageData.vcWight);
            $("#NUM_NUM").val(pageData.numNum);
            $("#NUM_PRICE").val(pageData.numPrice);
            $("#VC_SIGN_DESC").val(pageData.vcSignDesc);



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
                    $('#NUM_GRADE_ID').val(pageData.numGradeId);
                    layui.form.render('select');
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
                    $('#NUM_SCHOOL_ID').val(pageData.numSchoolId);
                    layui.form.render('select');
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
                    $('#NUM_MODEL_ID').val(pageData.numModelId);
                    layui.form.render('select');
                },
                error:function(){
                    closeMsg();
                }
            });
        }

        //监听提交
        form.on('submit(orderEdit)',
            function(data) {
                var param = data.field;

                param.NUM_ID = pageData.numId;
                console.log("============"+JSON.stringify(param));
                //发异步，把数据提交给php
                $.ajax({
                    type: 'POST',
                    url: ctxPath + "reposi/updateProduct",
                    timeout:8000,
                    data : JSON.stringify(param),
                    contentType: 'application/json',
                    dataType: 'json',
                    success: function(data){
                        if(data.success){
                            layer.alert(data.msg, {
                                    icon: 6
                                },
                                function() {
                                    close('yes');
                                });
                        }else {
                            layer.msg(data.msg,function(){
                                close('no');
                            });
                        }
                    },
                    error: function(xhr, type){
                    }
                });
                return false;
            });

        function close(status){
            if(status=="yes"){
                window.parent.location.reload();//刷新父页面
                var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
                parent.layer.close(index);
            }
            var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
            parent.layer.close(index);
        }

    });

