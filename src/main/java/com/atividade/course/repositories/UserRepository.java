package com.atividade.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
