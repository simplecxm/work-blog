package com.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: Simple4H
 * @Date: 2019/02/27 11:06:59
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(ApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.simple.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo ApiInfo() {
        return new ApiInfoBuilder()
                .title("swagger2 test")
                .description("study for swagger2")
                .version("v1.0")
                .build();
    }
}
