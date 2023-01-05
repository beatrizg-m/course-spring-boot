package com.atividade.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.course.entities.OrderItem;
import com.atividade.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

    
}
