package com.example.permanentie.DTOMappers;

import com.example.permanentie.DTOs.UserDTO;
import com.example.permanentie.creationDTOs.UserCreationDTO;
import com.example.permanentie.models.User;

public class UserDTOMapper {

    public static UserDTO toDTO(User user){

        return new UserDTO(
                user.getId(),
                user.getUsername()
        );
    }

    public static User toEntity(UserCreationDTO user){
        return User.builder()
                .username(user.username())
                .build();
    }
}