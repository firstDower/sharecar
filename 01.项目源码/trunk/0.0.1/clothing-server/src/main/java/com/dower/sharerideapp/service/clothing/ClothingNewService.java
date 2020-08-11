package com.dower.sharerideapp.service.clothing;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.repository.UsersDao;
import com.dower.sharerideapp.core.repository.clothing.ClothingExtDao;
import com.dower.sharerideapp.core.serverdb.dao.*;
import com.dower.sharerideapp.core.serverdb.model.*;
import com.dower.sharerideapp.service.exception.MyException;
import com.dower.sharerideapp.utils.CommUtil;
import com.dower.sharerideapp.utils.Result;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.implementation.bytecode.Throw;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangwei on 2020/6/24.
 */
@Slf4j
@Service
public class ClothingNewService {
    @Autowired
    private ClProductMapper clProductMapper;
    @Autowired
    private ClothingExtDao clothingExtDao;
    @Autowired
    private UsersDao usersDao;
    @Autowired
    private NntUserinfoMapper nntUserinfoMapper;
    @Autowired
    private NntUserCouponsMapper nntUserCouponsMapper;
    @Autowired
    private NntShareStatisticsMapper nntShareStatisticsMapper;
    @Autowired
    private NntUsersMapper nntUsersMapper;

    /**
     * {"NUM_HIGHT":"175","NUM_WIGHT":"65","VC_NAME":"张三","VC_PHONE":"15555551649","NUM_TYPE":"1"}
     * 创建定制衣服订单
     * 
     * @return
     */
    public RetResult creatProduct(JSONObject jsonparams){
        try{
            log.info("创建定制衣服订单param：{}",jsonparams);
            Long l = clothingExtDao.selectLastNumid();
            if(null==l)
                l=0l;
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
            if (jsonparams.containsKey("VC_PHONE")) {
                clProduct.setVcPhone(jsonparams.getString("VC_PHONE"));
            }
            if (jsonparams.containsKey("NUM_TYPE")) {
                clProduct.setNumType(jsonparams.getByte("NUM_TYPE"));
            }
            if (jsonparams.containsKey("NUM_NUM")){
                clProduct.setNumNum(jsonparams.getByte("NUM_NUM"));
            }
            if (jsonparams.containsKey("NUM_PRICE")&&StringUtils.isNotBlank(jsonparams.getString("NUM_PRICE"))){
                clProduct.setNumPrice(jsonparams.getLong("NUM_PRICE"));
            }else {
                clProduct.setNumPrice(Long.valueOf("7000"));
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
            if (jsonparams.containsKey("VC_SIGN_DESC"))
                clProduct.setVcSignDesc(jsonparams.getString("VC_SIGN_DESC"));
            //product_id
            if (jsonparams.containsKey("product_id")&&StringUtils.isNotBlank(jsonparams.getString("product_id"))){
                clProduct.setNumProductId(jsonparams.getLong("product_id"));
            }
            clProduct.setDatCreatTime(new Date());
            SimpleDateFormat sdf = new SimpleDateFormat("MMddHH");
            String dateNowStr = sdf.format(new Date());
            String vc_phone = jsonparams.getString("VC_PHONE");
            String last3S = CommUtil.getLast3S(String.valueOf(l + 1));

            long num_par_type = jsonparams.getLong("product_id");
            String typeHeadStr = "";
            if(num_par_type==1){
                typeHeadStr = "MC";
            }else{
                typeHeadStr = "CU";
            }

            String orderNo = typeHeadStr+dateNowStr+vc_phone.substring(7)+last3S;
            clProduct.setVcOrderNo(orderNo);
            int i = clProductMapper.insertSelective(clProduct);
            String vcOrderNo = clProduct.getVcOrderNo();
            //添加到分享数据表
            if (jsonparams.containsKey("shareUserId")&&StringUtils.isNotBlank(jsonparams.getString("shareUserId"))){
                String shareUserId = jsonparams.getString("shareUserId");
                String vc_user_id = jsonparams.getString("VC_USER_ID");
                if(!shareUserId.equals(vc_user_id)){
                    NntShareStatistics recordNntShareStatistics = new NntShareStatistics();
                    recordNntShareStatistics.setDatCreatTime(new Date());
                    recordNntShareStatistics.setVcOrderNo(vcOrderNo);
                    recordNntShareStatistics.setVcShareUserId(jsonparams.getString("shareUserId"));
                    nntShareStatisticsMapper.insertSelective(recordNntShareStatistics);
                    log.info("用户分享，插入分享数据成功");
                }else {
                    log.info("用户自己给自己分享，订单不做分享记录！");
                }
            }
            //如果用户手机号为空，更新手机号到用户信息表
            NntUsersExample nntUsersExample = new NntUsersExample();
            NntUsersExample.Criteria criteria = nntUsersExample.createCriteria();
            criteria.andNumUserIdEqualTo(jsonparams.getString("VC_USER_ID"));
            List<NntUsers> nntUsers = nntUsersMapper.selectByExample(nntUsersExample);
            NntUsers nntUsers1 = nntUsers.get(0);
            String vcPhone = nntUsers1.getVcPhone();
            if(StringUtils.isBlank(vcPhone)){
                nntUsers1.setVcPhone(vc_phone);
                int i1 = nntUsersMapper.updateByPrimaryKey(nntUsers1);
            }
            log.info("创建定制衣服订单成功：{}",i);
            return RetResponse.makeOKRsp(vcOrderNo);
        }catch (Exception e){
            e.printStackTrace();
            log.error("创建定制衣服订单异常！");
            return RetResponse.makeErrRsp("创建定制衣服订单异常！");
        }
    }

    /**
     * 分页查询定制衣服列表
     * @param jsonparams
     * @return
     */
    public RetResult queryProductPage2(JSONObject jsonparams){
        try{
            log.info("分页查询定制衣服列表param：{}",jsonparams);
            Map map = (Map) JSONObject.parseObject(jsonparams.toJSONString());

            if (jsonparams.containsKey("VC_USER_ID")&&StringUtils.isNotBlank(jsonparams.getString("VC_USER_ID"))){
                String vc_user_id = jsonparams.getString("VC_USER_ID");
                //administrator
                if("administrator".equalsIgnoreCase(vc_user_id))
                    map.remove("VC_USER_ID");
            }else {
                return RetResponse.makeErrRsp("VC_USER_ID为必传参数！");
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
            log.info("分页查询定制衣服列表成功：{}",pageInfo);
            return RetResponse.makeOKRsp(pageInfo);
        }catch (Exception e){
            e.printStackTrace();
            log.error("分页查询定制衣服列表异常！");
            return RetResponse.makeErrRsp("分页查询定制衣服列表异常！");
        }
    }

    /**
     * 修改服装定制
     * 
     * @return
     */
    public RetResult updateProduct(JSONObject jsonparams){
        try{
            log.info("修改服装定制param：{}",jsonparams);
            ClProduct clProduct = new ClProduct();
            if(!jsonparams.containsKey("NUM_ID")){
                return RetResponse.makeErrRsp("修改服装定制 ‘NUM_ID’为必传参数！");
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
            if (jsonparams.containsKey("VC_EXPIRE_TIME")&&StringUtils.isNotBlank(jsonparams.getString("VC_EXPIRE_TIME")))
                clProduct.setVcExpireTime(jsonparams.getString("VC_EXPIRE_TIME"));
            if (jsonparams.containsKey("NUM_PRICE")&&StringUtils.isNotBlank(jsonparams.getString("NUM_PRICE")))
                clProduct.setNumPrice(jsonparams.getLong("NUM_PRICE"));
            if (jsonparams.containsKey("VC_NOTES")&&StringUtils.isNotBlank(jsonparams.getString("VC_NOTES")))
                clProduct.setVcNotes(jsonparams.getString("VC_NOTES"));
            clProduct.setDatUpdateTime(new Date());
            if (jsonparams.containsKey("NUM_IS_DEL")&&StringUtils.isNotBlank(jsonparams.getString("NUM_IS_DEL")))
                clProduct.setNumIsDel(jsonparams.getByte("NUM_IS_DEL"));
            if (jsonparams.containsKey("NUM_PAY_STATE")&&StringUtils.isNotBlank(jsonparams.getString("NUM_PAY_STATE")))
                clProduct.setNumPayState(jsonparams.getByte("NUM_PAY_STATE"));
            if (jsonparams.containsKey("NUM_PAY_TYPE")&&StringUtils.isNotBlank(jsonparams.getString("NUM_PAY_TYPE")))
                clProduct.setNumPayType(jsonparams.getByte("NUM_PAY_TYPE"));
            int i = clProductMapper.updateByPrimaryKeySelective(clProduct);
            log.info("查询定制衣服列表成功：{}",i);
            return RetResponse.makeOKRsp(i);
        }catch (Exception e){
            e.printStackTrace();
            log.error("查询定制衣服列表异常！");
            return RetResponse.makeErrRsp("查询定制衣服列表异常！");
        }
    }

    /**
     * 根据userid查询用户信息
     * 
     * @return
     */
    public RetResult getUserInfo(JSONObject jsonparams) {
        try{
            log.info("根据userid获取用户信息param：{}",jsonparams);
            Map<String,Object> param = new HashMap<>();
            param.put("userId",jsonparams.getString("userId"));
            HashMap<String, Object> stringObjectHashMap = usersDao.queryUser(param);
            return RetResponse.makeOKRsp(stringObjectHashMap);
        }catch (Exception e){
            e.printStackTrace();
            log.error("获取用户信息异常！");
            return RetResponse.makeErrRsp("获取用户信息异常！");
        }
    }

    /**
     * 查询定制详情
     * @param jsonparams
     * @return
     */
    public RetResult getClothing(JSONObject jsonparams) {
        try{
            log.info("查询定制详情param：{}",jsonparams);
            ClProduct clProduct = clProductMapper.selectByPrimaryKey(jsonparams.getLong("numOrderId"));
            log.info("查询定制详情成功！：：{}",clProduct);
            return RetResponse.makeOKRsp(clProduct);
        }catch (Exception e){
            e.printStackTrace();
            log.error("查询定制详情异常！");
            return RetResponse.makeErrRsp("查询定制详情异常！");
        }
    }

    /**
     * 查询订单详情
     * @param jsonparams
     * @return
     */
    public RetResult getOrderDetail(JSONObject jsonparams) {
        try{
            log.info("查询订单详情param：{}",jsonparams);
            Map paramMap = new HashMap();
            paramMap.put("vcOrderNo",jsonparams.getString("vcOrderNo"));
            paramMap.put("vcUserId",jsonparams.getString("vcUserId"));
            Map orderDetail = clothingExtDao.selectOrderDetail(paramMap);
            NntUserinfoExample nntUserinfoExample = new NntUserinfoExample();
            NntUserinfoExample.Criteria criteriaNntUserinfoExample = nntUserinfoExample.createCriteria();
            criteriaNntUserinfoExample.andNumUserIdEqualTo(jsonparams.getString("vcUserId"));
            List<NntUserinfo> nntUserinfos = nntUserinfoMapper.selectByExample(nntUserinfoExample);
            if(nntUserinfos.size()!=1){
                throw new MyException("用户信息异常");
            }

            /**
             * 商品类型  numPerType
             * 商品总价  numTotalFee * numNum
             * 用户id   vcUserId
             */
            long numNum = Long.parseLong(String.valueOf(orderDetail.get("numNum")));
            long numPrice = Long.parseLong(String.valueOf(orderDetail.get("numPrice")));
            String numParType = String.valueOf(orderDetail.get("numParType"));
            paramMap.put("numParType",numParType);
            paramMap.put("numTotalFee",numPrice*numNum);
            List<Map> userCouponList = clothingExtDao.selectUserCouponList(paramMap);



            Map result = new HashMap();
            result.put("orderDetail",orderDetail);
            result.put("userinfo",nntUserinfos.get(0));
            result.put("userCoupons",userCouponList);
            log.info("查询订单详情成功！：：{}",JSON.toJSONString(result));
            return RetResponse.makeOKRsp(result);
        }catch (Exception e){
            e.printStackTrace();
            log.error("查询订单详情异常！");
            return RetResponse.makeErrRsp("查询订单详情异常！");
        }
    }

}
