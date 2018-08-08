package com.dower.sharerideadmin.controller.order;

import com.dower.sharerideadmin.core.serverdb.model.NnaAccounting;
import com.dower.sharerideadmin.service.AccountingService;
import com.dower.sharerideadmin.utils.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 19:52   2018/8/8
 */
@RequestMapping(value = "/accounting")
@RestController
public class AccountingController {
    private static final Logger log = LogManager.getLogger(AccountingController.class);
    @Autowired
    AccountingService accountingService;

    /**
     * 获取账务详情
     * @param nnaAccounting
     * @return
     */
    @RequestMapping(value = "/getOneAccounting")
    public Result getOneAccounting(NnaAccounting nnaAccounting){
        return accountingService.getOneAccounting(nnaAccounting);
    }

    /**
     * 账务修改
     * @param nnaAccounting
     * @return
     */
    @RequestMapping(value="/updateAccounting")
    public Result updateAccounting(NnaAccounting nnaAccounting){
        return accountingService.updataAccounting(nnaAccounting);
    }

    /**
     * 账务添加
     * @param nnaAccounting
     * @return
     */
    @RequestMapping(value="/addAccounting")
    public Result addAccounting(NnaAccounting nnaAccounting){
        return accountingService.addAccounting(nnaAccounting);
    }

    /**
     *账务分页查询
     * @param nnaAccounting
     * @param currentPage
     * @param pageSize
     * @return
     */
    @RequestMapping(value="/getAccountingPage")
    public Result getAccountingPage(NnaAccounting nnaAccounting, Integer currentPage, Integer pageSize) {
        if(currentPage == null){
            currentPage = 1;
        }
        if(pageSize == null){
            pageSize = 0;
        }
        Result pageAccounting = accountingService.getPageAccounting(nnaAccounting, currentPage, pageSize);
        return pageAccounting;
    }
}
