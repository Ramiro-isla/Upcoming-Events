package com.UpcomingEvents.UpcomingEvents.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UpcomingEvents.UpcomingEvents.models.User;
import com.UpcomingEvents.UpcomingEvents.services.UserService;

@RestController
@RequestMapping(path = "/api")
public class RegisterController {

    UserService service;

    public RegisterController(UserService service) {
        this.service = service;
    }

    @PostMapping(path = "/register")
    public ResponseEntity<?>postMethodName(@RequestBody User user){
       
        try {
            if(service.getAll().contains(user)){

                service.store(user);
            }
            return ResponseEntity.status(201).body(service.store(user));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    
}
