layui.use('table', function(){
    var table = layui.table;

    //第一个实例
    var tableIns = table.render({
        elem: '#orderList'
        //,height: 312
        ,url: ctxPath + 'adminServer/queryPlatformCouponPage'
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
                {field: 'numId',width:'5%' ,  title: '优惠券id'}
                ,{field: 'vcCouponName',width:'8%' ,  title: '优惠券名称' }
                ,{field: 'numIssueTotal',width:'5%' ,  title: '发放总量' }
                ,{field: 'numDiscountType',width:'5%' ,  title: '优惠类型' }
                ,{field: 'numDiscountNumber',width:'8%' , title: '优惠金额'}
                ,{field: 'numHasDiscountLimit',width:'5%' ,  titwidth:'10%' , title: '是否有优惠限制'}
                ,{field: 'numLimitPrice',width:'5%' ,  title: '限制金额'}
                ,{field: 'numUserLimitNum',width:'8%' ,  title: '每人限制领取数量'}
                ,{field: 'numLimitDateType',width:'5%' ,  title: '限制日期类型'}
                ,{field: 'numAvailableDays',width:'5%' ,  title: '限制天数' }
                ,{field: 'numAvailableGoods',width:'5%' ,  title: '适用商品类型' }
                ,{field: 'vcInstructions',width:'13%' ,  title: '优惠说明' }
                ,{field: 'datCreatDate',width:'5%' , title: '创建时间'}
                ,{field: 'numCreatAdminUserId',width:'5%' ,  titwidth:'10%' , title: '创建人id'}
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
                var numId = data.numId;
                param.NUM_ID = numId;
                param.NUM_IS_DEL = 2;
                $.ajax({
                    type: 'POST',
                    url: ctxPath + "reposi/updateProduct",
                    timeout:8000,
                    data : JSON.stringify(param),
                    contentType: 'application/json',
                    dataType: 'json',
                    success: function(data){
                        if(data.success){
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
            xadmin.open('修改订单','./order-edit.html');
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

});
