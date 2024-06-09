package com.example.registrationlogindemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasketController {

    @GetMapping("/basket")
    public String getBasketPage(Model model){
        String backgroundImageUrl = "basket.jpg";
        model.addAttribute("backgroundImageUrl", backgroundImageUrl);
        return "basket";
    }
}
