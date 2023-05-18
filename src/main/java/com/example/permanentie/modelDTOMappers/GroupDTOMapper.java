package com.example.permanentie.modelDTOMappers;

import com.example.permanentie.modelDTOs.GroupDTO;
import com.example.permanentie.models.Group;
import com.example.permanentie.models.Rooster;
import com.example.permanentie.models.Timeslot;
import com.example.permanentie.models.User;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupDTOMapper {
    public GroupDTO toDTO(Group group){
        return new GroupDTO(
                group.getId(),
                group.getGroupname(),
                Optional.ofNullable(group.getUsers()).stream().flatMap(Set::stream).map(User::getId).collect(Collectors.toSet()),
                Optional.ofNullable(group.getRequestedUsers()).stream().flatMap(Set::stream).map(User::getId).collect(Collectors.toSet()),
                Optional.ofNullable(group.getRoosters()).stream().flatMap(Set::stream).map(Rooster::getId).collect(Collectors.toSet())
        );
    }
}
