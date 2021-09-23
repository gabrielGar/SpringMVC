package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hi")
    public String Hello(){
        return "Hello World";
    }

    @GetMapping("/bye")
    public String Bye(){
        return "Bye World";
    }
    
}
