package com.example.vitu.resources;


import com.example.vitu.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/users")
public class UserResource {
    public ResponseEntity<User> findAll() {

    }



}
