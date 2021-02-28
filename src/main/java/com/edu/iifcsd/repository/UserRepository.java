package com.edu.iifcsd.repository;

import com.edu.iifcsd.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component("userRepository")
public interface UserRepository extends MongoRepository<User, String> {

}
