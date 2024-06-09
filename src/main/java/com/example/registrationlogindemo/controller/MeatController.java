package com.example.registrationlogindemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MeatController {

    @GetMapping("/meatproduct")
    public String getMeatProductPage(Model model){
        String backgroundImageUrl = "meatproduct.jpg";
        model.addAttribute("backgroundImageUrl", backgroundImageUrl);
        return "meatproduct";
    }
}
