package com.dower.sharerideapp.service.admin;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.repository.admin.GoodsExtDao;
import com.dower.sharerideapp.core.serverdb.dao.ProductInfoMapper;
import com.dower.sharerideapp.core.serverdb.model.ProductInfo;
import com.dower.sharerideapp.core.serverdb.model.ProductInfoExample;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 13060 on 2020/8/1.
 */
@Slf4j
@Service
public class GoodsService {
    @Autowired
    private ProductInfoMapper productInfoMapper;
    @Autowired
    GoodsExtDao goodsExtDao;
    /**
     * 分页查询商品信息列表
     * @param jsonparams
     * @return
     */
    public RetResult goodsInfoPage(JSONObject jsonparams){
        Integer pageNum = 1;
        Integer pageSize = 10;
        if(jsonparams.containsKey("pageNum"))
            pageNum = jsonparams.getInteger("pageNum");
        if(jsonparams.containsKey("pageSize"))
            pageSize = jsonparams.getInteger("pageSize");
        PageHelper.startPage(pageNum, pageSize);
        Map pram = new HashMap();
        List<Map> maps = goodsExtDao.selectGoodsList(pram);
        PageInfo pageInfo = new PageInfo(maps);
        return RetResponse.makeOKRsp(pageInfo);
    }
    /**
     * 添加商品信息
     * @param jsonparams
     * @return
     */
    public RetResult goodsAdd(JSONObject jsonparams){
        ProductInfo productInfo = new ProductInfo();
        if (jsonparams.containsKey("category_id")&& StringUtils.isNotBlank(jsonparams.getString("category_id"))){
            productInfo.setCategoryId(jsonparams.getShort("category_id"));
        }
        if (jsonparams.containsKey("num_clouth_type_id")&& StringUtils.isNotBlank(jsonparams.getString("num_clouth_type_id"))){
            productInfo.setNumClouthTypeId(jsonparams.getLong("num_clouth_type_id"));
        }
        if (jsonparams.containsKey("NUM_SCHOOL_ID")&& StringUtils.isNotBlank(jsonparams.getString("NUM_SCHOOL_ID"))){
            productInfo.setNumSchoolId(jsonparams.getInteger("NUM_SCHOOL_ID"));
        }
        if (jsonparams.containsKey("NUM_MODEL_ID")&& StringUtils.isNotBlank(jsonparams.getString("NUM_MODEL_ID"))){
            productInfo.setNumModelId(jsonparams.getLong("NUM_MODEL_ID"));
        }
        if (jsonparams.containsKey("product_name")&& StringUtils.isNotBlank(jsonparams.getString("product_name"))){
            productInfo.setProductName(jsonparams.getString("product_name"));
        }
        if (jsonparams.containsKey("num_product_price")&& StringUtils.isNotBlank(jsonparams.getString("num_product_price"))){
            productInfo.setNumProductPrice(jsonparams.getInteger("num_product_price")*100);
        }
        if (jsonparams.containsKey("publish_status")&& StringUtils.isNotBlank(jsonparams.getString("publish_status"))){
            productInfo.setPublishStatus(jsonparams.getByte("publish_status"));
        }
        if (jsonparams.containsKey("descript")&& StringUtils.isNotBlank(jsonparams.getString("descript"))){
            productInfo.setDescript(jsonparams.getString("descript"));
        }
        if (jsonparams.containsKey("introduction")&& StringUtils.isNotBlank(jsonparams.getString("introduction"))){
            productInfo.setIntroduction(jsonparams.getString("introduction"));
        }
        if (jsonparams.containsKey("pic_url")&& StringUtils.isNotBlank(jsonparams.getString("pic_url"))){
            productInfo.setPicUrl(jsonparams.getString("pic_url"));
        }
        productInfo.setIndate(new Date());
        productInfo.setNumIsDel(Byte.parseByte("1"));
        int i = productInfoMapper.insertSelective(productInfo);
        return RetResponse.makeOKRsp(i);
    }

    /**
     * 添加商品信息
     * @param jsonparams
     * @return
     */
    public RetResult addGoodsInfo(JSONObject jsonparams){
        ProductInfo recordProductInfo = new ProductInfo();
        recordProductInfo.setProductName(jsonparams.getString("productName"));
        int i = productInfoMapper.insertSelective(recordProductInfo);
        return RetResponse.makeOKRsp();
    }

    /**
     * 编辑商品信息
     * @param jsonparams
     * @return
     */
    public RetResult editGoodsInfo(JSONObject jsonparams){
        ProductInfo recordProductInfo = new ProductInfo();
        recordProductInfo.setProductId(jsonparams.getInteger("productId"));
        recordProductInfo.setProductName(jsonparams.getString("productName"));
        int i = productInfoMapper.updateByPrimaryKeySelective(recordProductInfo);
        return RetResponse.makeOKRsp();
    }

    /**
     * 查询商品信息
     * @param jsonparams
     * @return
     */
    public RetResult getGoodsInfo(JSONObject jsonparams){
        ProductInfo productCategory = productInfoMapper.selectByPrimaryKey(jsonparams.getInteger("productId"));
        return RetResponse.makeOKRsp(productCategory);
    }

}
