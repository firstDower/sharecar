

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
            url:ctxPath + "securityService/getGradeList",
            data : param,
            headers: util.initHeaders(param),
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
                layui.form.render('select');
            },
            error:function(){
                closeMsg();
            }
        });
    });
layui.use('table', function(){
    var table = layui.table;

    //第一个实例
    var tableIns = table.render({
        elem: '#orderList'
        //,height: 312
        ,url: ctxPath + 'reposi/queryProductPage'
        ,page: true //开启分页
        ,where: {VC_USER_ID: 'administrator'}
        ,method: 'post'
        ,contentType: 'application/json'
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
                {field: 'vcOrderNo',width:'10%' ,  title: '订单编号',  sort: true}
                ,{field: 'vcName',width:'6%' ,  title: '姓名' }
                ,{field: 'vcPhone',width:'10%' ,  title: '手机号' }
                ,{field: 'vcSchoolName',width:'13%' ,  title: '学校' }
               /* ,{field: 'vcGradeName',width:'5%' ,  title: '年级'}*/
                ,{field: 'vcModelName',width:'5%' , title: '款式',  sort: true}
               /* ,{field: 'vcHight',width:'5%' ,  titwidth:'10%' , title: '身高'}
                ,{field: 'vcWight',width:'5%' ,  title: '体重'}
                ,{field: 'numNum',width:'5%' ,  title: '数量'}*/
                ,{field: 'numPrice',width:'5%' ,  title: '价格',templet:function (d) {
                    var result = "";
                    var numPrice = d.numPrice;
                    var numNum = d.numNum;
                    return Number(numPrice)/100*Number(numNum);
                }}
                ,{field: 'numTotalFee',width:'8%' ,  title: '实付款',templet:function (d) {
                    var result = "";
                    var numTotalFee = d.numTotalFee;
                    if(numTotalFee=='undefined'||typeof(numTotalFee) == "undefined"){
                        return 0;
                    }else {
                        return Number(numTotalFee)/100;
                    }

                }}
                ,{field: 'numState',width:'5%' ,  title: '状态',
                    templet: function(d){
                        var result = "";
                        var numState = d.numState;
                        if(numState==1){
                            result = "已预约"
                        }else if(numState==2){
                            result = "确认制作"
                        }else if(numState==3){
                            result = "取消制作"
                        }else if(numState==4){
                            result = "制作完成"
                        }else if(numState==5){
                            result = "通知取货"
                        }else if(numState==6){
                            result = "制作修改"
                        }else if(numState==7){
                            result = "订单完成"
                        }
                        return result;
                    }}
                ,{field: 'numPayState',width:'7%' ,  title: '支付状态',
                    templet: function(d){
                        var result = "";
                        var numPayState = d.numPayState;
                        if(numPayState==1){
                            result = "待支付"
                        }else if(numPayState==2){
                            result = "预支付"
                        }else if(numPayState==3){
                            result = "支付成功"
                        }else if(numPayState==4){
                            result = "支付失败"
                        }else if(numPayState==5){
                            result = "修改价格"
                        }
                        return result;
                    }}
                ,{field: 'numType',width:'6%' ,  title: '产品类别',
                    templet:function(d){
                        var result = "";
                        var numType = d.numType;
                        if(numType==1){
                            result = "校服裤"
                        }else if(numType==2){
                            result = "半袖"
                        }else if(numType==3){
                            result = "修改"
                        }else {
                            result = "其他"
                        }

                        return result;
                } }
                ,{field: 'numParType',width:'6%' ,  title: '种类',
                    templet:function(d){
                        var result = "";
                        var numParType = d.numParType;
                        if(numParType==1){
                            result = "定制"
                        }else if(numParType==2){
                            result = "修改"
                        }
                        return result;
                    } }
                ,{field: 'datCreatTime',width:'10%' ,  title: '创建时间', sort: true}
                /*,{field: 'vcNotes',width:'8%' ,  title: '用户备注'}
                ,{field: 'vcSignDesc',width:'8%' ,  title: '商家备注'}*/
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
                "count": res.resultInfo.total, //解析数据长度
                "data": res.resultInfo.list //解析数据列表
            };
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
