package com.example.spring.boot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wing on 2017/7/18.
 */
@RestController
public class Login {
    @RequestMapping("/")
    public String login() {
        return "hello,world";
    }
}
