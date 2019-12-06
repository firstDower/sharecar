package com.ihandy.tcfczhlhweb.web;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ihandy.tcfczhlhweb.biz.IEsbService;
import com.ihandy.tcfczhlhweb.utils.SignUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 19:03   2019/6/20
 */
@RequestMapping("/esbServer")
@RestController
public class EsbController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    IEsbService iEsbService;
    @Autowired
    private Environment env;
    /**
     * 创建投保单
     * @param params
     * @return
     */
    @RequestMapping("/creatOrder")
    public String creatTrip(String params){
        String sign = SignUtil.getSign(params);
        logger.info("创建投保单params="+params);
        long startTime = System.currentTimeMillis();
        String result = iEsbService.creatOrderSer(params, "zhlh", sign);
        long endTime = System.currentTimeMillis();
        logger.info("创建投保单result="+result);
        logger.info("创建投保单耗时t="+(endTime-startTime));
        return result;
    }

    /**
     * 获取职业信息
     * @param params
     * @return
     */
    @RequestMapping("/professionMessage")
    public String professionMessage(String params){
        String sign = SignUtil.getSign(params);
        logger.info("获取职业信息params="+params);
        long startTime = System.currentTimeMillis();
        String result = iEsbService.professionMessageSer(params, "zhlh", sign);
        long endTime = System.currentTimeMillis();
        logger.info("获取职业信息result="+result);
        logger.info("获取职业信息耗时t="+(endTime-startTime));
        return result;

        //return iEsbService.professionMessageSer(params,"zhlh",sign);
    }

    /**
     * 获取产品信息
     * @param params
     * @return
     */
    @RequestMapping("/getProductInfo")
    public String getProductInfo(){
        JSONObject jsonResult = new JSONObject();
        try{
            JSONObject param = new JSONObject();
            String productCode = env.getProperty("tcfx.object.productNo");
            param.put("productCode",productCode);
            String params = param.toString();
            String sign = SignUtil.getSign(params);
            logger.info("获取产品信息params="+params);
            long startTime = System.currentTimeMillis();
            String result = iEsbService.getProductInfoSer(params, "zhlh", sign);
            long endTime = System.currentTimeMillis();
            logger.info("获取产品信息result="+result);
            logger.info("获取产品信息耗时t="+(endTime-startTime));
            JSONObject jsonObject = JSONObject.parseObject(result);
            JSONObject scheme = jsonObject.getJSONObject("data").getJSONArray("scheme").getJSONObject(0);
            jsonResult.put("productNo",productCode);
            jsonResult.put("programmeCode",scheme.getString("code"));
        }catch(Exception e){
            e.printStackTrace();
            logger.error("获取产品信息异常");
        }
        return jsonResult.toString();
        //return iEsbService.getProductInfoSer(params,"zhlh",sign);
    }

    /**
     * 图片保存
     * @param params
     * @return
     */
    @RequestMapping("/savePicture")
    public String savePicture(String params){
        String sign = SignUtil.getSign(params);
        logger.info("上传签名图片开始");
        long startTime = System.currentTimeMillis();
        String result = iEsbService.savePictureSer(params, "zhlh", sign);
        long endTime = System.currentTimeMillis();
        logger.info("上传签名图片result="+result);
        logger.info("上传签名图片耗时t="+(endTime-startTime));
        return result;
    }

    /**
     * 更新订单支付状态
     * @param params
     * @return
     */
    @RequestMapping("/orderStateEdit")
    public String orderStateEdit(String params){
        String sign = SignUtil.getSign(params);
        logger.info("更新订单支付状态params="+params);
        long startTime = System.currentTimeMillis();
        String result = iEsbService.orderStateEditSer(params, "zhlh", sign);
        long endTime = System.currentTimeMillis();
        logger.info("更新订单支付状态result="+result);
        logger.info("更新订单支付状态耗时 t="+(endTime-startTime));
        return result;
        //return iEsbService.orderStateEditSer(params,"zhlh",sign);
    }

}
