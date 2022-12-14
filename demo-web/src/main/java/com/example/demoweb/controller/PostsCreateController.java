package com.example.demoweb.controller;

import com.example.demoweb.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostsCreateController {

    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String create() {
        return "create";
    }
    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("text") String text) {
        PostService.create(text);
        return "redirect:/";
    }
}
