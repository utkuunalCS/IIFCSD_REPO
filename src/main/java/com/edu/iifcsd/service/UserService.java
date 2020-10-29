package com.edu.iifcsd.service;

import com.edu.iifcsd.model.User;
import com.edu.iifcsd.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User userDisplay(String id){
        Optional<User> optUsr = userRepository.findById(id);
        if(optUsr.isPresent())
            return  optUsr.get();
        else
            return null;
    }
    public User saveUser(User usr){
        return userRepository.save(usr);
    }
}