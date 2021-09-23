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
    
    
    @GetMapping("/longstring")
    public String ConcatString(){
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < 10; i++){
            b.append("Escribiendo número:");
            b.append(i);
            b.append("<br>");
        }
        return b.toString();
    }

    @GetMapping("/intList")
    public Integer[] IntegerList(){
        return new Integer[] {1,2,3,4,5};
    }
    
}
