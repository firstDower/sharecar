package com.dower.sharerideapp.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangwei on 2020/7/24.
 */
@Slf4j
public class TokenTools {
    public static void main(String[] args) {
        //生成pro_name,pro_pass;
        String pro_name= RandomStringUtils.random(15, true, false);
        String pro_pass= RandomStringUtils.randomAlphanumeric(100);
        log.info("pro_name:==========:{}",pro_name);
        log.info("pro_pass:==========:{}",pro_pass);
    }
    /**
     * 生成token放入session
     *
     * @param request
     * @param tokenServerkey
     */
    public static void createToken(HttpServletRequest request, String tokenServerkey) {

        String token = "";

        request.getSession().setAttribute(tokenServerkey, token);

    }


    /**
     * 移除token
     *
     * @param request
     * @param tokenServerkey
     */

    public static void removeToken(HttpServletRequest request, String tokenServerkey) {

        request.getSession().removeAttribute(tokenServerkey);

    }


    /**
     * 判断请求参数中的token是否和session中一致
     *
     * @param request
     * @param tokenClientkey
     * @param tokenServerkey
     * @return
     */

    public static boolean judgeTokenIsEqual(HttpServletRequest request, String tokenClientkey, String tokenServerkey) {

        String token_client = request.getParameter(tokenClientkey);

        if (StringUtils.isEmpty(token_client)) {

            return false;

        }

        String token_server = (String) request.getSession().getAttribute(tokenServerkey);

        if (StringUtils.isEmpty(token_server)) {

            return false;

        }


        if (!token_server.equals(token_client)) {

            return false;

        }


        return true;

    }
}
