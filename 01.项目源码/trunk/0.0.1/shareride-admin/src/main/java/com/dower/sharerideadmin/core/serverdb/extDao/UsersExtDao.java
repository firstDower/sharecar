package com.dower.sharerideadmin.core.serverdb.extDao;

import com.github.pagehelper.Page;

import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 18:18   2018/8/6
 */

public interface UsersExtDao {
    Page<Map<String,String>> queryUserList();
}
