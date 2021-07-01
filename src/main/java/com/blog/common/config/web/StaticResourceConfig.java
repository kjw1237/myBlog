package com.blog.common.config.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class StaticResourceConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**",
                "/css/**"           ,
                "/js/**"            ,
                "/fa/**"            ,
                "/data-js/**"       ,
                "/fonts/**"         ,
                "/grid/**"          ,
                "/images/**"        ,
                "/login_css/**"     ,
                "/login_vendor/**"  ,
                "/scss/**")
                .addResourceLocations("classpath:/static/img/"  ,
                        "classpath:/static/css/"                ,
                        "classpath:/static/js/"                 ,
                        "classpath:/static/fontawesome/"        ,
                        "classpath:/static/data-js/"            ,
                        "classpath:/static/fonts/"              ,
                        "classpath:/static/grid/"               ,
                        "classpath:/static/images/"             ,
                        "classpath:/static/login_css/"          ,
                        "classpath:/static/login_vendor/"       ,
                        "classpath:/static/scss/");
    }
}
