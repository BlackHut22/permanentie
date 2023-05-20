package com.example.permanentie.services;

import com.example.permanentie.models.Group;
import com.example.permanentie.models.Rooster;
import com.example.permanentie.repos.RoosterRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Set;

@Service
@AllArgsConstructor
public class RoosterService {

    private RoosterRepo roosterRepo;

    public Rooster getRooster(Group group, LocalDate localDate) {
        return roosterRepo.findByGroupAndStartDateLessThanEqualAndEndDateGreaterThanEqual(group, localDate, localDate);
    }

    public Set<Rooster> getRoostersUpcoming(Group group) {
        return roosterRepo.findByGroupAndStartDateGreaterThanEqual(group, LocalDate.now());
    }

}
