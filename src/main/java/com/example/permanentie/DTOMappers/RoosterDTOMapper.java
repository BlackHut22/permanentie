package com.example.permanentie.DTOMappers;

import com.example.permanentie.creationDTOs.RoosterCreationDTO;
import com.example.permanentie.DTOs.RoosterDTO;
import com.example.permanentie.models.Group;
import com.example.permanentie.models.Rooster;
import com.example.permanentie.models.Timeslot;

import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

public class RoosterDTOMapper {

    public static RoosterDTO toDTO(Rooster rooster){
        return new RoosterDTO(
                rooster.getId(),
                rooster.getStartDate(),
                rooster.getEndDate(),
                Optional.ofNullable(rooster.getTimeslots()).orElse(Collections.emptySet()).stream().map(Timeslot::getId).collect(Collectors.toSet()),
                rooster.getGroup().getId()
        );
    }

    public static Rooster toEntity(RoosterCreationDTO rooster){
        return Rooster.builder()
                .startDate(rooster.startDate())
                .endDate(rooster.endDate())
                .group(new Group(rooster.groupId()))
                .build();
    }
}
