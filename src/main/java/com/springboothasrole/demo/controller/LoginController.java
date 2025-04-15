package com.springboothasrole.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        // Return the name of the Thymeleaf template (e.g., login.html)
        return "login";
    }

}

