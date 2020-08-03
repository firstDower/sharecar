$(function () {
    custom.init();
})
    var custom = {
        init:function () {
            $("#subBut").click(this.addOrder);
        },
        addOrder:function () {
            var param = {}
            var userInfo = JSON.parse(sessionStorage["userInfo"]);
            param.VC_USER_ID = userInfo.NUM_USER_ID;
            //1：定制；2 ：修改
            param.NUM_PAR_TYPE = 2;
            //param.NUM_TYPE = "3";
            param.NUM_PRICE = 0;

            var VC_NAME = $("#VC_NAME").val();

            param.VC_NAME = VC_NAME;
            var VC_PHONE = $("#VC_PHONE").val();
            if(!VC_PHONE){
                mui.toast("请输入联系手机号！");
                return false;
            }
            param.VC_PHONE = VC_PHONE;
            var VC_NOTES = $("#VC_NOTES").val();


            param.VC_NOTES = VC_NOTES;
            param.timeStamp = util.createTimeStamp();

            console.log("获取表单参数：："+JSON.stringify(param));

            $.ajax({
                type: 'POST',
                url: ctxPath + "securityService/creatProduct",
                timeout:8000,
                data : param,
                headers: util.initHeaders(param),
                dataType: 'json',
                success: function(data){
                    if(data.code==200){
                        var btnArray = ['否', '是'];
                        mui.confirm('确认去订单详情支付？', '添加定制成功!', btnArray, function(e) {
                            if (e.index == 1) {
                                var vcOrderNo = data.data;
                                sessionStorage['vcOrderNo'] = vcOrderNo
                                mui.openWindow({
                                    url:ctxPath + 'jump/weichat/modifyOrderDetail',
                                    id: "orderDetail",//详情页webview的id
                                    show: {
                                        aniShow: 'none', //页面不显示动画
                                        duration: '0' //
                                    }
                                });
                                //mui.toast("去订单详情！");
                            } else {
                                mui.toast("继续添加订单！");
                            }
                        })

                    }else {

                    }
                },
                error: function(xhr, type){
                }
            });
        }
    }