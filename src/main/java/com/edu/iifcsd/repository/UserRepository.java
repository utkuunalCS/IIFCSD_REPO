package com.edu.iifcsd.repository;

import com.edu.iifcsd.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByUserName();
}
