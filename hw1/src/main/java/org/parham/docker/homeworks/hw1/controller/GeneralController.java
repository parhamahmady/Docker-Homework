package org.parham.docker.homeworks.hw1.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Parham Ahmadi
 * This class represnted an general endpoint handler
 * @since 1/17/2023
 */
@RestController
@RequestMapping(path = "/")
@Tag(name = "General Controller")
public class GeneralController {
    private static final String AUTHOR_NAME = "Parham Ahmady";

    @GetMapping(path = "/author")
    @Operation(summary = "Author Information")
    @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(schema = @Schema(implementation = String.class)))
    public String author() {
        return AUTHOR_NAME;
    }
}
