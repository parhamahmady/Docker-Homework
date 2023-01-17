package org.parham.docker.homeworks.hw1.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

/**
 * @author Parham Ahmadi
 * @since 1/17/2023
 */
@Configuration
@OpenAPIDefinition(info = @Info(title = "Docker-HW1",
        description = "Docker-HW1 Api Documentation",
        license = @License(name = "Parham.org")))
public class SpringDocConfiguration {
}