package com.example.permanentie.models.DTOMappers;

import com.example.permanentie.models.creationDTOs.TimeslotCreationDTO;
import com.example.permanentie.models.DTOs.TimeslotDTO;
import com.example.permanentie.models.Rooster;
import com.example.permanentie.models.Timeslot;
import com.example.permanentie.models.User;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TimeslotDTOMapper {

    public TimeslotDTO toDTO(Timeslot timeslot){
        return new TimeslotDTO(
                timeslot.getId(),
                timeslot.getDescription(),
                timeslot.getStartDateTime(),
                timeslot.getEndDateTime(),
                Optional.ofNullable(timeslot.getRooster()).map(Rooster::getId).orElse(null),
                Optional.ofNullable(timeslot.getUsers()).stream().flatMap(Set::stream).map(User::getId).collect(Collectors.toSet())
        );
    }

    public Timeslot toEntity(TimeslotCreationDTO timeslot, Rooster rooster, Set<User> users){
        return Timeslot.builder()
                .description(timeslot.description())
                .startDateTime(timeslot.startDateTime())
                .endDateTime(timeslot.endDateTime())
                .rooster(rooster)
                .users(users)
                .build();
    }
}
