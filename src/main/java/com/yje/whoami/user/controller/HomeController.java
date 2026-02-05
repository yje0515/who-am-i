package com.yje.whoami.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/resume")
    public String resume(){
        return "/pages/resume";
    }
    @GetMapping("/projects")
    public String projects(){
        return "/pages/projects";
    }
    @GetMapping("/contact")
    public String contact(){
        return "/pages/contact";
    }
}
