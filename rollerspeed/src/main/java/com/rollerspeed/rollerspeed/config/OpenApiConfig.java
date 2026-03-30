package com.rollerspeed.rollerspeed.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "API RollerSpeed - Estudiantes",
        version = "1.0",
        description = "API para la gestión de estudiantes (CRUD completo)"
    )
)
public class OpenApiConfig {
}