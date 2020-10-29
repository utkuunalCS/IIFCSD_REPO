package com.edu.iifcsd.controller;

import com.edu.iifcsd.model.User;
import com.edu.iifcsd.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/health")
    public ResponseEntity<String> health(){
        return new ResponseEntity("200", HttpStatus.OK);
    }
    @GetMapping("/getUserInfo")
    public ResponseEntity<User> getUserInfo(@RequestParam("id") String id){

        User user = userService.userDisplay(id);
        return new ResponseEntity(user, HttpStatus.OK);
    }
    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User usr){

        return new ResponseEntity(userService.saveUser(usr), HttpStatus.OK);
    }

}