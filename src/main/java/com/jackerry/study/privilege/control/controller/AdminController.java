package com.jackerry.study.privilege.control.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @fileName: AdminController
 * @description:
 * @author: jackerry
 * @date: 2022/6/17 21:22
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/greeting")
    public String greeting() {
        return "Hello,World!";
    }

    @GetMapping("/login")
    public String login() {

        return "login sucess";
    }
}
