package com.example.registrationlogindemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DairyProductController {
    @GetMapping("/dairyproduct")
    public String getDairyProductPage(Model model){
        String backgroundImageUrl = "dairyproduct.jpg";
        model.addAttribute("baclgroundImageUrl", backgroundImageUrl);
        return "dairyproduct";
    }
}
