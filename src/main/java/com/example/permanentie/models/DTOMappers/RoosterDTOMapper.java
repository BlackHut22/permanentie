package com.example.permanentie.models.DTOMappers;

import com.example.permanentie.models.creationDTOs.RoosterCreationDTO;
import com.example.permanentie.models.DTOs.RoosterDTO;
import com.example.permanentie.models.Group;
import com.example.permanentie.models.Rooster;
import com.example.permanentie.models.Timeslot;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class RoosterDTOMapper {

    public RoosterDTO toDTO(Rooster rooster){
        return new RoosterDTO(
                rooster.getId(),
                rooster.getStartDate(),
                rooster.getEndDate(),
                Optional.ofNullable(rooster.getTimeslots()).stream().flatMap(Set::stream).map(Timeslot::getId).collect(Collectors.toSet()),
                Optional.ofNullable(rooster.getGroup()).map(Group::getId).orElse(null)
        );
    }

    public Rooster toEntity(RoosterCreationDTO rooster, Set<Timeslot> timeslots, Group group){
        return Rooster.builder()
                .startDate(rooster.startDate())
                .endDate(rooster.endDate())
                .timeslots(timeslots)
                .group(group).build();
    }
}
