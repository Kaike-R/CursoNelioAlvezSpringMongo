package com.kaike.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kaike.springboot.model.UserEntity;


@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
    
}
