package com.kaike.springboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.kaike.springboot.model.UserEntity;
import com.kaike.springboot.repository.UserRepository;


@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        
        userRepository.deleteAll();

        UserEntity maria = new UserEntity(null, "Maria", "Maria@gmail.com");

        UserEntity Eduardo = new UserEntity(null, "Eduardo", "Eduardo@gmail.com");

        UserEntity James = new UserEntity(null, "James", "James@gmail.com");

        userRepository.saveAll(Arrays.asList(maria,Eduardo,James));
        
    }
    
}
