package com.dower.sharerideapp.service;

import com.dower.sharerideapp.core.serverdb.dao.NntUsersMapper;
import com.dower.sharerideapp.core.serverdb.model.NntUsers;
import com.dower.sharerideapp.core.serverdb.model.NntUsersExample;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by wangwei on 2020/7/6.
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersServiceTest {
    @Autowired
    private NntUsersMapper nntUsersMapper;
    @Test
    public void test() throws Exception{
        NntUsersExample example = new NntUsersExample();
        NntUsersExample.Criteria criteria = example.createCriteria();
        criteria.andVcUnionidEqualTo("oDtaUw-SYC5fRkzQSmqx_wZ6Wyk0");
        List<NntUsers> Users = nntUsersMapper.selectByExample(example);

        NntUsers nntUsers = Users.get(0);
        String vcHeadImgUrl = nntUsers.getVcHeadImgUrl();
        if(null==vcHeadImgUrl|| StringUtils.isBlank(vcHeadImgUrl)){
            log.info("微信头像获取结果为：：{}",vcHeadImgUrl);
        }
        log.info("查询结果返回="+vcHeadImgUrl);
    }

}