package com.example.registrationlogindemo.entity;

import jakarta.persistence.*;



@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userEmail;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private double productPrice;

    @Column(nullable = false)
    private String productImage;

    public Cart() {
    }

    public Cart(String userEmail, String productName, double productPrice, String productImage) {
        this.userEmail = userEmail;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
    }

    // Getters, setters, and other methods
}
