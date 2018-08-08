package com.dower.sharerideadmin.controller.order;

import com.dower.sharerideadmin.core.serverdb.model.NnaOrder;
import com.dower.sharerideadmin.service.OrderService;
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
@RequestMapping(value = "/order")
@RestController
public class OrderController {
    private static final Logger log = LogManager.getLogger(OrderController.class);
    @Autowired
    OrderService orderService;

    /**
     * 获取订单详情
     * @param nnaOrder
     * @return
     */
    @RequestMapping(value = "/getOneOrder")
    public Result getOneOrder(NnaOrder nnaOrder){
        return orderService.getOneOrder(nnaOrder);
    }

    /**
     * 订单修改
     * @param nnaOrder
     * @return
     */
    @RequestMapping(value="/updateOrder")
    public Result updateOrder(NnaOrder nnaOrder){
        return orderService.updataOrder(nnaOrder);
    }

    /**
     * 订单添加
     * @param nnaOrder
     * @return
     */
    @RequestMapping(value="/addOrder")
    public Result addOrder(NnaOrder nnaOrder){
        return orderService.addOrder(nnaOrder);
    }

    /**
     *订单分页查询
     * @param nnaOrder
     * @param currentPage
     * @param pageSize
     * @return
     */
    @RequestMapping(value="/getOrderPage")
    public Result getOrderPage(NnaOrder nnaOrder, Integer currentPage, Integer pageSize) {
        if(currentPage == null){
            currentPage = 1;
        }
        if(pageSize == null){
            pageSize = 0;
        }
        Result pageOrder = orderService.getPageOrder(nnaOrder, currentPage, pageSize);
        return pageOrder;
    }
}
