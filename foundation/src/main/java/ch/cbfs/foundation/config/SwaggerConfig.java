package ch.cbfs.foundation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpSession;
import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .ignoredParameterTypes(HttpSession.class)
                .apiInfo(apiInfo())
                .securitySchemes(Collections.singletonList(apiKey()));
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "cbfs-identity APIs",
                "All available Apis for cbfs-identity. These APIs help to onboard the customer to our system.",
                "API v1",
                "Terms of service",
                new Contact("CBFS", "https://www.c-b-f-s.com/en/", "it@c-b-f-s.com"),
                "License of API", "API license URL", Collections.emptyList());
    }

    private ApiKey apiKey() {
        return new ApiKey("JSESSIONID", "api_key", "cookie");
    }

    @Bean
    public Docket swaggerApiV1() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("API V1")
                .select()
                .apis(RequestHandlerSelectors.basePackage("ch.cbfs.ident.rest.controller"))
                .paths(regex("/.*/v1.*"))
                .build()
                .apiInfo(new ApiInfoBuilder().version("1.0").title("API").description("Documentation API V1").build());
    }

    @Bean
    public Docket swaggerApiV2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("API V2")
                .select()
                .apis(RequestHandlerSelectors.basePackage("ch.cbfs.ident.rest.controller"))
                .paths(regex("/.*/v2.*"))
                .build()
                .apiInfo(new ApiInfoBuilder().version("2.0").title("API").description("Documentation API V2").build());
    }
}
