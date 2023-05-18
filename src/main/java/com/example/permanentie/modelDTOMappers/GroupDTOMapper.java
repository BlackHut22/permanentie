package com.example.permanentie.modelDTOMappers;

import com.example.permanentie.modelDTOs.GroupDTO;
import com.example.permanentie.models.Group;
import com.example.permanentie.models.Rooster;
import com.example.permanentie.models.User;

import java.util.stream.Collectors;

public class GroupDTOMapper {
    public GroupDTO toDTO(Group group){
        return new GroupDTO(
                group.getId(),
                group.getGroupname(),
                group.getUsers().stream().map(User::getId).collect(Collectors.toSet()),
                group.getRequestedUsers().stream().map(User::getId).collect(Collectors.toSet()),
                group.getRoosters().stream().map(Rooster::getId).collect(Collectors.toSet()));
    }
}
