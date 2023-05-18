package com.example.permanentie.services;

import com.example.permanentie.repos.TimeslotRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TimeslotService {

    private TimeslotRepo timeslotRepo;

}
