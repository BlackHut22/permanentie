package com.example.permanentie.modelDTOMappers;

import com.example.permanentie.modelDTOs.UserDTO;
import com.example.permanentie.models.Timeslot;
import com.example.permanentie.models.User;

import java.util.stream.Collectors;

public class UserDTOMapper {

    public UserDTO toDTO(User user){
        return new UserDTO(
                user.getId(),
                user.getUsername(),
                user.getGroup().getId(),
                user.getRequestGroup().getId(),
                user.getTimeslots().stream().map(Timeslot::getId).collect(Collectors.toSet())
        );
    }


}
