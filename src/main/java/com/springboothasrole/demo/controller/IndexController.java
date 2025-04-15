package com.springboothasrole.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class IndexController {
    
    @GetMapping("/")
    public String getIndex() {
        return String.format(
            "<div>Index page </div><div><a href=\"%s\">Register</a> </div><div><a href=\"%s\">Login</a> </div>",
            "/userRegister",
            "/login");
    }
    
}
