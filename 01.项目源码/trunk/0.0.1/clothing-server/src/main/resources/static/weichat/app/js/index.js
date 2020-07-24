$(function () {
    index.init();
})
var index = {
    init:function () {
        $("#customLi").click(function () {
            location.href= ctxPath + 'jump/weichat/custom';
        })
    }
}