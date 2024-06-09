package com.example.registrationlogindemo.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "dairy_products")
public class DairyProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "description")
    private String description;

    // Getters, setters, constructors, etc.
}

