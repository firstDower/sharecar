package com.dower.sharerideapp.service.share;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.repository.share.ShareExtDao;
import com.dower.sharerideapp.core.serverdb.model.ClFnGrade;
import com.dower.sharerideapp.core.serverdb.model.ClFnGradeExample;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 13060 on 2020/8/4.
 */
@Service
public class ShareService {
    @Autowired
    ShareExtDao shareExtDao;
    //selectUserShareOrderList
    /**
     * 查询用户分享订单列表
     * @return
     */
    public RetResult selectUserShareOrderList(JSONObject jsonObject){
        try{
            Map param = new HashMap();
            List<Map> maps = shareExtDao.selectUserShareOrderList(param);
            return RetResponse.makeOKRsp(maps);
        }catch (Exception e){
            e.printStackTrace();
            return RetResponse.makeErrRsp("查询班级信息异常！");
        }

    }
}
