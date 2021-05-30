package com.usermanagement.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usermanagement/welcome")
public class WelcomeController {
    

    @GetMapping
    public String welcome(){
        return "Welcome User Management";
    }

}
