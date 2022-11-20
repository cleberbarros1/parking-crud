//package master.estacionamento.parking.config;
//import io.swagger.v3.oas.models.annotations.OpenAPI30;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
////import org.springframework.context.annotation.Bean;
////import org.springframework.stereotype.Component;
////import springfox.documentation.builders.ApiInfoBuilder;
////import springfox.documentation.builders.RequestHandlerSelectors;
////import springfox.documentation.service.ApiInfo;
////import springfox.documentation.service.Documentation;
////import springfox.documentation.spi.DocumentationType;
////import springfox.documentation.spring.web.plugins.Docket;
////import springfox.documentation.swagger2.annotations.EnableSwagger2;
////
////@Component
////@OpenAPI30
////public class SwaggerConfig {
////
////    private SecurityContext getSecurityContext() {
////        return SecurityContext.builder()
////                .securityReferences(Arrays.asList(basicAuthReference()))
////    }
////   // @Bean
////    public Docket getDocket(){
////    return new Docket(DocumentationType.SWAGGER_2)
////            .select()
////            .apis(RequestHandlerSelectors.basePackage("master.estacionamento.parking"))
////            .build()
////            .apiInfo(metaData());
////
////    }
////
////    private ApiInfo metaData() {
////        return new ApiInfoBuilder()
////                .title("Parking REST API")
////                .description("Spring Boot REST API for Parking")
////                .version("1.0.0")
////                .license("Apache License Version 2.0")
////                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
////                .build();
////    }
////
////}
