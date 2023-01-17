package org.parham.docker.homeworks.hw1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author Parham Ahmadi
 * @since 1/17/2023
 */
@SpringBootApplication(scanBasePackages = "org.parham.docker.homeworks.hw1")
public class ApplicationLoader {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationLoader.class)
                .run(args);
    }
}
