package com.dower.sharerideapp.config;

import com.dower.sharerideapp.service.interceptor.SafeHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by wangwei on 2020/7/23.
 */
@Configuration
public class MyAppConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getHandlerInterceptor())
        .addPathPatterns("/securityService/**")
        .addPathPatterns("/apiService/**");
    }

    /*@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("*//**")
                .allowedHeaders("Content-Type", "x-requested-with", "X-Custom-Header")
                .allowedMethods("PUT", "POST", "GET", "DELETE", "OPTIONS")
                .allowedOrigins("*")
                .allowCredentials(true);
    }*/

    @Bean
    public HandlerInterceptor getHandlerInterceptor() {
        return new SafeHandlerInterceptor();
    }
}

