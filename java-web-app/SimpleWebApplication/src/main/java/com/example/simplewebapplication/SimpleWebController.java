package com.example.simplewebapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleWebController
{
    @GetMapping("/hello")
    public String returnHello()
    {
        return "Hello, from my java application";
    }

    @GetMapping("/hello/{name}")
    public String returnHelloUser(@PathVariable String name)
    {
        return "Hello " + name;
    }
}
