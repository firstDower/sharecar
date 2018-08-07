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

    /**
     * 获取权限详情
     * @param nnaRights
     * @return
     */
    @RequestMapping(value = "/getOneRight")
    public Result getOneRight(NnaRights nnaRights){
        return memberService.getOneRight(nnaRights);
    }

    /**
     * 菜单权限修改
     * @param nnaRights
     * @return
     */
    @RequestMapping(value="/updateRight")
    public Result updateRight(NnaRights nnaRights){
        return memberService.updataRight(nnaRights);
    }

    /**
     * 菜单权限添加
     * @param nnaRights
     * @return
     */
    @RequestMapping(value="/addRight")
    public Result addRight(NnaRights nnaRights){
        return memberService.addRight(nnaRights);
    }

    /**
     *权限列表分页查询
     * @param nnaRights
     * @param currentPage
     * @param pageSize
     * @return
     */
    @RequestMapping(value="/getRightPage")
    public Result getRightPage(NnaRights nnaRights, Integer currentPage, Integer pageSize) {
        if(currentPage == null){
            currentPage = 1;
        }
        if(pageSize == null){
            pageSize = 0;
        }
        Result pageRight = memberService.getPageRight(nnaRights, currentPage, pageSize);
        return pageRight;
    }

    /**
     * 测试：用户分页查询
     * @param currentPage
     * @param pageSize
     * @return
     */
    @RequestMapping(value="/getPageUser")
    public Result getPageUser(int currentPage, int pageSize) {
        Result pageRight = memberService.getPageUser( currentPage, pageSize);
        return pageRight;
    }



}
