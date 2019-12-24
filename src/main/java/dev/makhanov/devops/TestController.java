package dev.makhanov.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    String hello() {
        int a = 5;
        int b = 6;
        int res = SomeLogic.addTwoNumber(a, b);
        return a + " + " + b + " = " + res;
    }
}
