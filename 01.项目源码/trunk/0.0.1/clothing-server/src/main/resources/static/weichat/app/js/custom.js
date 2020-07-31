$(function () {
    custom.init();
})
    var custom = {
        init:function () {
            custom.dataInit();
            $("#subBut").click(this.addOrder);
        },
        addOrder:function () {
            var param = {}
            var userInfo = JSON.parse(sessionStorage["userInfo"]);
            param.VC_USER_ID = userInfo.NUM_USER_ID;
            //1：定制；2 ：修改
            param.NUM_PAR_TYPE = 1;
            var NUM_TYPE = $("input[name='NUM_TYPE']:checked").val();
            param.NUM_TYPE = NUM_TYPE;
            var NUM_SCHOOL_ID = $("#NUM_SCHOOL_ID").val();
            param.NUM_SCHOOL_ID = NUM_SCHOOL_ID;
            var NUM_GRADE_ID = $("#NUM_GRADE_ID").val();
            param.NUM_GRADE_ID = NUM_GRADE_ID;
            var NUM_MODEL_ID = $("#NUM_MODEL_ID").val();
            param.NUM_MODEL_ID = NUM_MODEL_ID;

            var VC_HIGHT = $("#VC_HIGHT").val().trim();
            if(!VC_HIGHT){
                mui.toast("请输入身高！");
                return false;
            }
            param.VC_HIGHT = VC_HIGHT;
            var VC_WIGHT = $("#VC_WIGHT").val().trim();
            if(!VC_HIGHT){
                mui.toast("请输入体重！");
                return false;
            }
            param.VC_WIGHT = VC_WIGHT;
            var NUM_NUM = $("#NUM_NUM").val().trim();
            param.NUM_NUM = NUM_NUM;


            var VC_NAME = $("#VC_NAME").val().trim();

            param.VC_NAME = VC_NAME;
            var VC_PHONE = $("#VC_PHONE").val().trim();
            if(!checkMobile(VC_PHONE)){
                mui.toast("请输入正确的手机号！");
                return false;
            }
            param.VC_PHONE = VC_PHONE;

            var VC_NOTES = $("#VC_NOTES").val();


            param.VC_NOTES = VC_NOTES.trim();
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
                                //mui.toast("去订单详情！");
                                location.href= ctxPath + 'jump/weichat/orderList';
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
        },
        dataInit:function () {
            var param = {}
            param.timeStamp = util.createTimeStamp();
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
                    closeMsg();
                }
            });


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
        }
    }