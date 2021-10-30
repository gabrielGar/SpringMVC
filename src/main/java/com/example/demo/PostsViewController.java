package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostsViewController {
    @GetMapping("/posts")
    public ModelAndView GetAll(@RequestParam(
                            name="userId",
                            required=false, 
                            defaultValue="0") int userId){
        ArrayList<Post> result = PostsController.getPostsByUserId(userId);
        
        ModelAndView mv = new ModelAndView("listPosts");
        mv.addObject("posts", result);
        return mv;
    }
    
    @GetMapping("/posts/new")
    public ModelAndView CreateUser(){
        ModelAndView m = new ModelAndView("detailPosts");
        m.addObject("post", new Post());
        m.addObject("users", UsersController.users);
        return m;
    }
    
    @GetMapping("/posts/edit/{id}")
    public ModelAndView CreateUser(@PathVariable("id") int id){
        ModelAndView m = new ModelAndView("detailPosts");
        m.addObject("post", PostsController.findById(id));
        m.addObject("users", UsersController.users);
        return m;
    }
}
