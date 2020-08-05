$(function () {
    myShareList.init();
})
var myShareList = {
    init:function () {
        myShareList.getData();
    },
    getData:function () {
        var userInfo = JSON.parse(sessionStorage["userInfo"]);
        var userId = userInfo.NUM_USER_ID;
        var param = {};
        param.VC_USER_ID = userId;
        param.timeStamp = util.createTimeStamp();
        $.ajax({
            type: 'POST',
            url: ctxPath + "securityService/selectUserShareOrderList",
            timeout:8000,
            data : param,
            headers: util.initHeaders(param),
            dataType: 'json',
            success: function(data){
                console.log("========="+JSON.stringify(data));
                if(data.code==200){
                    var list = data.data;
                    myShareList.showPage(list);
                }else {

                }
            },
            error: function(xhr, type){
            }
        });
    },
    showPage:function (data) {
        var htmlStr = "";
        $.each(data,function (index,item) {

            var numState = item.NUM_STATE;
            var numStateStr = "";
            if(numState==1){
                numStateStr = "已预约"
            }else if(numState==2){
                numStateStr = "确定制作"
            }else if(numState==3){
                numStateStr = "取消"
            }else if(numState==4){
                numStateStr = "制作完成"
            }else if(numState==5){
                numStateStr = "待取货"
            }else if(numState==6){
                numStateStr = "制作修改"
            }else if(numState==7){
                numStateStr = "已完成"
            }
            var DAT_CREAT_TIME = item.DAT_CREAT_TIME;
            DAT_CREAT_TIME = DAT_CREAT_TIME.substr(0,10);
            htmlStr += '<tr>'+
                        '<td>'+DAT_CREAT_TIME+'</td>'+
                        '<td>'+numStateStr+'</td>'+
                        '<td>'+item.NUM_NUM+'</td>'+
                        '</tr>';
        })
        $("#dataUl").append(htmlStr);
    }
}