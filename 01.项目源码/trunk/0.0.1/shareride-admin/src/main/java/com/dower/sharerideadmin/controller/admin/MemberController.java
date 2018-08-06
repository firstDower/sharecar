package com.dower.sharerideadmin.controller.admin;

import com.dower.sharerideadmin.core.serverdb.model.NnaRights;
import com.dower.sharerideadmin.service.MemberService;
import com.dower.sharerideadmin.utils.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 17:24   2018/8/6
 */
@RequestMapping(value = "/member")
@RestController
public class MemberController {
    private static final Logger log = LogManager.getLogger(MemberController.class);
    @Autowired
    MemberService memberService;

    @RequestMapping(value="/getRightPage")
    public Result getRightPage(NnaRights nnaRights, int currentPage, int pageSize) {
        Result pageRight = memberService.getPageRight(nnaRights, currentPage, pageSize);
        return pageRight;
    }
    @RequestMapping(value="/getPageUser")
    public Result getPageUser(int currentPage, int pageSize) {
        Result pageRight = memberService.getPageUser( currentPage, pageSize);
        return pageRight;
    }



}
