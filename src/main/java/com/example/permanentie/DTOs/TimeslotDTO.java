package com.example.permanentie.DTOs;

import java.time.LocalDateTime;
import java.util.Map;

public record TimeslotDTO (
        Integer id,
        String description,
        LocalDateTime startDateTime,
        LocalDateTime endDateTime,
        Integer roosterId,
        Map<Integer,String> users
){}