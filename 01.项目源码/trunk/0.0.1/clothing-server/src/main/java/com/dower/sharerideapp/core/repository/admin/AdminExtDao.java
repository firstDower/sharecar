package com.dower.sharerideapp.core.repository.admin;

import com.github.pagehelper.Page;

import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 18:18   2018/8/6
 */

public interface AdminExtDao {
    Page<Map<String,String>> queryUserList();
    String getPasswordByUsername(Map param);
}
