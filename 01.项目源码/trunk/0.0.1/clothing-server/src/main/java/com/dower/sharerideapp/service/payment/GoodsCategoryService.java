package com.dower.sharerideapp.service.payment;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.serverdb.dao.NntPlatformCouponMapper;
import com.dower.sharerideapp.core.serverdb.dao.NntUserCouponsMapper;
import com.dower.sharerideapp.core.serverdb.dao.ProductCategoryMapper;
import com.dower.sharerideapp.core.serverdb.model.*;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by 13060 on 2020/8/1.
 */
@Slf4j
@Service
public class GoodsCategoryService {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    /**
     * 分页查询商品分类列表
     * @param jsonparams
     * @return
     */
    public RetResult goodsCategoryPage(JSONObject jsonparams){
        log.info("分页查询商品分类列表param：{}",jsonparams);
        Integer pageNum = 1;
        Integer pageSize = 10;
        if(jsonparams.containsKey("pageNum"))
            pageNum = jsonparams.getInteger("pageNum");
        if(jsonparams.containsKey("pageSize"))
            pageSize = jsonparams.getInteger("pageSize");
        PageHelper.startPage(pageNum, pageSize);
        ProductCategoryExample exampleProductCategoryExample = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = exampleProductCategoryExample.createCriteria();
        List<ProductCategory> productCategories = productCategoryMapper.selectByExample(exampleProductCategoryExample);
        PageInfo pageInfo = new PageInfo(productCategories);
        log.info("分页查询商品分类列表成功：{}",pageInfo);
        return RetResponse.makeOKRsp(pageInfo);
    }

    /**
     * 添加商品分类
     * @param jsonparams
     * @return
     */
    public RetResult addGoodsCategory(JSONObject jsonparams){
        ProductCategory recordProductCategory = new ProductCategory();
        recordProductCategory.setCategoryName(jsonparams.getString(""));
        recordProductCategory.setParentId(jsonparams.getInteger(""));
        int i = productCategoryMapper.insertSelective(recordProductCategory);
        return RetResponse.makeOKRsp();
    }

    /**
     * 编辑商品分类
     * @param jsonparams
     * @return
     */
    public RetResult editGoodsCategory(JSONObject jsonparams){
        ProductCategory recordProductCategory = new ProductCategory();
        recordProductCategory.setCategoryId(jsonparams.getInteger("numId"));
        recordProductCategory.setCategoryName(jsonparams.getString(""));
        recordProductCategory.setParentId(jsonparams.getInteger(""));
        int i = productCategoryMapper.updateByPrimaryKeySelective(recordProductCategory);
        return RetResponse.makeOKRsp();
    }

    /**
     * 查询商品分类
     * @param jsonparams
     * @return
     */
    public RetResult getGoodsCategory(JSONObject jsonparams){
        ProductCategory productCategory = productCategoryMapper.selectByPrimaryKey(jsonparams.getInteger("numId"));
        return RetResponse.makeOKRsp(productCategory);
    }

}
