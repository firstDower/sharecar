package com.dower.sharerideapp.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.service.admin.GoodsCategoryService;
import com.dower.sharerideapp.service.admin.GoodsService;
import com.dower.sharerideapp.utils.CommUtil;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 商品分类管理
 * Created by wangwei on 2020/7/7.
 */
@Slf4j
@RestController
@RequestMapping("/adminServer")
public class GoodsServerController {
    @Autowired
    GoodsCategoryService goodsCategoryService;
    @Autowired
    GoodsService goodsService;

    /**
     * 商品列表查询
     * @return
     */
    @RequestMapping("/goodsInfoPage")
    public RetResult goodsInfoPage(HttpServletRequest request) {
        JSONObject dataObj = CommUtil.getParamData(request);
        return goodsService.goodsInfoPage(dataObj);
    }

    /**
     * 商品列表查询
     * @return
     */
    @RequestMapping("/goodsAdd")
    public RetResult goodsAdd(HttpServletRequest request) {
        JSONObject dataObj = CommUtil.getParamData(request);
        return goodsService.goodsAdd(dataObj);
    }

    /**
     * 商品分类列表查询
     * @return
     */
    @RequestMapping("/goodsCategoryList")
    public RetResult goodsCategoryList(HttpServletRequest request) {
        JSONObject dataObj = CommUtil.getParamData(request);
        return goodsCategoryService.goodsCategoryList(dataObj);
    }
    /**
     * 商品分类列表查询
     * @return
     */
    @RequestMapping("/goodsCategoryPage")
    public RetResult productCategory(HttpServletRequest request) {
        JSONObject dataObj = CommUtil.getParamData(request);
        return goodsCategoryService.goodsCategoryPage(dataObj);
    }
}