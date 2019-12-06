package com.ihandy.distribution;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.anything;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.asyncDispatch;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 14:58   2019/8/21
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class BaseTest {
    @Autowired
    protected WebApplicationContext wac;
    protected MockMvc mvc;
    protected MockHttpSession session;
    @Autowired
    protected RedisTemplate redisTemplate;

    @Before
    public void init() {
        mvc = MockMvcBuilders.webAppContextSetup(wac).build(); //初始化MockMvc对象
        session = new MockHttpSession();
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }

    protected ResultActions perform(MockHttpServletRequestBuilder builder) throws Exception {
        ResultActions resultActions = mvc.perform(builder);
        if (resultActions.andReturn().getRequest().isAsyncStarted()) {
            return mvc.perform(asyncDispatch(resultActions
                    .andExpect(request().asyncResult(anything()))
                    .andReturn()));
        } else {
            return resultActions;
        }
    }


    /*@RunWith(SpringJUnit4ClassRunner.class)
    public class CallableControllerTests extends AbstractMockMvcTests {

        @Test
        public void responseBodyAsync() throws Exception {
            perform(get("/async/callable/response-body"))
                    .andExpect(status().isOk())
                    .andExpect(content().contentType("text/plain;charset=ISO-8859-1"))
                    .andExpect(content().string("Callable result"));
        }

        @Test
        public void responseBodySync() throws Exception {
            perform(get("/sync/foobar/response-body"))
                    .andExpect(status().isOk())
                    .andExpect(content().contentType("text/plain;charset=ISO-8859-1"))
                    .andExpect(content().string("Sync result"));
        }
    }*/

}
