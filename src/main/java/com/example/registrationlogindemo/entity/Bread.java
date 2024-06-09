package com.example.registrationlogindemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bread")
public class Bread {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private String price;

    @Column(name = "description")
    private String description;
}
