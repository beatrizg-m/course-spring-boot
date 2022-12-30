package com.atividade.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
