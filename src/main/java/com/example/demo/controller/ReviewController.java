package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping("/message/{name}")
    public String anotherMessage(@PathVariable("name") String name){
        return "Hello "+name;
    }
}
