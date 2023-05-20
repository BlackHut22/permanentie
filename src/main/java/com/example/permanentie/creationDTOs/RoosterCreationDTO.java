package com.example.permanentie.creationDTOs;

import java.time.LocalDate;

public record RoosterCreationDTO(
        LocalDate startDate,
        LocalDate endDate,
        Integer groupId
) {
}
