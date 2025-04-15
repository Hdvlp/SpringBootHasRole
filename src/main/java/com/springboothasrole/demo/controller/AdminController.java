package com.springboothasrole.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    
    @GetMapping("/admin")
    public String getUserPage() {
        return new String("Admin page <a href=\"/editor\">Editor page</a> <a href=\"/user\">User page</a>");
    }
    
}