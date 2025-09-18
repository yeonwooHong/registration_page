package com.example.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller

public class HomeController {

    @GetMapping("/")

    public String home(Model model) {
        model.addAttribute("title", "Welcome to Registraion Portal :)");
        model.addAttribute("message", "N01649920 Yeonwoo Hong");
        return "home";
    }

}

