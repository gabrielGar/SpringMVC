package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class PostsController {
    private static ArrayList<Post> posts = new ArrayList<Post>(Arrays.asList(
        new Post(1, 1, "Mensaje de prueba 1"),
        new Post(2, 1, "Mensaje de prueba 2"),
        new Post(3, 1, "Mensaje de prueba 3"),
        new Post(4, 2, "Mensaje de prueba 4")
    ));
}
