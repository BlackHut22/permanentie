package com.example.permanentie.modelDTOMappers;

import com.example.permanentie.modelDTOs.TimeslotDTO;
import com.example.permanentie.models.Timeslot;
import com.example.permanentie.models.User;

import java.util.stream.Collectors;

public class TimeslotDTOMapper {

    public TimeslotDTO toDTO(Timeslot timeslot){
        return new TimeslotDTO(
                timeslot.getId(),
                timeslot.getStartDateTime(),
                timeslot.getEndDateTime(),
                timeslot.getDescription(),
                timeslot.getRooster().getId(),
                timeslot.getUsers().stream().map(User::getId).collect(Collectors.toSet())
        );
    }
}
