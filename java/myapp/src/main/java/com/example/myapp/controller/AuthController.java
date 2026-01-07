package com.example.myapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class AuthController {
    @PostMapping("/login")
    public String login() {
        return "Login Successful";
    }
    
}
