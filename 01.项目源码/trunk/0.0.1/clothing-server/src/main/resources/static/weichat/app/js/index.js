$(function () {
    index.init();
})
var index = {
    init:function () {
        util.checkToken();
        $("#customLi").click(function () {
            location.href= ctxPath + 'jump/weichat/custom';
        })
        $("#modifyLi").click(function () {
            location.href= ctxPath + 'jump/weichat/modify';
        })
    }
}