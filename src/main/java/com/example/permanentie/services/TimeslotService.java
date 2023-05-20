package com.example.permanentie.services;

import com.example.permanentie.models.Timeslot;
import com.example.permanentie.repos.TimeslotRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TimeslotService {

    private TimeslotRepo timeslotRepo;

    public void save(Timeslot timeslot) {
        timeslotRepo.save(timeslot);
    }

    public Timeslot getTimeslot(Integer timeslotId) {
        return timeslotRepo.findById(timeslotId).orElseThrow(() -> new MultiException("Timeslot not in database"));
    }

    public void delete(Timeslot timeslot) {
        timeslotRepo.delete(timeslot);
    }
}
