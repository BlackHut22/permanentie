package com.example.permanentie.services;

import com.example.permanentie.models.User;
import com.example.permanentie.repos.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepo userRepo;

    public void save(User user) {
        userRepo.save(user);
    }
}
