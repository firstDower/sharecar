package com.dower.sharerideapp.service.clothing;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.repository.clothing.ClothingExtDao;
import com.dower.sharerideapp.core.serverdb.dao.ClProductMapper;
import com.dower.sharerideapp.core.serverdb.model.ClProduct;
import com.dower.sharerideapp.core.serverdb.model.ClProductExample;
import com.dower.sharerideapp.utils.CommUtil;
import com.dower.sharerideapp.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wangwei on 2020/6/24.
 */
@Slf4j
@Service
public class ClothingService {
    @Autowired
    private ClProductMapper clProductMapper;
    @Autowired
    private ClothingExtDao clothingExtDao;
    /**
     * {"NUM_HIGHT":"175","NUM_WIGHT":"65","VC_NAME":"张三","VC_PHONE":"15555551649","NUM_TYPE":"1"}
     * 创建定制衣服订单
     * @param params
     * @return
     */
    public Result creatProduct(String params){
        Result result = new Result(false,"创建定制衣服订单异常！");
        try{
            log.info("创建定制衣服订单param：{}",params);
            Long l = clothingExtDao.selectLastNumid();
            if(null==l)
                l=0l;
            JSONObject jsonparams = JSON.parseObject(params);
            ClProduct clProduct = new ClProduct();
            if (jsonparams.containsKey("VC_HIGHT")){
                clProduct.setVcHight(jsonparams.getString("VC_HIGHT"));
            }
            if (jsonparams.containsKey("VC_WIGHT")){
                clProduct.setVcWight(jsonparams.getString("VC_WIGHT"));
            }
            if (jsonparams.containsKey("VC_NAME")){
                clProduct.setVcName(jsonparams.getString("VC_NAME"));
            }
            clProduct.setVcPhone(jsonparams.getString("VC_PHONE"));
            clProduct.setNumType(jsonparams.getByte("NUM_TYPE"));
            if (jsonparams.containsKey("NUM_NUM")){
                clProduct.setNumNum(jsonparams.getByte("NUM_NUM"));
            }
            if (jsonparams.containsKey("NUM_PRICE")){
                clProduct.setNumPrice(new BigDecimal(jsonparams.getString("NUM_PRICE")));
            }
            if (jsonparams.containsKey("VC_USER_ID")){
                clProduct.setVcUserId(jsonparams.getString("VC_USER_ID"));
            }
            if (jsonparams.containsKey("VC_OPEN_ID")){
                clProduct.setVcOpenId(jsonparams.getString("VC_OPEN_ID"));
            }
            if (jsonparams.containsKey("VC_NOTES")){
                clProduct.setVcNotes(jsonparams.getString("VC_NOTES"));
            }
            if (jsonparams.containsKey("NUM_SCHOOL_ID"))
                clProduct.setNumSchoolId(jsonparams.getLong("NUM_SCHOOL_ID"));
            if (jsonparams.containsKey("NUM_GRADE_ID"))
                clProduct.setNumGradeId(jsonparams.getLong("NUM_GRADE_ID"));
            if (jsonparams.containsKey("NUM_MODEL_ID"))
                clProduct.setNumModelId(jsonparams.getLong("NUM_MODEL_ID"));
            if (jsonparams.containsKey("VC_UNION_ID"))
                clProduct.setVcUnionId(jsonparams.getString("VC_UNION_ID"));
            if (jsonparams.containsKey("NUM_PAR_TYPE"))
                clProduct.setNumParType(jsonparams.getByte("NUM_PAR_TYPE"));
            SimpleDateFormat sdf = new SimpleDateFormat("MMddHH");
            String dateNowStr = sdf.format(new Date());
            String vc_phone = jsonparams.getString("VC_PHONE");
            String last3S = CommUtil.getLast3S(String.valueOf(l + 1));
            String orderNo = "CU"+dateNowStr+vc_phone.substring(7)+last3S;
            clProduct.setVcOrderNo(orderNo);
            int i = clProductMapper.insertSelective(clProduct);
            result.setSuccess(true);
            result.setMsg("创建定制衣服订单成功！");
            log.info("创建定制衣服订单成功：{}",result);
        }catch (Exception e){
            e.printStackTrace();
            log.error("创建定制衣服订单异常！");
        }
        return result;
    }

    /**
     * 分页查询定制衣服列表
     * @param params
     * @return
     */
    public Result queryProductPage(String params){
        Result result = new Result(false,"查询定制衣服列表异常！");
        try{
            log.info("分页查询定制衣服列表param：{}",params);
            JSONObject jsonparams = JSON.parseObject(params);
            ClProductExample example = new ClProductExample();
            ClProductExample.Criteria criteria = example.createCriteria();
            if (jsonparams.containsKey("VC_USER_ID")&&StringUtils.isNotBlank(jsonparams.getString("VC_USER_ID"))){
                String vc_user_id = jsonparams.getString("VC_USER_ID");
                //administrator
                if(!"administrator".equalsIgnoreCase(vc_user_id))
                    criteria.andVcOpenIdEqualTo(vc_user_id);
            }else {
                result.setMsg("VC_OPEN_ID为必传参数！");
                return result;
            }
            if (jsonparams.containsKey("VC_NAME")&&StringUtils.isNotBlank(jsonparams.getString("VC_NAME")))
                criteria.andVcNameLike("%"+jsonparams.getString("VC_NAME")+"%");
            if (jsonparams.containsKey("VC_PHONE")&&StringUtils.isNotBlank(jsonparams.getString("VC_PHONE")))
                criteria.andVcPhoneLike("%"+jsonparams.getString("VC_PHONE")+"%");
            if (jsonparams.containsKey("NUM_TYPE")&&StringUtils.isNotBlank(jsonparams.getString("NUM_TYPE")))
                criteria.andNumTypeEqualTo(jsonparams.getByte("NUM_TYPE"));
            if (jsonparams.containsKey("NUM_STATE")&&StringUtils.isNotBlank(jsonparams.getString("NUM_STATE")))
                criteria.andNumStateEqualTo(jsonparams.getByte("NUM_STATE"));
            if (jsonparams.containsKey("NUM_ID")&&StringUtils.isNotBlank(jsonparams.getString("NUM_ID")))
                criteria.andNumIdEqualTo(jsonparams.getLong("NUM_ID"));
            Integer pageNum = 1;
            Integer pageSize = 10;
            if(jsonparams.containsKey("pageNum"))
                pageNum = jsonparams.getInteger("pageNum");
            if(jsonparams.containsKey("pageSize"))
                pageSize = jsonparams.getInteger("pageSize");
            example.setOrderByClause(" DAT_CREAT_TIME desc");
            PageHelper.startPage(pageNum, pageSize);
            List<ClProduct> clProducts = clProductMapper.selectByExample(example);
            PageInfo<ClProduct> pageInfo = new PageInfo<>(clProducts);
            result.setSuccess(true);
            result.setMsg("分页查询定制衣服列表成功！");
            result.setResultInfo(pageInfo);
            log.info("分页查询定制衣服列表成功：{}",result);
        }catch (Exception e){
            e.printStackTrace();
            log.error("分页查询定制衣服列表异常！");
        }
        return result;
    }

    /**
     * 分页查询定制衣服列表
     * @param params
     * @return
     */
    public Result queryProductPage2(String params){
        Result result = new Result(false,"查询定制衣服列表异常！");
        try{
            log.info("分页查询定制衣服列表param：{}",params);
            JSONObject jsonparams = JSON.parseObject(params);
            Map map = (Map) JSONObject.parseObject(params);

            if (jsonparams.containsKey("VC_USER_ID")&&StringUtils.isNotBlank(jsonparams.getString("VC_USER_ID"))){
                String vc_user_id = jsonparams.getString("VC_USER_ID");
                //administrator
                if("administrator".equalsIgnoreCase(vc_user_id))
                    map.remove("VC_USER_ID");
            }else {
                result.setMsg("VC_OPEN_ID为必传参数！");
                return result;
            }

            Integer pageNum = 1;
            Integer pageSize = 10;
            if(jsonparams.containsKey("pageNum"))
                pageNum = jsonparams.getInteger("pageNum");
            if(jsonparams.containsKey("pageSize"))
                pageSize = jsonparams.getInteger("pageSize");
            PageHelper.startPage(pageNum, pageSize);
            List<Map> clProducts = clothingExtDao.selectPageByExample(map);
            PageInfo pageInfo = new PageInfo(clProducts);
            result.setSuccess(true);
            result.setMsg("分页查询定制衣服列表成功！");
            result.setResultInfo(pageInfo);
            log.info("分页查询定制衣服列表成功：{}",result);
        }catch (Exception e){
            e.printStackTrace();
            log.error("分页查询定制衣服列表异常！");
        }
        return result;
    }

    public Result queryProductList(String params){
        Result result = new Result(false,"查询定制衣服列表异常！");
        try{
            log.info("查询定制衣服列表param：{}",params);
            JSONObject jsonparams = JSON.parseObject(params);
            ClProductExample example = new ClProductExample();
            ClProductExample.Criteria criteria = example.createCriteria();
            if (jsonparams.containsKey("VC_OPEN_ID")&&StringUtils.isNotBlank(jsonparams.getString("VC_OPEN_ID"))){
                String vc_open_id = jsonparams.getString("VC_OPEN_ID");
                if(!"administrator".equalsIgnoreCase(vc_open_id))
                    criteria.andVcOpenIdEqualTo(vc_open_id);
            }else {
                result.setMsg("VC_OPEN_ID 为必传参数！");
                return result;
            }
            if (jsonparams.containsKey("VC_NAME")&&StringUtils.isNotBlank(jsonparams.getString("VC_NAME")))
                criteria.andVcNameLike("%"+jsonparams.getString("VC_NAME")+"%");
            if (jsonparams.containsKey("VC_PHONE")&&StringUtils.isNotBlank(jsonparams.getString("VC_PHONE")))
                criteria.andVcPhoneLike("%"+jsonparams.getString("VC_PHONE")+"%");
            if (jsonparams.containsKey("NUM_TYPE")&&StringUtils.isNotBlank(jsonparams.getString("NUM_TYPE")))
                criteria.andNumTypeEqualTo(jsonparams.getByte("NUM_TYPE"));
            if (jsonparams.containsKey("NUM_STATE")&&StringUtils.isNotBlank(jsonparams.getString("NUM_STATE")))
                criteria.andNumStateEqualTo(jsonparams.getByte("NUM_STATE"));
            if (jsonparams.containsKey("NUM_ID")&&StringUtils.isNotBlank(jsonparams.getString("NUM_ID")))
                criteria.andNumIdEqualTo(jsonparams.getLong("NUM_ID"));
            if (jsonparams.containsKey("NUM_SCHOOL_ID")&&StringUtils.isNotBlank(jsonparams.getString("NUM_SCHOOL_ID")))
                criteria.andNumSchoolIdEqualTo(jsonparams.getLong("NUM_SCHOOL_ID"));
            if (jsonparams.containsKey("NUM_GRADE_ID")&&StringUtils.isNotBlank(jsonparams.getString("NUM_GRADE_ID")))
                criteria.andNumGradeIdEqualTo(jsonparams.getLong("NUM_GRADE_ID"));
            //NUM_MODEL_ID
            if (jsonparams.containsKey("NUM_MODEL_ID")&&StringUtils.isNotBlank(jsonparams.getString("NUM_MODEL_ID")))
                criteria.andNumModelIdEqualTo(jsonparams.getLong("NUM_MODEL_ID"));
            //VC_ORDER_NO
            if (jsonparams.containsKey("VC_ORDER_NO")&&StringUtils.isNotBlank(jsonparams.getString("VC_ORDER_NO")))
                criteria.andVcOrderNoLike("%"+jsonparams.getString("VC_ORDER_NO")+"%");
            example.setOrderByClause(" DAT_CREAT_TIME desc");
            List<ClProduct> clProducts = clProductMapper.selectByExample(example);
            result.setSuccess(true);
            result.setMsg("查询定制衣服列表成功！");
            result.setResultInfo(clProducts);
            log.info("查询定制衣服列表成功：{}",result);
        }catch (Exception e){
            e.printStackTrace();
            log.error("查询定制衣服列表异常！");
        }
        return result;
    }

    /**
     * 修改服装定制
     * @param params
     * @return
     */
    public Result updateProduct(String params){
        Result result = new Result(false,"修改服装定制异常！");
        try{
            log.info("修改服装定制param：{}",params);
            JSONObject jsonparams = JSON.parseObject(params);
            ClProduct clProduct = new ClProduct();
            if(!jsonparams.containsKey("NUM_ID")){
                result.setMsg("修改服装定制 ‘NUM_ID’为必传参数！");
                return result;
            }
            clProduct.setNumId(jsonparams.getLong("NUM_ID"));
            if (jsonparams.containsKey("VC_HIGHT")&&StringUtils.isNotBlank(jsonparams.getString("VC_HIGHT")))
                clProduct.setVcHight(jsonparams.getString("VC_HIGHT"));
            if (jsonparams.containsKey("VC_WIGHT")&&StringUtils.isNotBlank(jsonparams.getString("VC_WIGHT")))
                clProduct.setVcWight(jsonparams.getString("VC_WIGHT"));
            if (jsonparams.containsKey("VC_NAME")&&StringUtils.isNotBlank(jsonparams.getString("VC_NAME")))
                clProduct.setVcName(jsonparams.getString("VC_NAME"));
            if (jsonparams.containsKey("VC_PHONE")&&StringUtils.isNotBlank(jsonparams.getString("VC_PHONE")))
                clProduct.setVcPhone(jsonparams.getString("VC_PHONE"));
            if (jsonparams.containsKey("NUM_TYPE")&&StringUtils.isNotBlank(jsonparams.getString("NUM_TYPE")))
                clProduct.setNumType(jsonparams.getByte("NUM_TYPE"));
            if (jsonparams.containsKey("NUM_NUM")&&StringUtils.isNotBlank(jsonparams.getString("NUM_NUM")))
                clProduct.setNumNum(jsonparams.getByte("NUM_NUM"));
            if (jsonparams.containsKey("NUM_STATE")&&StringUtils.isNotBlank(jsonparams.getString("NUM_STATE"))){
                clProduct.setNumState(jsonparams.getByte("NUM_STATE"));
                if(2 ==jsonparams.getByte("NUM_STATE")){
                    clProduct.setDatConfirmTime(new Date());
                }
            }
            if (jsonparams.containsKey("NUM_SCHOOL_ID")&&StringUtils.isNotBlank(jsonparams.getString("NUM_SCHOOL_ID")))
                clProduct.setNumSchoolId(jsonparams.getLong("NUM_SCHOOL_ID"));
            if (jsonparams.containsKey("NUM_GRADE_ID")&&StringUtils.isNotBlank(jsonparams.getString("NUM_GRADE_ID")))
                clProduct.setNumGradeId(jsonparams.getLong("NUM_GRADE_ID"));
            if (jsonparams.containsKey("NUM_MODEL_ID")&&StringUtils.isNotBlank(jsonparams.getString("NUM_MODEL_ID")))
                clProduct.setNumModelId(jsonparams.getLong("NUM_MODEL_ID"));
            //VC_SIGN_DESC
            if (jsonparams.containsKey("VC_SIGN_DESC")&&StringUtils.isNotBlank(jsonparams.getString("VC_SIGN_DESC")))
                clProduct.setVcSignDesc(jsonparams.getString("VC_SIGN_DESC"));
            if (jsonparams.containsKey("NUM_PRICE")&&StringUtils.isNotBlank(jsonparams.getString("NUM_PRICE")))
                clProduct.setNumPrice(new BigDecimal(jsonparams.getByte("NUM_PRICE")));
            if (jsonparams.containsKey("VC_NOTES")&&StringUtils.isNotBlank(jsonparams.getString("VC_NOTES")))
                clProduct.setVcNotes(jsonparams.getString("VC_NOTES"));
            clProduct.setDatUpdateTime(new Date());
            int i = clProductMapper.updateByPrimaryKeySelective(clProduct);
            result.setSuccess(true);
            result.setMsg("查询定制衣服列表成功！");
            result.setResultInfo(i);
            log.info("查询定制衣服列表成功：{}",result);
        }catch (Exception e){
            e.printStackTrace();
            log.error("查询定制衣服列表异常！");
        }
        return result;
    }

}
