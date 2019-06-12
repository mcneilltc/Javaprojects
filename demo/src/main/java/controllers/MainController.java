package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//allows you to output the results of the controller without the view

public class MainController {

    @RequestMapping("/")// the / means default, routes to the home function, render the screen and direct back to the call
    public String home(){
        return "Hello, World!";
    }
}
