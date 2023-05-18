package com.example.permanentie.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_rooster")
public class Rooster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private LocalDate startDate;

    @NotNull
    private LocalDate endDate;

    @OneToMany(mappedBy = "rooster")
    private Set<Timeslot> timeslots;

    @NotNull
    @NotEmpty
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @AssertTrue(message = "end-Date has to be after start-Date")
    private boolean isEndAfterStart() {
        return endDate.isAfter(startDate);
    }
}