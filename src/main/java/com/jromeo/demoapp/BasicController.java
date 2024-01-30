package com.jromeo.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/johan")
    public String greetMaster() {
        return "Hello Johan!";
    }
}
