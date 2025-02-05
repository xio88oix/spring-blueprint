package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/api/")
    public String home(Model model) {
        model.addAttribute("message", "Spring MVC Test");
        return "index";
    }
    
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello, World!";
    }
}
