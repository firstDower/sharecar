layui.use(['form', 'layer'],

    function() {
        $ = layui.jquery;
        var form = layui.form,
            layer = layui.layer;

        //监听提交
        form.on('submit(add)',
            function(data) {
                var param = data.field;
                console.log("============"+JSON.stringify(data));
                param.VC_USER_ID = "administrator";
                //发异步，把数据提交给php
                $.ajax({
                    type: 'POST',
                    url: ctxPath + "reposi/creatProduct",
                    timeout:8000,
                    data : JSON.stringify(param),
                    contentType: 'application/json',
                    dataType: 'json',
                    success: function(data){
                        if(data.success){
                            /*layer.msg(data.msg,function(){
                                location.href= ctxPath + 'jump/adminP/index';
                            });*/
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
layui.use(['laydate', 'form'],
    function() {
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#DAT_CREAT_TIME_START' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
            elem: '#DAT_CREAT_TIME_END' //指定元素
        });

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
                $('#NUM_GRADE_ID').val(1)
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
                $('#NUM_SCHOOL_ID').val(1)
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
                $('#NUM_MODEL_ID').val(4)
                layui.form.render('select');
            },
            error:function(){
                closeMsg();
            }
        });
    });

