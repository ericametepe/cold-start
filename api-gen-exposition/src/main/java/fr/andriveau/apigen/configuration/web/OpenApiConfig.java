package fr.andriveau.apigen.configuration.web;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title(" Andriveau Omega Genealogy Application API")
                        .description("TAndriveau Omega Genealogy Application API RESTful service using springdoc-openapi and OpenAPI 3."));
    }

}
