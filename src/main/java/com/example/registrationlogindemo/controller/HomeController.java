package com.example.registrationlogindemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        List<Product> featuredProducts = getFeaturedProducts();
        model.addAttribute("featuredProducts", featuredProducts);
        return "home";
    }

    private List<Product> getFeaturedProducts() {
        List<Product> products = new ArrayList<>();

        Product product1 = new Product();
        product1.setName("Product 1");
        product1.setDescription("Description of Product 1");
        product1.setImageUrl("product1.jpg");

        Product product2 = new Product();
        product2.setName("Product 2");
        product2.setDescription("Description of Product 2");
        product2.setImageUrl("product2.jpg");

        Product product3 = new Product();
        product3.setName("Product 3");
        product3.setDescription("Description of Product 3");
        product3.setImageUrl("product3.jpg");

        products.add(product1);
        products.add(product2);
        products.add(product3);

        return products;
    }

    public static class Product {
        private String name;
        private String description;
        private String imageUrl;

        // Getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }
    }
}

