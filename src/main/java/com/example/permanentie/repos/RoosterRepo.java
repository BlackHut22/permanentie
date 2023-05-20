package com.example.permanentie.repos;

import com.example.permanentie.models.Group;
import com.example.permanentie.models.Rooster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Set;

public interface RoosterRepo extends JpaRepository<Rooster, Integer> {

    Set<Rooster> findByGroupAndStartDateLessThanEqualAndEndDateGreaterThanEqual(Group group, LocalDate startDate, LocalDate endDate);

    Set<Rooster> findByGroupAndStartDateGreaterThanEqual(Group group, LocalDate localDate);
}
