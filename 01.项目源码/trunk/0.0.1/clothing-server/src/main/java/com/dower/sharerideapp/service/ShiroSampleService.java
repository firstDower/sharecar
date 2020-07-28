package com.dower.sharerideapp.service;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Service;

/**
 * Created by wangwei on 2020/7/6.
 */
@Service
public class ShiroSampleService {
    //@RequiresPermissions("read")
    public String read() {
        return "reading...";
    }

    //@RequiresPermissions("write")
    public String write() {
        return "writting...";
    }
}
