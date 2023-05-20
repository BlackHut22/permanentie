package com.example.permanentie.DTOs;


import java.util.Set;

public record UserDTO (
        Integer id,
        String username,
        Integer groupId,
        Integer requestGroupId,
        Set<Integer> timeslotsIds
){}



