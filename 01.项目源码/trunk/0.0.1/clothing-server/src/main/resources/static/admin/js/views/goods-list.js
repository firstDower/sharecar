layui.use('table', function(){
    var table = layui.table;

    //第一个实例
    var tableIns = table.render({
        elem: '#orderList'
        //,height: 312
        ,url: ctxPath + 'adminServer/goodsInfoPage'
        ,page: true //开启分页
        ,where: {VC_USER_ID: 'administrator'}
        ,method: 'post'
        ,contentType: 'application/x-www-form-urlencoded'
        ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
        ,toolbar: '#toolbarDemo'
        ,defaultToolbar: ['filter', 'exports', 'print', {
            title: '提示'
            ,layEvent: 'LAYTABLE_TIPS'
            ,icon: 'layui-icon-tips'
        }]
        ,cols: [
            [ //表头
                //{type: 'checkbox', fixed: 'left'},
                /*{field: 'numId',width:'3%' , title: 'ID',  fixed: 'left'}
                ,*/
                /*{field: 'product_id' ,  title: '商品id'}
                ,*/{field: 'product_name' ,  title: '商品名称' }
                ,{field: 'category_name' ,  title: '分类名称' }
                ,{field: 'VC_CTYPE_NAME' ,  title: '服装类型' }
                ,{field: 'VC_SCHOOL_NAME' , title: '学校名称'}
                ,{field: 'VC_MODEL_NAME' ,  titwidth:'10%' , title: '款式名称'}
                ,{field: 'num_state' ,  titwidth:'13%' , title: '页面优先级'}
                /*,{field: 'product_url' ,  title: '商品请求地址'}*/
                ,{field: 'num_product_price',  title: '商品价格',templet:function (d) {
                    var result = "";
                    var num_product_price = d.num_product_price;
                    return Number(num_product_price)/100;
                }}
                ,{field: 'publish_status', title: '发布状态',templet:function (d) {
                    var result = "";
                    var publish_status = d.publish_status;
                    if(publish_status==1){
                        result = "上架"
                    }else if(publish_status==2){
                        result = "下架"
                    }
                    return result;
                }}
                ,{field: 'descript',  title: '描述' }
                ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:140}
            ]
        ]
        ,request: {
            pageName: 'pageNum' //页码的参数名称，默认：page
            ,limitName: 'pageSize' //每页数据量的参数名，默认：limit
        }
       ,parseData: function(res){ //res 即为原始返回的数据
            console.log(res);
            return {
                "code": res.code, //解析接口状态
                "msg": res.msg, //解析提示文本
                "count": res.data.total, //解析数据长度
                "data": res.data.list //解析数据列表
            };
        }
        ,response:{
            statusCode:200
        }

    });

    //监听行工具事件
    table.on('tool(orderList)', function(obj){
        var data = obj.data;
        console.log("=====监听行工具事件======="+JSON.stringify(data));
        if(obj.event === 'del'){
            layer.confirm('真的删除行么', function(index){
                var param = {};
                var product_id = data.product_id;
                param.product_id = product_id;
                param.NUM_IS_DEL = 2;
                param.timeStamp = util.createTimeStamp();
                $.ajax({
                    type: 'POST',
                    url: ctxPath + "adminServer/goodsEdit",
                    timeout:8000,
                    data : param,
                    headers: util.initHeaders(param),
                    dataType: 'json',
                    success: function(data){
                        if(data.code==200){
                            obj.del();
                            layer.close(index);
                        }else {
                            layer.msg(data.msg,function(){
                            });
                        }
                    },
                    error: function(xhr, type){
                    }
                });

            });
        } else if(obj.event === 'edit'){
            sessionStorage["pageData"] = JSON.stringify(data);
            xadmin.open('修改订单','./goods-edit.html');
        }
    });

    /*条件查询，筛选*/
    var $ = layui.$, active = {
        reload: function(){
            var VC_ORDER_NO = $("#VC_ORDER_NO").val();
            var VC_PHONE = $('#VC_PHONE').val();
            var VC_NAME = $('#VC_NAME').val();
            var NUM_PAR_TYPE = $('#NUM_PAR_TYPE').val();
            var NUM_TYPE = $('#NUM_TYPE').val();
            var NUM_STATE = $('#NUM_STATE').val();
            var NUM_MODEL_ID = $('#NUM_MODEL_ID').val();
            var NUM_SCHOOL_ID = $('#NUM_SCHOOL_ID').val();
            var NUM_GRADE_ID = $('#NUM_GRADE_ID').val();
            var DAT_CREAT_TIME_START = $('#DAT_CREAT_TIME_START').val();
            var DAT_CREAT_TIME_END = $('#DAT_CREAT_TIME_END').val();
            tableIns.reload({
                where: {
                    VC_USER_ID: 'administrator',
                    NUM_STATE:NUM_STATE,
                    VC_PHONE:VC_PHONE,
                    VC_NAME:VC_NAME,
                    NUM_PAR_TYPE:NUM_PAR_TYPE,
                    NUM_TYPE:NUM_TYPE,
                    NUM_MODEL_ID:NUM_MODEL_ID,
                    NUM_SCHOOL_ID:NUM_SCHOOL_ID,
                    NUM_GRADE_ID:NUM_GRADE_ID,
                    DAT_CREAT_TIME_START:DAT_CREAT_TIME_START,
                    DAT_CREAT_TIME_END:DAT_CREAT_TIME_END,
                    VC_ORDER_NO:VC_ORDER_NO
                }
                ,page: {
                    curr: 1
                }
            });
        }
    };
    /*查询按钮*/
    $('#sreach').on('click', function(){
        active.reload();
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
        headers: util.initHeaders(param),
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
                    cityStr += '<option value="'+value.numId+'">'+value.vcModelName+'</option>'
                });
                $('#NUM_MODEL_ID').append(cityStr);
            }

        },
        error:function(){
            closeMsg();
        }
    });
});
