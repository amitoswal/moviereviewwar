package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello World";
    }

    @GetMapping("/newmessage")
    public String showMessage(){
        return "Added a new method1";
    }
}
