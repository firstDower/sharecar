package com.dower.sharerideadmin.service;

import com.dower.sharerideadmin.core.serverdb.dao.NnaOrderMapper;
import com.dower.sharerideadmin.core.serverdb.model.NnaOrder;
import com.dower.sharerideadmin.core.serverdb.model.NnaOrderExample;
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
public class OrderService {
    private static final Logger log = LogManager.getLogger(OrderService.class);
    @Autowired
    private NnaOrderMapper nnaOrderMapper;
    /**
     * 添加订单
     * @param nnaOrder
     * @return
     */
    public Result addOrder(NnaOrder nnaOrder){
        Result result = new Result();
        try{
            int i = nnaOrderMapper.insertSelective(nnaOrder);
            if(i>0)
                result.setSuccess(true);
        }catch (Exception e){

        }
        return result;
    }

    /**
     * 更新订单
     * @param nnaOrder
     * @return
     */
    public Result updataOrder(NnaOrder nnaOrder){
        Result result = new Result();
        try{
            int i = nnaOrderMapper.updateByPrimaryKeySelective(nnaOrder);
            if(i>0)
                result.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根据订单id查询详情
     * @param nnaOrder
     * @return
     */
    public Result getOneOrder(NnaOrder nnaOrder){
        Result result = new Result();
        try{
            NnaOrder nnaOrder1 = nnaOrderMapper.selectByPrimaryKey(nnaOrder.getNumOrderId());
            result.setSuccess(true);
            result.setResultInfo(nnaOrder1);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取权限list
     * @param nnaOrder
     * @return
     */
    public Result getListOrder(NnaOrder nnaOrder){
        Result result = new Result();
        try{
            NnaOrderExample nnaOrderExample = new NnaOrderExample();
            NnaOrderExample.Criteria criteria = nnaOrderExample.createCriteria();
            criteria.andNumStatusEqualTo(1);//1:有效；2：无效；
            List<NnaOrder> nnaOrder1 = nnaOrderMapper.selectByExample(nnaOrderExample);
            result.setSuccess(true);
            result.setResultInfo(nnaOrder1);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取权限page
     * @param nnaOrder
     * @return
     */
    public Result getPageOrder(NnaOrder nnaOrder, int currentPage, int pageSize){
        Result result = new Result();
        try{
            log.info("分页获取权限开始！");
            NnaOrderExample nnaOrderExample = new NnaOrderExample();
            NnaOrderExample.Criteria criteria = nnaOrderExample.createCriteria();
            criteria.andNumStatusEqualTo(1);
            PageHelper.startPage(currentPage, pageSize,true);
            List<NnaOrder> nnaOrderPage = nnaOrderMapper.selectByExample(nnaOrderExample);
            PageInfo<NnaOrder> pageInfo = new PageInfo<NnaOrder>(nnaOrderPage);
            result.setSuccess(true);
            result.setResultInfo(pageInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
