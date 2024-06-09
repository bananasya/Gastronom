package com.example.registrationlogindemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FruitsAndVegetablesController {

    @GetMapping("/fruitsandvegetables")
    public String getFruitsAndVegetablesPage(Model model){
        String backgroundImageUrl = "fruitsAndVegetables.jpg";
        model.addAttribute("backgroundImageUrl", backgroundImageUrl);
        return "fruitsandvegetables";
    }
}
