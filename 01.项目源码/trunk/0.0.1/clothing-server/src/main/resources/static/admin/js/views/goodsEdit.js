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
        var pageData = sessionStorage["pageData"]
        //alert(pageData);
        pageData = JSON.parse(pageData);
        initPage();
        function initPage() {


            $("#product_name").val(pageData.product_name);
            $("#num_product_price").val(Number(pageData.num_product_price)/100);

            $("#descript").val(pageData.descript);
            $("#pic_url").val(pageData.pic_url);
            $("#srcimgurl").attr("src",ctxPath + "/imgServer/" +pageData.pic_url);
            $("#publish_status").val(pageData.publish_status);
            $("#introduction").val(pageData.introduction);
            var product_id = pageData.product_id;


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
                        $("#NUM_SCHOOL_ID").val(pageData.num_school_id);
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
                        $("#category_id").val(pageData.category_id);
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
                        $("#NUM_MODEL_ID").val(pageData.num_model_id);
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
                        $("#num_clouth_type_id").val(pageData.num_clouth_type_id);
                        layui.form.render('select');
                    }

                },
                error:function(){
                    closeMsg();
                }
            });
        }

        //监听提交
        form.on('submit(goodsEdit)',
            function(data) {
                var param = data.field;
                param.num_product_price = param.num_product_price;
                param.product_id = pageData.product_id;
                param.timeStamp = util.createTimeStamp();

                //发异步，把数据提交给php
                $.ajax({
                    type: 'POST',
                    url: ctxPath + "adminServer/goodsEdit",
                    timeout:8000,
                    data : param,
                    headers: util.initHeaders(param),
                    dataType: 'json',
                    success: function(data){
                        if(data.code == 200){
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

