package com.atividade.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
