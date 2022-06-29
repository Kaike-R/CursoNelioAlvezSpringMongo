package com.kaike.springboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaike.springboot.model.UserEntity;
import com.kaike.springboot.services.UserService;

@RestController
public class UserResources {
    

    @Autowired
    private UserService service;

    @GetMapping("/hello")
    public String hello() 
    {
        return "Hello World !!!";
    }

    @GetMapping("/user")
    public ResponseEntity<List<UserEntity>> usuario()
    {
        List<UserEntity> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
