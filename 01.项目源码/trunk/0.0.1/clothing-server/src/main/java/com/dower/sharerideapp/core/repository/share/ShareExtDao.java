package com.dower.sharerideapp.core.repository.share;

import java.util.List;
import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 13:47   2018/6/28
 */
public interface ShareExtDao {
    List<Map> selectUserShareOrderList(Map param);
    List<Map> selectSharePage(Map param);
}
