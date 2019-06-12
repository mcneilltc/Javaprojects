package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//allows you to output the results of the controller without the view
// provides hings for Spring that the class plays a specific role. Our class is a web @ controller
//so Spring considers it when handling incoming web requests
public class MainController {
// annotation that provides "routing" info. Tells spring that any http request with '/' path should be mapped to the home() method
    @RequestMapping("/")// the / means default, routes to the home function, render the screen and direct back to the call
    // because of the restcontroller annotation spring renders resulting string directly back to the caller.
    // In this case the caller is home method and string is returned.
    public String home(){
        return "Hello, World!";
    }
}
