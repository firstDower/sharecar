package com.dower.sharerideapp.core.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 13:47   2018/6/28
 */
public interface UsersDao {
    public List<HashMap<String,Object>> queryUserList();
    public List<HashMap<String,Object>> queryUser();
    public HashMap<String,Object> queryUserinfoByOpenid(Map<String,Object> param);
}
