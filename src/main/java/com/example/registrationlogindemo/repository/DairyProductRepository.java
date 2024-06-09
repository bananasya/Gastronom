package com.example.registrationlogindemo.repository;

import com.example.registrationlogindemo.entity.DairyProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DairyProductRepository extends JpaRepository<DairyProduct, Long> {
}
