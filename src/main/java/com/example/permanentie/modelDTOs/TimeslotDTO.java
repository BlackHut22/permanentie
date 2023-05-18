package com.example.permanentie.modelDTOs;

import java.time.LocalDateTime;
import java.util.Set;

public record TimeslotDTO (
    Integer id,
    LocalDateTime startDateTime,
    LocalDateTime endDateTime,
    String description,
    Integer roosterId,
    Set<Integer> userIds
){}