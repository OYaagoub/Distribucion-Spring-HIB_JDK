package com.yaagoub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {
    @GetMapping("login")
    public String login(){
        return "login";
    }
    @GetMapping("register")
    public String register(){
        return "register";
    }
}
