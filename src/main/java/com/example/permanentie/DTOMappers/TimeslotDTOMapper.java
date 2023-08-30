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
                Optional.ofNullable(timeslot.getRooster()).map(Rooster::getId).orElse(null),
                Optional.ofNullable(timeslot.getUsers()).orElse(Collections.emptySet()).stream().collect(Collectors.toMap(User::getId, User::getUsername))
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
