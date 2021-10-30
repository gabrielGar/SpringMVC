package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping()
    public ModelAndView GetAll(){
        ModelAndView mv = new ModelAndView("index.html");
        return mv;
    }
}
