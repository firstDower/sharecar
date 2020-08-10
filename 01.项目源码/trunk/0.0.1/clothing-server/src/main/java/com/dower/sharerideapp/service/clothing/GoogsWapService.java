package com.dower.sharerideapp.service.clothing;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.repository.admin.GoodsExtDao;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangwei on 2020/8/10.
 */
@Service
public class GoogsWapService {
    @Autowired
    GoodsExtDao goodsExtDao;
    /**
     * wap端产品列表信息
     * @param jsonparams
     * @return
     */
    public RetResult selectGoodsListWap(JSONObject jsonparams){
        Map pram = new HashMap();
        List<Map> maps = goodsExtDao.selectGoodsListWap(pram);
        return RetResponse.makeOKRsp(maps);
    }
}
