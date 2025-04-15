package com.springboothasrole.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @GetMapping("/user")
    public String getUserPage() {
        return new String("User page");
    }
    
}