package com.example.permanentie.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_timeslot")
public class Timeslot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private LocalDateTime startDateTime;

    @NotNull
    private LocalDateTime endDateTime;

    @NotNull
    @NotEmpty
    private String description;

    @NotNull
    @NotEmpty
    @ManyToOne
    @JoinColumn(name = "rooster_id")
    private Rooster rooster;

    @ManyToMany(mappedBy = "timeslots")
    private Set<User> users;


    @AssertTrue(message = "end-DateTime has to be after start-DateTime")
    private boolean isEndAfterStart() {
        return endDateTime.isAfter(startDateTime);
    }

}
