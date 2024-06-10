package com.example.registrationlogindemo.controller;

import com.example.registrationlogindemo.entity.Cart;
import com.example.registrationlogindemo.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DairyProductController {

    @Autowired
    private CartRepository cartRepository;

    @GetMapping("/dairyproduct")
    public String getDrinksPage(Model model) {
        String backgroundImageUrl = "dairyproduct.jpg";
        model.addAttribute("backgroundImageUrl", backgroundImageUrl);
        return "dairyproduct";
    }

    @PostMapping("/dairyproduct/addToCart")
    public String addToCart(@RequestParam("productName") String productName,
                            @RequestParam("productPrice") double productPrice,
                            @RequestParam("productImage") String productImage,
                            @RequestParam("userEmail") String userEmail) {
        Cart cart = new Cart(userEmail, productName, productPrice, productImage);
        cartRepository.save(cart);
        return "redirect:/dairyproduct";
    }
}
