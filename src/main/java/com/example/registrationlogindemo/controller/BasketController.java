package com.example.registrationlogindemo.controller;

import com.example.registrationlogindemo.entity.User;
import com.example.registrationlogindemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/basket")
public class BasketController {

    private final UserService userService;

    @Autowired
    public BasketController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showCart(Principal principal, Model model) {
        // Получение информации об авторизованном пользователе
        User currentUser = userService.getUserByEmail(principal.getName());

        // Передача информации об авторизованном пользователе в модель
        model.addAttribute("currentUser", currentUser);


        return "basket";
    }
}
