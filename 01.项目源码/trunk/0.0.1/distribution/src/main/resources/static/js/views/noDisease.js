
$(function () {

    //二维码生成
    var qrcode = new QRCode(document.getElementById("qrcode"), {
        width : $('#qrcode').width(),
        height : $('#qrcode').height()
        /*width : 100,
        height : 100*/
    });
    var agentId = sessionStorage['agentId'];
    var dataStorage = JSON.parse(sessionStorage['dataStorage']);
    var prdCode = sessionStorage['prdCode'];
    var urlStr = updateQueryStringParameter(dataStorage[prdCode].prdPage,'agentId',sessionStorage['agentId']);





    function makeCode(obj) {
        if (!obj) {
            alert("Input a text");
            elText.focus();
            return;
        }
        qrcode.clear();
        qrcode.makeCode(obj);
        ;

    }

    main.init();
    makeCode(urlStr);
    setTimeout("main.html2Canvas()","500");
});
var main = {
    init:function(){
        var dataStorage = JSON.parse(sessionStorage['dataStorage']);
        var dataStr = dataStorage[sessionStorage['prdCode']];
         //$("#prdImgPath").attr("src",ctxPath+'display-img/'+dataStr.prdImgPath);
         $("#priceH1").html(dataStr.premium);
         $("#divHtml").html(dataStr.explain);
        var str = '<h1>￥152<i>起</i></h1> <p>首次投保年龄为出生30天至55周岁</p> <p>最高可续保至80周岁</p> <p>保障范围：105种重大疾病+50种轻症</p> <p>最高保额：60万</p> <p>保险期间：1年</p>';
        //$("#divHtml").html(str);

        main.setListener();

    },
    //设置监听事件
    setListener:function(){
        /*var btnShare = document.getElementById("shareContent");
        btnShare.onclick = function(){
            main.html2Canvas();
        }*/
    },
    //获取像素密度
    getPixelRatio:function(context){
        var backingStore = context.backingStorePixelRatio ||
            context.webkitBackingStorePixelRatio ||
            context.mozBackingStorePixelRatio ||
            context.msBackingStorePixelRatio ||
            context.oBackingStorePixelRatio ||
            context.backingStorePixelRatio || 1;
        return (window.devicePixelRatio || 1) / backingStore;
    },
    //绘制dom 元素，生成截图canvas
    html2Canvas: function () {
        var shareContent = document.getElementById("shareContent");// 需要绘制的部分的 (原生）dom 对象 ，注意容器的宽度不要使用百分比，使用固定宽度，避免缩放问题
        var width = shareContent.offsetWidth;  // 获取(原生）dom 宽度
        var height = shareContent.offsetHeight; // 获取(原生）dom 高
        var offsetTop = shareContent.offsetTop;  //元素距离顶部的偏移量

        var canvas = document.createElement('canvas');  //创建canvas 对象
        var context = canvas.getContext('2d');
        var scaleBy = main.getPixelRatio(context);  //获取像素密度的方法 (也可以采用自定义缩放比例)
        scaleBy = 1;
        canvas.width = width * scaleBy ;   //这里 由于绘制的dom 为固定宽度，居中，所以没有偏移
        canvas.height = (height + offsetTop) * scaleBy ;  // 注意高度问题，由于顶部有个距离所以要加上顶部的距离，解决图像高度偏移问题
        // 在canvas绘制前填充白色背景
        context.fillStyle = "#fff";
        context.fillRect(0, 0, canvas.width, canvas.height);
        context.scale(scaleBy, scaleBy);

        var opts = {
            allowTaint:true,//允许加载跨域的图片
            tainttest:true, //检测每张图片都已经加载完成
            scale:scaleBy, // 添加的scale 参数
            canvas:canvas, //自定义 canvas
            logging: true, //日志开关，发布的时候记得改成false
            width:width, //dom 原始宽度
            height:height //dom 原始高度
        };
        html2canvas(shareContent, opts).then(function (canvas) {
            console.log("html2canvas");
            // var body = document.getElementsByTagName("body");
            // body[0].appendChild(canvas);
            $("#dw").show();
            var img = main.convertCanvasToImage(canvas);
            console.log(img);
            //document.body.appendChild(img);
            $("#dw").append(img) //添加到展示图片div区域

            img.width = width*0.7;
            img.height = height*0.7;
            img.style.cssText="-webkit-box-shadow:0 0 10px #000;-moz-box-shadow:0 0 10px #000;box-shadow:0 0 10px #000;margin-top: 40px;border-radius:10px;";
            $("#shareContent").hide();
            //main.download(img.src);
            /*img.onload = function() {
             img.onload = null;
             canvas = main.convertImageToCanvas(img, 5, 5, 1024, 600); //设置图片大小和位置
             img.src = main.convertCanvasToImage(canvas).src;
             $(img).css({
             background:"#fff"
             });
             //调用下载方法
             //main.download(img.src);

             }*/
        });
    },
    //绘制显示图片
    convertCanvasToImage:function (canvas) {
        var image = new Image();
        image.src = canvas.toDataURL("image/png"); //获得图片地址
        return image;
    },
    //生成canvas元素，相当于做了一个装相片的框架
    convertImageToCanvas:function(image, startX, startY, width, height) {
        var canvas = document.createElement("canvas");
        canvas.width = width;
        canvas.height = height;
        canvas.getContext("2d").drawImage(image, startX, startY, width, height, 20, 20, 960, 600); //在这调整图片中内容的显示（大小,放大缩小,位置等）
        return canvas;
    },
    // 另存为图片
    download:function (src) {
        var $a = $("<a></a>").attr("href", src).attr("download", "img.png");
        $a[0].click();
    }
};