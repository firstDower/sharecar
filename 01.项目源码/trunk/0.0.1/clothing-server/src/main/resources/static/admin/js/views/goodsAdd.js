layui.use('upload', function(){
    var upload = layui.upload;

    //执行实例
    var uploadInst = upload.render({
        elem: '#imgUploadId' //绑定元素
        ,url: ctxPath + 'upload/imgUpload/' //上传接口
        ,field:"fileName"
        ,done: function(res){
            console.log("======imgUpload============"+JSON.stringify(res));
            if(res.code==200){
                $("#srcimgurl").attr("src",ctxPath + "/imgServer/" +res.data);
                $("#pic_url").val(res.data);
                //http://test.doweryouxia.com/clothing-server/imgServer/adminfile/
            }else {
                layer.msg(data.msg,function(){
                });
            }
        }
        ,error: function(){
            //请求异常回调
        }
    });
});

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
                param.timeStamp = util.createTimeStamp();
                //发异步，把数据提交给php
                $.ajax({
                    type: 'POST',
                    url: ctxPath + "adminServer/goodsAdd",
                    timeout:8000,
                    data : param,
                    headers: util.initHeaders(param),
                    dataType: 'json',
                    success: function(data){
                        if(data.code==200){
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
        var param = {};
        param.timeStamp = util.createTimeStamp();
        $.ajax({
            type:"post",
            url:ctxPath + "securityService/getSchoolList",
            data : param,
            headers: util.initHeaders(param),
            dataType:"json",
            success:function(data){
                if(data.code==200){
                    var cityStr = '';
                    $.each(data.data,function(index,value){
                        cityStr += '<option value="'+value.numId+'">'+value.vcSchoolName+'</option>'
                    });
                    $('#NUM_SCHOOL_ID').append(cityStr);
                    layui.form.render('select');
                }
            },
            error:function(){
                closeMsg();
            }
        });

        $.ajax({
            type:"post",
            url:ctxPath + "adminServer/goodsCategoryList",
            data : param,
            headers: util.initHeaders(param),
            dataType:"json",
            success:function(data){
                if(data.code==200){
                    var cityStr = '';
                    $.each(data.data,function(index,value){
                        cityStr += '<option value="'+value.categoryId+'">'+value.categoryName+'</option>'
                    });
                    $('#category_id').append(cityStr);
                    layui.form.render('select');
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
            headers: util.initHeaders(param),
            dataType:"json",
            success:function(data){
                if(data.code==200){
                    var cityStr = '';
                    $.each(data.data,function(index,value){
                        cityStr += '<option value="'+value.numId+'">'+value.vcModelName+'</option>'
                    });
                    $('#NUM_MODEL_ID').append(cityStr);
                    layui.form.render('select');
                }

            },
            error:function(){
                closeMsg();
            }
        });

        $.ajax({
            type:"post",
            url:ctxPath + "securityService/getClouthTypeList",
            data : param,
            headers: util.initHeaders(param),
            dataType:"json",
            success:function(data){
                if(data.code==200){
                    var cityStr = '';
                    $.each(data.data,function(index,value){
                        cityStr += '<option value="'+value.numId+'">'+value.vcCtypeName+'</option>'
                    });
                    $('#num_clouth_type_id').append(cityStr);
                    layui.form.render('select');
                }

            },
            error:function(){
                closeMsg();
            }
        });
    });

