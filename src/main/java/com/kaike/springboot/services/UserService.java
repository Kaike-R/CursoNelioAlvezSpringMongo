package com.kaike.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaike.springboot.model.UserEntity;
import com.kaike.springboot.repository.UserRepository;
import com.kaike.springboot.services.exception.ObjectNotFoundException;


@Service
public class UserService {
    

    @Autowired
    private UserRepository repo;

    public List<UserEntity> findAll() {
        return repo.findAll();
    }

    public UserEntity findById(String id)
    {
        Optional<UserEntity> entity = repo.findById(id);
        
        return entity.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
               
    }
}
