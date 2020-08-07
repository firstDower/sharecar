package com.dower.sharerideapp.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by wangwei on 2020/8/7.
 */
@Slf4j
@Configuration
public class CustomerMvcConfigurerAdapter implements WebMvcConfigurer {
    @Value("${resourceLocations}")
    private String resourceLocations;
    /**
     * 添加静态资源文件，外部可以直接访问地址
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        log.info("resourceLocations::{}",resourceLocations);
        registry.addResourceHandler("/imgServer/**").addResourceLocations(resourceLocations);
    }
}

