package com.edu.iifcsd.service;

import com.edu.iifcsd.model.User;
import com.edu.iifcsd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    @Qualifier("userRepository")
    private UserRepository userRepository;

    public User displayUser(String id){
        Optional<User> optUsr = userRepository.findById(id);
        if(optUsr.isPresent())
            return  optUsr.get();
        else
            return null;
    }

    public User saveUser(User usr){
        return userRepository.save(usr);
    }

    public void removeUser(String userID){
        userRepository.deleteById(userID);
    }

    public List<User> displayAllRegisteredUsers(){
        return userRepository.findAll();
    }
}