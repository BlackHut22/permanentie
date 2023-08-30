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

    public Rooster getRoosterIncDate(Group group, LocalDate localDate) {
        return roosterRepo.findByGroupAndStartDateLessThanEqualAndEndDateGreaterThanEqual(group, localDate, localDate);
    }

    public Set<Rooster> getRoostersUpcoming(Group group) {
        return roosterRepo.findByGroupAndStartDateGreaterThanEqual(group, LocalDate.now());
    }

    public Rooster getRooster(Integer roosterId) {
        return roosterRepo.findById(roosterId).orElseThrow(() -> new MultiException("Rooster not in database"));
    }

    public void save(Rooster rooster) {
        roosterRepo.save(rooster);
    }

    public void delete(Rooster rooster) {
        roosterRepo.delete(rooster);
    }

}
