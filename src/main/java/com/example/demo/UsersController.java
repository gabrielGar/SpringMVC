package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    public static List<UserV2> users = new ArrayList<UserV2>(Arrays.asList(
        new UserV2(1, "Usuario 1", "en-US"),
        new UserV2(2, "Usuario 2", "es-ES"),
        new UserV2(3, "Usuario 3", "en-US"),
        new UserV2(4, "Usuario 4", "es-ES"),
        new UserV2(5, "Usuario 5", "en-US"),
        new UserV2(6, "Usuario 6", "es-ES")
    ));

    
    @GetMapping("/v1/users")
    public List<User> Users(){
        return users
                    .stream()
                    .map(u -> new User(u.getId(), u.getName()))
                    .collect(Collectors.toList());
    }

    
    @GetMapping("/v2/users")
    public List<UserV2> UsersV2(){
        return users;
    }

    @GetMapping("/v2/users/{id}")
    public User UserById(@PathVariable("id") int id) throws Exception {
        return findById(id);
    }
    
    @PostMapping("/v2/users")
    public User Add(@RequestBody UserV2 newUser){
        users.add(new UserV2(newUser.getId(), newUser.getName(), newUser.getLang()));
        return newUser;
    }
    
    private User findById(int id) throws Exception {
        for (User user : users) {
            if (user.getId() == id){
                return user;
            }
        }
        throw new ElementNotFoundException();
    }
}
