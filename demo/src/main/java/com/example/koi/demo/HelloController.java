package com.example.koi.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class HelloController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello, Spring Boot with Thymeleaf!");
        return "index";  // Thymeleaf 将解析为 src/main/resources/templates/index.html
    }
}