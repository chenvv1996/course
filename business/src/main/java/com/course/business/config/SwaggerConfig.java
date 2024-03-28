package com.course.business.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration  //配置类
@EnableSwagger2 // 开启Swagger2的自动配置
public class SwaggerConfig {
    @Bean //配置docket以配置Swagger具体参数
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 配置扫描接口的方式
                .apis(RequestHandlerSelectors.basePackage("com.course.business.controller"))
                .build()
                ;
    }

    //配置文档信息
    private ApiInfo apiInfo() {

        // 作者信息
        Contact contact = new Contact("陈毅健", "https://github.com/chenvv1996", "gd_chenyj@163.com");
        return new ApiInfo(
                "business-service",           // 标题
                "业务服务",                         // 描述
                "v1.0",                            // 版本
                "https://github.com/chenvv1996",  // 组织链接
                contact,                           // 联系人信息
                "Apach 2.0 许可",                   // 许可
                "许可链接",                          // 许可连接
                new ArrayList<>()                  // 扩展
        );
    }

}