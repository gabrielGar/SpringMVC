package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {
    private static ArrayList<Post> posts = new ArrayList<Post>(Arrays.asList(
        new Post(1, 1, "Mensaje de prueba 1"),
        new Post(2, 1, "Mensaje de prueba 2"),
        new Post(3, 1, "Mensaje de prueba 3"),
        new Post(4, 2, "Mensaje de prueba 4")
    ));

    @GetMapping("/v1/posts")
    public ArrayList<Post> GetAll(@RequestParam(
                        name="userId",
                        required=false, 
                        defaultValue="0") int userId){
        ArrayList<Post> result = getPostsByUserId(userId);
        
        return result;
    }

    @PostMapping("/v1/posts")
    public Post Add(@RequestBody Post newPost){
        posts.add(new Post(newPost.getId(), newPost.getUserId(), newPost.getText()));
        return newPost;
    }
    
    
    @PutMapping("/v1/posts/{id}")
    public Post Update(@RequestBody Post updatePost, 
                        @PathVariable("id") int id) throws Exception {
        Post p = findById(id);
        p.setText(updatePost.getText());
        return p;
    }
    private ArrayList<Post> getPostsByUserId(int userId){
        ArrayList<Post> result = posts;
        if(userId != 0){
            result = new ArrayList<Post>();
            for (Post post : posts) {
                if (post.getUserId() == userId)
                    result.add(post);
            }
        }
        return result;
    }
    
    private Post findById(int id) throws Exception {
        for (Post post : posts) {
            if (post.getId() == id){
                return post;
            }
        }
        throw new ElementNotFoundException();
    }

}
