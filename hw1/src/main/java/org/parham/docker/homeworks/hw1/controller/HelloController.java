package org.parham.docker.homeworks.hw1.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Parham Ahmadi
 * This class represented as an endpoint for resolving the path /hello
 * @since 1/17/2023
 */
@RestController
@RequestMapping(path = "/hello")
@Tag(name = "Hello Controller")
public class HelloController {

    @GetMapping
    @Operation(summary = "Hello")
    @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(schema = @Schema(implementation = String.class)))
    public String hello(@RequestParam(required = false) String name) {
        return StringUtils.hasLength(name) ? "Hello " + name : "Hello Stranger";
    }
}
