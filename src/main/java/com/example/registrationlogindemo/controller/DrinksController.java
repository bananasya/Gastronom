package com.example.registrationlogindemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DrinksController {

    @GetMapping("/drinks")
    public String getDrinksPage(Model model) {
        String backgroundImageUrl = "drinks_bg.jpg";
        model.addAttribute("backgroundImageUrl", backgroundImageUrl);
        return "drinks";
    }
}