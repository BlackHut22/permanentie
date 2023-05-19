package com.example.permanentie.models.DTOs;

import java.time.LocalDate;
import java.util.Set;

public record RoosterDTO (
    Integer id,
    LocalDate startDate,
    LocalDate endDate,
    Set<Integer> timeslotIds,
    Integer groupId
){ }