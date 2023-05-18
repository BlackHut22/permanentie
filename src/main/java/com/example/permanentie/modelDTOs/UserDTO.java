package com.example.permanentie.modelDTOs;

import java.util.Optional;
import java.util.Set;

public record UserDTO (
        Integer id,
        String username,
        Integer groupId,
        Integer requestGroupId,
        Set<Integer> timeslotsIds
){}



