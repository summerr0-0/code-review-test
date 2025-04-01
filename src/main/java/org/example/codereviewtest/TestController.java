package org.example.codereviewtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    String testPassword = "password";

    @GetMapping
    public String test() {
        int a = 0;
        int b = 3;
        int c = 5;
        System.out.println(a+b+c);
        return testPassword;
    }
}
