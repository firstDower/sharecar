package com.dower.sharerideapp.service.share;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.repository.share.ShareExtDao;
import com.dower.sharerideapp.core.serverdb.dao.NntShareStatisticsSettlementMapper;
import com.dower.sharerideapp.core.serverdb.model.ClFnGrade;
import com.dower.sharerideapp.core.serverdb.model.ClFnGradeExample;
import com.dower.sharerideapp.core.serverdb.model.NntShareStatisticsSettlement;
import com.dower.sharerideapp.core.serverdb.model.NntShareStatisticsSettlementExample;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 13060 on 2020/8/4.
 */
@Slf4j
@Service
public class ShareService {
    @Autowired
    ShareExtDao shareExtDao;
    @Autowired
    NntShareStatisticsSettlementMapper nntShareStatisticsSettlementMapper;
    //selectUserShareOrderList
    /**
     * 管理后台统计分享列表
     * @return
     */
    public RetResult selectSharePage(JSONObject jsonparams){
        Integer pageNum = 1;
        Integer pageSize = 10;
        if(jsonparams.containsKey("pageNum"))
            pageNum = jsonparams.getInteger("pageNum");
        if(jsonparams.containsKey("pageSize"))
            pageSize = jsonparams.getInteger("pageSize");
        Map param = new HashMap();
        PageHelper.startPage(pageNum, pageSize);
        List<Map> maps = shareExtDao.selectSharePage(param);
        PageInfo pageInfo = new PageInfo(maps);
        log.info("管理后台统计分享列表成功：{}",pageInfo);
        return RetResponse.makeOKRsp(pageInfo);
    }

    /**
     * 查询用户分享订单列表
     * @return
     */
    public RetResult selectUserShareOrderList(JSONObject jsonObject){
        Map param = new HashMap();
        param.put("VC_USER_ID",jsonObject.getString("VC_USER_ID"));
        List<Map> maps = shareExtDao.selectUserShareOrderList(param);
        return RetResponse.makeOKRsp(maps);
    }

    /**
     * 管理后台统计分享列表
     * 修改结算状态
     * @return
     */
    public RetResult editUserShareOrderState(JSONObject jsonObject){

        NntShareStatisticsSettlementExample nntShareStatisticsSettlementExample = new NntShareStatisticsSettlementExample();
        NntShareStatisticsSettlementExample.Criteria criteria = nntShareStatisticsSettlementExample.createCriteria();
        criteria.andVcUserNoEqualTo(jsonObject.getString("VC_SHARE_USER_ID"));
        List<NntShareStatisticsSettlement> nntShareStatisticsSettlements = nntShareStatisticsSettlementMapper.selectByExample(nntShareStatisticsSettlementExample);
        if(nntShareStatisticsSettlements.size()==1){
            NntShareStatisticsSettlement nntShareStatisticsSettlement = nntShareStatisticsSettlements.get(0);
            nntShareStatisticsSettlement.setDatCreatTime(new Date());
            nntShareStatisticsSettlement.setNumSettlementState(jsonObject.getByte("numSettlementState"));
            nntShareStatisticsSettlementMapper.updateByPrimaryKeySelective(nntShareStatisticsSettlement);
        }else if(nntShareStatisticsSettlements.size()==0){
            NntShareStatisticsSettlement nntShareStatisticsSettlement = new NntShareStatisticsSettlement();
            nntShareStatisticsSettlement.setNumSettlementState(Byte.valueOf("2"));
            nntShareStatisticsSettlement.setDatCreatTime(new Date());
            nntShareStatisticsSettlement.setVcUserNo(jsonObject.getString("VC_SHARE_USER_ID"));
            nntShareStatisticsSettlementMapper.insertSelective(nntShareStatisticsSettlement);
        }else {
            RetResponse.makeErrRsp("统计分享结算数据异常");
        }
        return RetResponse.makeOKRsp();
    }
}
