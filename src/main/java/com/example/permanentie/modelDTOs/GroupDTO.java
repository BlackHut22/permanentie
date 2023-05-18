package com.example.permanentie.modelDTOs;

import java.util.Set;

public record GroupDTO (
    Integer id,
    String groupname,
    Set<Integer> userIds,
    Set<Integer> requestedUserIds,
    Set<Integer> roosterIds
){}