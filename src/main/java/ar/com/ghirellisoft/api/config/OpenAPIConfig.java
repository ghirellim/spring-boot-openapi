package ar.com.ghirellisoft.api.config;


import ar.com.ghirellisoft.api.config.swagger.SwaggerHeaderDefault;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.parameters.Parameter;
import org.springdoc.core.GroupedOpenApi;
import org.springdoc.core.customizers.OperationCustomizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class OpenAPIConfig {
    @Value(value="${info.app.description}")
    private String description;
    @Value(value="${info.app.name}")
    private String apiName;
    @Value(value="${info.app.version}")
    private String version;



    @Bean
    public GroupedOpenApi OpenApi() {
        String packagesToscan[] = {"ar.com.ghirellisoft.api.controller"};
        return GroupedOpenApi
                .builder()
                .addOperationCustomizer(customize())
                .group("api")
                .packagesToScan(packagesToscan)
                .build();
    }



    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                .title(apiName)
                .version(version)
                .description(description)
                .termsOfService("http://swagger.io/terms/")
                .license(new License().name("Banco ghirellisoft S.A").url("https://www.ghirellisoft.com.ar")));

    }


    @Bean
    public OperationCustomizer customize() {
        return (operation, handlerMethod) -> operation.parameters(SwaggerHeaderDefault.getSwaggerHeader());
    }
}
