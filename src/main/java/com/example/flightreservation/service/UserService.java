package com.example.flightreservation.service;

import com.example.flightreservation.models.User;

public interface UserService {
    User save(User user );

    User findByEmail(String email);

}
