package com.example.permanentie.modelDTOMappers;

import com.example.permanentie.modelDTOs.TimeslotDTO;
import com.example.permanentie.models.Group;
import com.example.permanentie.models.Rooster;
import com.example.permanentie.models.Timeslot;
import com.example.permanentie.models.User;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TimeslotDTOMapper {

    public TimeslotDTO toDTO(Timeslot timeslot){
        return new TimeslotDTO(
                timeslot.getId(),
                timeslot.getStartDateTime(),
                timeslot.getEndDateTime(),
                timeslot.getDescription(),
                Optional.ofNullable(timeslot.getRooster()).map(Rooster::getId).orElse(null),
                Optional.ofNullable(timeslot.getUsers()).stream().flatMap(Set::stream).map(User::getId).collect(Collectors.toSet())
        );
    }
}
