package com.example.permanentie.modelDTOMappers;

import com.example.permanentie.modelDTOs.RoosterDTO;
import com.example.permanentie.models.Group;
import com.example.permanentie.models.Rooster;
import com.example.permanentie.models.Timeslot;

import java.util.Collection;
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
}
