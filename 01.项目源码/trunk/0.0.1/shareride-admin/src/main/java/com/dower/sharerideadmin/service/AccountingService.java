package com.dower.sharerideadmin.service;

import com.dower.sharerideadmin.core.serverdb.dao.NnaAccountingMapper;
import com.dower.sharerideadmin.core.serverdb.model.NnaAccounting;
import com.dower.sharerideadmin.core.serverdb.model.NnaAccountingExample;
import com.dower.sharerideadmin.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 19:35   2018/8/8
 */
@Service
public class AccountingService {
    private static final Logger log = LogManager.getLogger(AccountingService.class);
    @Autowired
    private NnaAccountingMapper nnaAccountingMapper;
    /**
     * 添加账务
     * @param nnaAccounting
     * @return
     */
    public Result addAccounting(NnaAccounting nnaAccounting){
        Result result = new Result();
        try{
            int i = nnaAccountingMapper.insertSelective(nnaAccounting);
            if(i>0)
                result.setSuccess(true);
        }catch (Exception e){

        }
        return result;
    }

    /**
     * 更新账务
     * @param nnaAccounting
     * @return
     */
    public Result updataAccounting(NnaAccounting nnaAccounting){
        Result result = new Result();
        try{
            int i = nnaAccountingMapper.updateByPrimaryKeySelective(nnaAccounting);
            if(i>0)
                result.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根据账务id查询详情
     * @param nnaAccounting
     * @return
     */
    public Result getOneAccounting(NnaAccounting nnaAccounting){
        Result result = new Result();
        try{
            NnaAccounting nnaAccounting1 = nnaAccountingMapper.selectByPrimaryKey(nnaAccounting.getNumAccountingId());
            result.setSuccess(true);
            result.setResultInfo(nnaAccounting1);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取账务list
     * @param nnaAccounting
     * @return
     */
    public Result getListAccounting(NnaAccounting nnaAccounting){
        Result result = new Result();
        try{
            NnaAccountingExample nnaAccountingExample = new NnaAccountingExample();
            NnaAccountingExample.Criteria criteria = nnaAccountingExample.createCriteria();
            criteria.andNumStatusEqualTo(1);//1:有效；2：无效；
            List<NnaAccounting> nnaAccounting1 = nnaAccountingMapper.selectByExample(nnaAccountingExample);
            result.setSuccess(true);
            result.setResultInfo(nnaAccounting1);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取权限page
     * @param nnaAccounting
     * @return
     */
    public Result getPageAccounting(NnaAccounting nnaAccounting, int currentPage, int pageSize){
        Result result = new Result();
        try{
            log.info("分页获取权限开始！");
            NnaAccountingExample nnaAccountingExample = new NnaAccountingExample();
            NnaAccountingExample.Criteria criteria = nnaAccountingExample.createCriteria();
            criteria.andNumStatusEqualTo(1);
            PageHelper.startPage(currentPage, pageSize,true);
            List<NnaAccounting> nnaAccountingPage = nnaAccountingMapper.selectByExample(nnaAccountingExample);
            PageInfo<NnaAccounting> pageInfo = new PageInfo<NnaAccounting>(nnaAccountingPage);
            result.setSuccess(true);
            result.setResultInfo(pageInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
