package com.example.permanentie.models.DTOs;

import java.time.LocalDateTime;
import java.util.Set;

public record TimeslotDTO (
    Integer id,
    String description,
    LocalDateTime startDateTime,
    LocalDateTime endDateTime,
    Integer roosterId,
    Set<Integer> userIds
){}