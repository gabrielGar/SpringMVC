package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersViewController {
    @GetMapping("/users")
    public ModelAndView Get(){
        ModelAndView m = new ModelAndView("listUsers");
        m.addObject("users", UsersController.users);
        return m;
    }
    @GetMapping("/users/new")
    public ModelAndView CreateUser(){
        ModelAndView m = new ModelAndView("detailUsers");
        m.addObject("user", new User());
        return m;
    }
    
    @GetMapping("/users/edit/{id}")
    public ModelAndView CreateUser(@PathVariable("id") int id){
        ModelAndView m = new ModelAndView("detailUsers");
        m.addObject("user", UsersController.findById(id));
        return m;
    }
}
