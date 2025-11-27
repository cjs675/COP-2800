package com.example.simplewebapplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
    Returns HTML from /templates
 */
@Controller
public class HomePageController
{
    @GetMapping("/")
    public String home(Model model)
    {
        model.addAttribute("name", "Spring Boot");
        return "index";
    }

    @PostMapping("/submit")
    public String formHandler(@RequestParam("userInput") String userInput, Model model)
    {
        model.addAttribute("name", "Spring Boot");
        model.addAttribute("submittedValue", userInput);
        return "index";
    }
}
