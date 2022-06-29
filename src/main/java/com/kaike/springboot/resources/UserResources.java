package com.kaike.springboot.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaike.springboot.dto.UserDTO;
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
    public ResponseEntity<List<UserDTO>> usuario()
    {


        List<UserEntity> list = service.findAll();

        List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

}
