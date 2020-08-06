layui.use('table', function () {
    var table = layui.table;

    //第一个实例
    var tableIns = table.render({
        elem: '#orderList'
        , height: 'full-200'
        , url: ctxPath + 'adminServer/selectSharePage'
        , page: true //开启分页
        //,where: {VC_USER_ID: 'administrator'}
        , method: 'post'
        , contentType: 'application/x-www-form-urlencoded'
        , cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
        //, toolbar: '#toolbarDemo'
        , defaultToolbar: ['filter', 'exports', 'print', {
            title: '提示'
            , layEvent: 'LAYTABLE_TIPS'
            , icon: 'layui-icon-tips'
        }]
        , cols: [
            [ //表头
                //{type: 'checkbox', fixed: 'left'},
                /*{field: 'numId',width:'3%' , title: 'ID',  fixed: 'left'}
                 ,*/
                {field: 'VC_NICKNAME', title: '用户名'}
                , {field: 'VC_PHONE', title: '手机号'}
                , {field: 'finishOrderTotalNum', title: '完成订单数'}
                , {field: 'orderTotalNum', title: '分享订单总数'}
                , {field: 'num_settlement_state',fixed: 'right', title: '结算状态', templet:
                    function (d) {
                        var num_settlement_state = d.num_settlement_state;
                        if(num_settlement_state==2){
                            return '已结算';
                        }else {
                            return '未结算';
                        }

                    }
                }
                , { fixed: 'right', title: '操作', toolbar: '#barDemo'}
            ]
        ]
        , request: {
            pageName: 'pageNum' //页码的参数名称，默认：page
            , limitName: 'pageSize' //每页数据量的参数名，默认：limit
        }
        , parseData: function (res) { //res 即为原始返回的数据
            console.log(res);
            return {
                "code": res.code, //解析接口状态
                "msg": res.msg, //解析提示文本
                "count": res.data.total, //解析数据长度
                "data": res.data.list //解析数据列表
            };
        }
        , response: {
            statusCode: 200
        }

    });



    //监听行工具事件
    table.on('tool(orderList)', function (obj) {
        var data = obj.data;
        console.log("=====监听行工具事件=======" + JSON.stringify(data));
        if (obj.event === 'edit') {
            layer.confirm('确定修改结算状态？', function (index) {
                var param = {};
                param.VC_SHARE_USER_ID = data.VC_SHARE_USER_ID;
                var num_settlement_state = data.num_settlement_state;
                var numSettlementState = 2;
                if(num_settlement_state==2){
                    numSettlementState = 1;
                }else {
                    numSettlementState = 2;
                }
                param.numSettlementState = numSettlementState;
                param.timeStamp = util.createTimeStamp();
                $.ajax({
                    type: 'POST',
                    url: ctxPath + "adminServer/editUserShareOrderState",
                    timeout: 8000,
                    data: param,
                    headers: util.initHeaders(param),
                    dataType: 'json',
                    success: function (data) {
                        if (data.code==200) {

                            layer.close(index);
                            tableIns.reload();
                        } else {
                            layer.msg(data.msg, function () {
                            });
                        }
                    },
                    error: function (xhr, type) {
                    }
                });

            });
        } else if (obj.event === 'edit') {
            sessionStorage["pageData"] = JSON.stringify(data);
            xadmin.open('修改订单', './order-edit.html');
        }
    });

    /*条件查询，筛选*/
    var $ = layui.$, active = {
        reload: function () {
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
                    NUM_STATE: NUM_STATE,
                    VC_PHONE: VC_PHONE,
                    VC_NAME: VC_NAME,
                    NUM_PAR_TYPE: NUM_PAR_TYPE,
                    NUM_TYPE: NUM_TYPE,
                    NUM_MODEL_ID: NUM_MODEL_ID,
                    NUM_SCHOOL_ID: NUM_SCHOOL_ID,
                    NUM_GRADE_ID: NUM_GRADE_ID,
                    DAT_CREAT_TIME_START: DAT_CREAT_TIME_START,
                    DAT_CREAT_TIME_END: DAT_CREAT_TIME_END,
                    VC_ORDER_NO: VC_ORDER_NO
                }
                , page: {
                    curr: 1
                }
            });
        }
    };
    /*查询按钮*/
    $('#sreach').on('click', function () {
        active.reload();
    });

});

