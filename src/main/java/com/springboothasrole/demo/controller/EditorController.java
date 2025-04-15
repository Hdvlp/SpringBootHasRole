package com.springboothasrole.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EditorController {

    @GetMapping("/editor")
    public String getMemberPage() {
        return new String("Editor page <a href=\"/user\">User page</a>");
    }

}
