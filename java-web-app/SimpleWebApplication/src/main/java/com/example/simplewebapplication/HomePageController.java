package com.example.simplewebapplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
