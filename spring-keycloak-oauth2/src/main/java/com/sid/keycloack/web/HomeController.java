package com.sid.keycloack.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/public")
    public String publicResource() {
        return "public Resource ";
    }

    @GetMapping("/protected")
    public String protectedResource() {
        return "protected Resource ";
    }
}
