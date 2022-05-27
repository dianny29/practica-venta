package com.proyecto.demo.venta.documentation;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class swagger {
	@Bean
	public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.proyecto.demo.venta.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo())
                ;		
	}
	
    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "Actividad Backend",
                "Acceso remoto",
                "1.0",
                null,
                new Contact("Dianny Escudero", null, ""),
                null,
                null,
                Collections.emptyList()
        );
    }
    
}
