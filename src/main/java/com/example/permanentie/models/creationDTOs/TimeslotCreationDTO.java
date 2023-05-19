package com.example.permanentie.models.creationDTOs;

import java.time.LocalDateTime;

public record TimeslotCreationDTO(
        String description,
        LocalDateTime startDateTime,
        LocalDateTime endDateTime,
        Integer roosterId
) {
}
