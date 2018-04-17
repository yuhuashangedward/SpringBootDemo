package com.alibaba.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWorld案例
 *
 * created by yuhuashang
 */

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello(){
        return "Hello , World! First demo for Spring boot!";

    }
}

