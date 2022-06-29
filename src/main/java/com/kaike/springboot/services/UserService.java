package com.kaike.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaike.springboot.model.UserEntity;
import com.kaike.springboot.repository.UserRepository;


@Service
public class UserService {
    

    @Autowired
    private UserRepository repo;

    public List<UserEntity> findAll() {
        return repo.findAll();
    }
}
