package org.tw.cicd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String helloWorld() {
        return "Demo 0001";
    }
    @RequestMapping("/index")
    public String helloWorldIndex() {
        return "Demo Done";
    }
}
