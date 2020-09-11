package com.gsm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
         * 添加拦截器
         */
        InterceptorRegistration ir = registry.addInterceptor(new GlobalInterceptor());
        /**
         * 配置拦截规则
         */
        ir.addPathPatterns("/**");
    }
}
