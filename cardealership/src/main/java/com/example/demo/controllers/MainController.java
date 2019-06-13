package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {
    @RequestMapping("/")
    public String home(){return "Welcome to CarMatch";
    }
}
