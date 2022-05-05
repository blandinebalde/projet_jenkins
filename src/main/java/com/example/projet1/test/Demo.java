package com.example.projet1.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @GetMapping("/")
    public String index (){
       return "Hello World from senegal !!!!";
    }
}
