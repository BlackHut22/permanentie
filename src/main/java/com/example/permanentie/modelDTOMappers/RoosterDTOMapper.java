package com.example.permanentie.modelDTOMappers;

import com.example.permanentie.modelDTOs.RoosterDTO;
import com.example.permanentie.models.Rooster;
import com.example.permanentie.models.Timeslot;

import java.util.stream.Collectors;

public class RoosterDTOMapper {

    public RoosterDTO toDTO(Rooster rooster){
        return new RoosterDTO(
                rooster.getId(),
                rooster.getStartDate(),
                rooster.getEndDate(),
                rooster.getTimeslots().stream().map(Timeslot::getId).collect(Collectors.toSet()),
                rooster.getGroup().getId()
        );
    }
}
