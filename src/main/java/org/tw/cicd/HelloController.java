package org.tw.cicd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String helloWorld() {
        return "I am changing welcome message";
    }
    @RequestMapping("/index")
    public String helloWorldIndex() {
        return "First Index Changed";
    }
}
