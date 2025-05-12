package com.practice.reactpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MainController {
    @GetMapping("/api/hello")
    public String hello(){
        return "NOW: "+new Date()+"\n";
    }
}

