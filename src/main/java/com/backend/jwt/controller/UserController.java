package com.backend.jwt.controller;


import com.backend.jwt.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * The UserController Class implements an Rest Controller that
 * handles User requests.
 **/



@RestController
@RequestMapping(path = "api/v1/user")
@AllArgsConstructor
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/test")
    public String test(){
        return "Hello";

    }
}
