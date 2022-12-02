package com.jayus.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Description
 * @ Author jayus
 * @ Date 2022/12/3 3:06
 */
@RestController
public class TestController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}

