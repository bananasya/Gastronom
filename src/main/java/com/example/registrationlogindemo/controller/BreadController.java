package com.example.registrationlogindemo.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BreadController {

    @GetMapping("/bread")
    public String getBreadPage(Model model){
        String backgroundImageUrl = "bread.jpg";
        model.addAttribute("backgroundImageUrl", backgroundImageUrl);
        return "bread";
    }
}
