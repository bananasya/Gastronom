package com.example.registrationlogindemo.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "produce_items")
public class MeatProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "description")
    private String description;

}

