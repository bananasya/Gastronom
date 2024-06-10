package com.example.registrationlogindemo.controller;

import com.example.registrationlogindemo.entity.Cart;
import com.example.registrationlogindemo.entity.User;
import com.example.registrationlogindemo.repository.CartRepository;
import com.example.registrationlogindemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.List;

@Controller
public class BreadController {

    private final UserService userService;
    private final CartRepository cartRepository;

    @Autowired
    public BreadController(UserService userService, CartRepository cartRepository) {
        this.userService = userService;
        this.cartRepository = cartRepository;
    }

    @GetMapping("/bread")
    public String getBreadPage(Principal principal, Model model) {
        String backgroundImageUrl = "bread.jpg";
        model.addAttribute("backgroundImageUrl", backgroundImageUrl);

        User currentUser = userService.getUserByEmail(principal.getName());
        model.addAttribute("currentUser", currentUser);

        List<Cart> cartItems = cartRepository.findByUserEmail(currentUser.getEmail());
        model.addAttribute("cartItems", cartItems);

        return "bread";
    }

    @PostMapping("/bread/add")
    public String addToCart(Principal principal, @RequestParam String productName, @RequestParam double productPrice, @RequestParam String productImage) {
        User currentUser = userService.getUserByEmail(principal.getName());

        Cart cartItem = new Cart(currentUser.getEmail(), productName, productPrice, productImage);
        cartRepository.save(cartItem);

        return "redirect:/bread";
    }


}
