package com.proyecto.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;

@EnableSwagger2
@Configuration
public class swaggerConfig implements WebMvcConfigurer {
    public static final String PATH = "/myapi";

    @Bean
    public Docket usuarioApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.proyecto.api"))
                .paths(regex("/user.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "User API REST",
                "API REST. Methods to create, read, update and delete for software developer community.",
                "1.0.0",
                "Terms of Service",
                new Contact("Diego Quiroz Ramirez - (Software Developer)", "https://github.com/diegoquirozramirez",
                        "ingquirozramirez@gmail.com"),
                "MIT",
                ""
        );

        return apiInfo;
    }

/**    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController(PATH, "/");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(PATH + "/**").addResourceLocations("classpath:/META-INF/resources/");
    }
 */
}
