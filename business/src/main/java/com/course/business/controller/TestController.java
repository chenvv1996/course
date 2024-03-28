package com.course.business.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: 测试
 * author: chenyj
 *
 * @date: 2024/3/28
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/getString")
    public String getString() {
        return "hello";
    }
}
