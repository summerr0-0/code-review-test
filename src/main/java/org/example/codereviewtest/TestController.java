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
        System.out.println(b+c);

        return testPassword;
    }

    public void testMethod() {
        System.out.println("This is a test method");
    }
}
