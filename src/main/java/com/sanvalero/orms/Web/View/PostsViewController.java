package com.sanvalero.orms.Web.View;

import com.sanvalero.orms.Services.PostsService;
import com.sanvalero.orms.Services.UsersService;
import com.sanvalero.orms.Services.Models.PostDTO;
import com.sanvalero.orms.Services.Models.UserDTO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("posts")
public class PostsViewController {
    private final PostsService postsService;
    private final UsersService usersService;
    public PostsViewController(PostsService postsService, UsersService usersService){
        this.postsService = postsService;
        this.usersService = usersService;
    }

    @GetMapping
    public ModelAndView GetPosts(){
        ModelAndView mv = new ModelAndView("listPosts");
        mv.addObject("posts", postsService.getAll());
        return mv;
    }

    @GetMapping("/new")
    public ModelAndView NewPost(){
        ModelAndView mv = new ModelAndView("detailPosts");
        mv.addObject("post", new PostDTO());
        mv.addObject("users", usersService.getAll());
        return mv;
    }
    
    @GetMapping("/edit/{id}")
    public ModelAndView EditPost(@PathVariable("id") Long id){
        ModelAndView mv = new ModelAndView("detailPosts");
        var postOrEmpty = postsService.findById(id);
        PostDTO post = new PostDTO();
        if (postOrEmpty.isPresent())
            post = postOrEmpty.get();
        mv.addObject("post", post);
        mv.addObject("users", usersService.getAll());
        return mv;
    }
}
