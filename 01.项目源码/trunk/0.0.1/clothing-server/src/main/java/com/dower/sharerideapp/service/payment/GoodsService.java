package com.dower.sharerideapp.service.payment;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.serverdb.dao.ProductInfoMapper;
import com.dower.sharerideapp.core.serverdb.model.ProductInfo;
import com.dower.sharerideapp.core.serverdb.model.ProductInfoExample;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 13060 on 2020/8/1.
 */
@Slf4j
@Service
public class GoodsService {
    @Autowired
    private ProductInfoMapper productInfoMapper;

    /**
     * 分页查询商品信息列表
     * @param jsonparams
     * @return
     */
    public RetResult goodsInfoPage(JSONObject jsonparams){
        log.info("分页查询商品信息列表param：{}",jsonparams);
        Integer pageNum = 1;
        Integer pageSize = 10;
        if(jsonparams.containsKey("pageNum"))
            pageNum = jsonparams.getInteger("pageNum");
        if(jsonparams.containsKey("pageSize"))
            pageSize = jsonparams.getInteger("pageSize");
        PageHelper.startPage(pageNum, pageSize);
        ProductInfoExample exampleProductInfoExample = new ProductInfoExample();
        ProductInfoExample.Criteria criteria = exampleProductInfoExample.createCriteria();
        List<ProductInfo> productCategories = productInfoMapper.selectByExample(exampleProductInfoExample);
        PageInfo pageInfo = new PageInfo(productCategories);
        log.info("分页查询商品信息列表成功：{}",pageInfo);
        return RetResponse.makeOKRsp(pageInfo);
    }

    /**
     * 添加商品信息
     * @param jsonparams
     * @return
     */
    public RetResult addGoodsInfo(JSONObject jsonparams){
        ProductInfo recordProductInfo = new ProductInfo();
        recordProductInfo.setProductName(jsonparams.getString("productName"));
        recordProductInfo.setTwoCategoryId(jsonparams.getShort("twoCategoryId"));
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
        recordProductInfo.setTwoCategoryId(jsonparams.getShort("twoCategoryId"));
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
