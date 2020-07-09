$(function () {
    //$("#logout").click(index.logout);
})
layui.use(['laydate', 'form'],
    function() {
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
            elem: '#end' //指定元素
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
        ,cols: [
            [ //表头
                {field: 'numId',width:'3%' , title: 'ID',  fixed: 'left'}
                ,{field: 'vcName',width:'6%' ,  title: '姓名' }
                ,{field: 'vcPhone',width:'10%' ,  title: '手机号' }
                ,{field: 'vcOrderNo',width:'10%' ,  title: '订单编号',  sort: true}
                ,{field: 'vcSchoolName',width:'13%' ,  title: '学校' }
                ,{field: 'vcGradeName',width:'5%' ,  title: '年级'}
                ,{field: 'vcModelName',width:'5%' , title: '款式',  sort: true}
                ,{field: 'vcHight',width:'5%' ,  titwidth:'10%' , title: '身高'}
                ,{field: 'vcWight',width:'5%' ,  title: '体重'}
                ,{field: 'numNum',width:'5%' ,  title: '数量'}
                ,{field: 'numPrice',width:'5%' ,  title: '价格'}
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
                ,{field: 'vcNotes',width:'8%' ,  title: '用户备注'}
                ,{field: 'vcSignDesc',width:'8%' ,  title: '商家备注'}
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

    var $ = layui.$, active = {
        reload: function(){
            var NUM_STATE = $("#NUM_STATE").val();
            var VC_ORDER_NO = $("#VC_ORDER_NO").val();
            tableIns.reload({
                where: {
                    VC_USER_ID: 'administrator',
                    NUM_STATE:NUM_STATE,
                    VC_ORDER_NO:VC_ORDER_NO
                }
                ,page: {
                    curr: 1
                }
            });
        }
    };

    $('#sreach').on('click', function(){
        active.reload();
    });

});
