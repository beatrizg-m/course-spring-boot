package com.atividade.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @GetMapping
    ResponseEntity<User> findAll(){
        User u = new User(null, "roberto", "roberto@gmail.com", "9999999", "abacaxi");
        return ResponseEntity.ok().body(u);
    }
}
