package com.example.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "HELLO , SPRING !!!";
    }
    @GetMapping("/hello/user")
    public String helloWorld(@RequestParam String name){
        return "HELLO , "+ name +" !!!";
    }

}
