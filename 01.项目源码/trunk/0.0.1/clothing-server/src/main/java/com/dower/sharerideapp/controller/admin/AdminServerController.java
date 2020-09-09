package com.dower.sharerideapp.controller.admin;

import com.dower.sharerideapp.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    /**
     * Created by wangwei on 2020/7/7.
     */
    @Slf4j
    @RestController
    @RequestMapping("/admin")
    public class AdminServerController {
        @RequestMapping("/login")
        public Result login(String username, String password) {
            Result result = new Result(false,"登录失败！");

            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            token.setRememberMe(true);
            Subject currentUser = SecurityUtils.getSubject();

            try {
                currentUser.login(token);
                result.setSuccess(true);
                result.setMsg("登录成功！");
            } catch (AuthenticationException e) {
                e.printStackTrace();
                result.setMsg("账号或密码错误！");
            } catch (AuthorizationException e) {
                e.printStackTrace();
                result.setMsg("没有权限");
            }
            return result;
        }


        @RequestMapping("/logout")
        public Result logout() {
            Result result = new Result(false,"登出失败！");
            try {
                Subject currentUser = SecurityUtils.getSubject();
                currentUser.logout();
                result.setSuccess(true);
            }catch (Exception e){
                e.printStackTrace();
                log.info("登出失败！");
            }
            return result;
        }
    }