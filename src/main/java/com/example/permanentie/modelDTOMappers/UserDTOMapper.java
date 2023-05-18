package com.example.permanentie.modelDTOMappers;

import com.example.permanentie.modelDTOs.UserDTO;
import com.example.permanentie.models.Group;
import com.example.permanentie.models.Timeslot;
import com.example.permanentie.models.User;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserDTOMapper {

    public UserDTO toDTO(User user){

        return new UserDTO(
                user.getId(),
                user.getUsername(),
                Optional.ofNullable(user.getGroup()).map(Group::getId).orElse(null),
                Optional.ofNullable(user.getRequestGroup()).map(Group::getId).orElse(null),
                Optional.ofNullable(user.getTimeslots()).stream().flatMap(Set::stream).map(Timeslot::getId).collect(Collectors.toSet())
        );
    }
}