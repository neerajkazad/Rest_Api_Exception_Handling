package com.nk.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
public class GreetController {

    @GetMapping("/greet")
    public String getGreetMsg() {

        String greetMessage = "Hello World....!";

        return greetMessage;
    }
}
