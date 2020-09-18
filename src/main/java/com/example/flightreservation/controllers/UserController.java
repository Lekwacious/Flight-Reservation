package com.example.flightreservation.controllers;


import com.example.flightreservation.models.User;
import com.example.flightreservation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/welcome")
    public String sayHi(){
        return "welcome to the product page";
    }

    @PostMapping("/register")
    public String registrationUser(@ModelAttribute User user){
       userRepository.save(user);
        return "registration successful";
    }

    @GetMapping("/login")
    public String login(String email, String password){

        return "login successfully";

    }
}
