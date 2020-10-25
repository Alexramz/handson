package com.alexjavarestwebservices.alexramirez.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainPage {

    @GetMapping("")
    public String getUser(){
        return "Go --> http://localhost:8080/math-api/operations/ ";
    }
}
