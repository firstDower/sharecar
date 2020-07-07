package com.dower.sharerideapp.core.repository.clothing;

import com.dower.sharerideapp.core.serverdb.model.ClProduct;
import com.dower.sharerideapp.core.serverdb.model.ClProductExample;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 13:47   2018/6/28
 */
public interface ClothingExtDao {
    List<Map> selectPageByExample(Map param);
    Long selectLastNumid();
}
