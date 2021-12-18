package com.sanvalero.orms.Web.View;

import java.util.List;
import java.util.stream.Collectors;

import com.sanvalero.orms.Services.PostsService;
import com.sanvalero.orms.Services.UsersService;
import com.sanvalero.orms.Services.Models.PostDTO;
import com.sanvalero.orms.Services.Models.UserDTO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ModelAndView GetPosts(@RequestParam(
                                name="userId", 
                                required=false) Long userId,
                                @RequestParam(
                                name="salary", 
                                required=false) Long salary){
        ModelAndView mv = new ModelAndView("listPosts");
        List<PostDTO> posts;
        if (userId != null && userId != 0){
            posts = postsService.getAllByUserId(userId);
        }
        else if (salary != null){
            posts = postsService.getAllBySalaryHigherThan(salary);
        }
        else{
            posts = postsService.getAll();
        }
        mv.addObject("posts", posts);
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
