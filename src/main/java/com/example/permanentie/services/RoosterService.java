package com.example.permanentie.services;

import com.example.permanentie.repos.RoosterRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoosterService {

    private RoosterRepo roosterRepo;
}
