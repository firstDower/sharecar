package com.dower.sharerideapp.controller;

import com.dower.sharerideapp.service.ShiroSampleService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangwei on 2020/7/6.
 */
@RestController
public class ShiroSampleController {
    @Autowired
    private ShiroSampleService shiroSampleService;

    @GetMapping("/login2")
    public void login(String username, String password) {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        token.setRememberMe(true);
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.login(token);
    }

    @GetMapping("/logout")
    public void logout() {
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
    }

    @GetMapping("/read")
    public String read() {
        return this.shiroSampleService.read();
    }

    @GetMapping("/write")
    public String write() {
        return this.shiroSampleService.write();
    }
}
