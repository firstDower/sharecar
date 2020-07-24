package com.dower.sharerideapp.service.annotation;

import java.lang.annotation.*;

/**
 * Created by wangwei on 2020/7/23.
 */
@Inherited
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PublicUrl {

    /**
     * 是否校验token合法性
     *
     * @return
     */
    boolean tokenValidate() default false;

    /**
     * 是否校验签名合法性
     *
     * @return
     */
    boolean signValidate() default false;
}
