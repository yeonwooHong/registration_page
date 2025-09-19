package com.example.registration.controller;

import com.example.registration.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {
    // Show Registration form
    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "register"; // Display the registration form
    }
    // Register the form valeus
    @PostMapping("/register")
    public String saveForm(@ModelAttribute Student student, Model model) {
        model.addAttribute("student", student);
        return "confirmation"; //Show confirmation page with submitted data
    }

}
