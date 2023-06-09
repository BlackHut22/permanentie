package com.example.permanentie.DTOs;

import java.util.Set;

public record GroupDTO (
    Integer id,
    String groupname,
    Set<Integer> userIds,
    Set<Integer> requestedUserIds,
    Set<Integer> roosterIds
){}