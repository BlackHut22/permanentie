package com.example.permanentie.DTOMappers;

import com.example.permanentie.DTOs.UserDTO;
import com.example.permanentie.creationDTOs.UserCreationDTO;
import com.example.permanentie.models.Group;
import com.example.permanentie.models.Timeslot;
import com.example.permanentie.models.User;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

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

    public User toEntity(UserCreationDTO user, Group group, Group requestedGroup, Set<Timeslot> timeslots){
        return User.builder()
                .username(user.username())
                .group(group)
                .requestGroup(requestedGroup)
                .timeslots(timeslots)
                .build();
    }
}