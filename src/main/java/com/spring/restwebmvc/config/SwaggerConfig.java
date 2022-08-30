package com.spring.restwebmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@EnableSwagger2
@EnableOpenApi
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/");
    }

    private ApiInfo metaData(){
        Contact contact = new Contact("Kaveen Prabodhya", "", "kaveen.djrock40@gmail.com");
        return new ApiInfo(
                "Spring Framework 5",
                "Spring Framework 5:  Rest services with spring mvc",
                "1.0",
                "Terms of Service: blah ba blah",
                contact,
                "Apache license version 2.0",
                "https:www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>()
        );
    }
}
