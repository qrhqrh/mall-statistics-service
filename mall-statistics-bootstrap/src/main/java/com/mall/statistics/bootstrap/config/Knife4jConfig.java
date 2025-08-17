package com.mall.statistics.bootstrap.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Knife4j配置类
 */
@Configuration
public class Knife4jConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Mall Statistics Service API")
                        .description("商城统计服务接口文档")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Mall Team")
                                .email("team@mall.com")));
    }
}