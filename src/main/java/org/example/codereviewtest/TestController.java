package org.example.codereviewtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    String password = "password1234";
    @GetMapping("/test")
    public String test() {
        return password;
    }
}
