package com.example.permanentie.models.creationDTOs;

import java.time.LocalDate;

public record RoosterCreationDTO(
        LocalDate startDate,
        LocalDate endDate,
        Integer groupId
) {
}
