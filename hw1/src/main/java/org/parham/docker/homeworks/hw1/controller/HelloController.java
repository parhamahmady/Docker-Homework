package org.parham.docker.homeworks.hw1.controller;

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
public class HelloController {

    @GetMapping()
    public String hello(@RequestParam(required = false) String name) {
        return StringUtils.hasLength(name) ? "Hello " + name : "Hello Stranger";
    }
}
