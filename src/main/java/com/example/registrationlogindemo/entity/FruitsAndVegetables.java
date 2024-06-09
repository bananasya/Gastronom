package com.example.registrationlogindemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "beverages")
public class FruitsAndVegetables {

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
