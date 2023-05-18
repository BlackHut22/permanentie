package com.example.permanentie.repos;

import com.example.permanentie.models.Timeslot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface TimeslotRepo extends JpaRepository<Timeslot, Integer> {

    //@Query("select t.id from Timeslot t where :id = t.user_id")
    //Set<Integer> findAllIds(@Param("id") Integer userId);

}
