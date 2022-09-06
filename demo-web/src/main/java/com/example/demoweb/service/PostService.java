package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public static List<Post> posts = new ArrayList<>();
    public static void create(String text) {
        posts.add(new Post(posts.size(), text));
    }
    public List<Post> listAllPosts() {
        return posts;
    }
}
