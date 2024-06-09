package com.example.registrationlogindemo.repository;

import com.example.registrationlogindemo.entity.Drinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DrinksRepository extends JpaRepository<Drinks, Long> {
}
