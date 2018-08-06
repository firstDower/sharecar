package com.dower.sharerideadmin.service;

import com.dower.sharerideadmin.core.serverdb.dao.NnaRightsMapper;
import com.dower.sharerideadmin.core.serverdb.extDao.UsersExtDao;
import com.dower.sharerideadmin.core.serverdb.model.NnaRights;
import com.dower.sharerideadmin.core.serverdb.model.NnaRightsExample;
import com.dower.sharerideadmin.utils.Result;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 13:53   2018/8/6
 */
@Service
public class MemberService {
    private static final Logger log = LogManager.getLogger(MemberService.class);
    @Autowired
    private NnaRightsMapper nnaRightsMapper;
    @Autowired
    private UsersExtDao usersDao;
    /**
     * 添加菜单权限
     * @param nnaRights
     * @return
     */
    public Result addRight(NnaRights nnaRights){
        Result result = new Result();
        try{
            int i = nnaRightsMapper.insertSelective(nnaRights);
            if(i>0)
                result.setSuccess(true);
        }catch (Exception e){

        }
        return result;
    }

    /**
     * 跟新菜单权限
     * @param nnaRights
     * @return
     */
    public Result updataRight(NnaRights nnaRights){
        Result result = new Result();
        try{
            int i = nnaRightsMapper.updateByPrimaryKeySelective(nnaRights);
            if(i>0)
                result.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根据菜单id查询详情
     * @param nnaRights
     * @return
     */
    public Result getOneRight(NnaRights nnaRights){
        Result result = new Result();
        try{
            NnaRights nnaRights1 = nnaRightsMapper.selectByPrimaryKey(nnaRights.getNumRightId());
            result.setSuccess(true);
            result.setResultInfo(nnaRights1);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取权限list
     * @param nnaRights
     * @return
     */
    public Result getListRight(NnaRights nnaRights){
        Result result = new Result();
        try{
            NnaRightsExample nnaRightsExample = new NnaRightsExample();
            NnaRightsExample.Criteria criteria = nnaRightsExample.createCriteria();
            criteria.andNumStateEqualTo(1);//1:有效；2：无效；
            List<NnaRights> nnaRights1 = nnaRightsMapper.selectByExample(nnaRightsExample);
            result.setSuccess(true);
            result.setResultInfo(nnaRights1);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取权限page
     * @param nnaRights
     * @return
     */
    public Result getPageRight(NnaRights nnaRights,int currentPage,int pageSize){
        Result result = new Result();
        try{
            log.info("分页获取权限开始！");
            NnaRightsExample nnaRightsExample = new NnaRightsExample();
            NnaRightsExample.Criteria criteria = nnaRightsExample.createCriteria();
            criteria.andNumStateEqualTo(1);//1:有效；2：无效；
            PageHelper.startPage(currentPage, pageSize,true);
            List<NnaRights> nnaRightsPage = nnaRightsMapper.selectByExample(nnaRightsExample);
            PageInfo<NnaRights> pageInfo = new PageInfo<NnaRights>(nnaRightsPage);
            result.setSuccess(true);
            result.setResultInfo(pageInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
/**
     * 获取权限pageUsersDao
     * @param
     * @return
     */
    public Result getPageUser(int currentPage,int pageSize){
        Result result = new Result();
        try{
            log.info("分页开始！");
            PageHelper.startPage(currentPage, pageSize,true);
            Page<Map<String, String>> page = usersDao.queryUserList();

            result.setSuccess(true);
            result.setResultInfo(page);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

}
