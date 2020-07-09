$(function () {
    $("#logout").click(index.logout);
})
var index = {
    logout:function () {
        //layer.msg("111111111",function(){})
        $.ajax({
            type: 'POST',
            url: ctxPath + "admin/logout",
            timeout:8000,
            data : {},
            dataType: 'json',
            success: function(data){
                if(data.success){
                    location.href= ctxPath;
                }else {
                    layer.msg(data.msg,function(){
                    });
                }
            },
            error: function(xhr, type){
            }
        })
    }
}