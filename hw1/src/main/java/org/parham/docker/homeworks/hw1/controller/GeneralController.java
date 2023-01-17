package org.parham.docker.homeworks.hw1.controller;

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
public class GeneralController {
    private static final String AUTHOR_NAME = "Parham Ahmady";

    @GetMapping(path = "/author")
    public String author() {
        return AUTHOR_NAME;
    }
}
