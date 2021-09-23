package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/fibonacci/{numElements}")
    public ArrayList<Integer> GetFibonacciList(@PathVariable("numElements") int numElements){
        return GetFibonacciNumbers(numElements);
    }

    
    @GetMapping("/fibonacci/{numElements}/table")
    public String GetFibonacciTable(@PathVariable("numElements") int numElements){
        ArrayList<Integer> fiboNumbers = GetFibonacciNumbers(numElements);
        StringBuilder b = new StringBuilder();
        b.append("<table style='width:100%'>");
        b.append("<tr>");
        for (int i = 0; i < fiboNumbers.size(); i++) {
            b.append("<td>");
            b.append(fiboNumbers.get(i));
            b.append("</td>");
            if ((i+1) % 4 == 0){
                b.append("</tr>");
                b.append("<tr>");
            } 
        }
        b.append("</tr>");
        b.append("</table>");
        return b.toString();
    }

    private ArrayList<Integer> GetFibonacciNumbers(int numElements){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int firstVal = 1, lastVal = 1;
        if (numElements > 0){
            int curElement = 0, helpVal = 0;
            while(numElements > curElement){
                result.add(firstVal);
                curElement++;
                helpVal = lastVal;
                lastVal += firstVal;
                firstVal = helpVal; 
            }
        }
        return result;
    }

    
}
