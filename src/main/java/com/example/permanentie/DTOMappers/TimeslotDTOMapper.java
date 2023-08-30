package com.example.permanentie.DTOMappers;

import com.example.permanentie.DTOs.TimeslotDTO;
import com.example.permanentie.creationDTOs.TimeslotCreationDTO;
import com.example.permanentie.models.Rooster;
import com.example.permanentie.models.Timeslot;
import com.example.permanentie.models.User;

import java.util.*;
import java.util.stream.Collectors;

public class TimeslotDTOMapper {

    public static TimeslotDTO toDTO(Timeslot timeslot){
        return new TimeslotDTO(
                timeslot.getId(),
                timeslot.getDescription(),
                timeslot.getStartDateTime(),
                timeslot.getEndDateTime(),
                timeslot.getRooster().getId(),
                Optional.ofNullable(timeslot.getUsers()).orElse(Collections.emptySet()).stream().map(User::getId).collect(Collectors.toSet())
        );
    }

    public static Timeslot toEntity(TimeslotCreationDTO timeslot){
        return Timeslot.builder()
                .description(timeslot.description())
                .startDateTime(timeslot.startDateTime())
                .endDateTime(timeslot.endDateTime())
                .rooster(new Rooster(timeslot.roosterId()))
                .build();
    }
}
