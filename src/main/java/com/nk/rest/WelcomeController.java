package com.nk.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/greet")
    public String getGreetMessage() {
        String msg = "Welcome to REST API Good Afternoon....!";

        return msg;
    }
}
