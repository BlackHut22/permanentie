package com.example.permanentie.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_timeslot")
public class Timeslot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "timeslot_sequence")
    @SequenceGenerator(name = "timeslot_sequence", sequenceName = "timeslot_sequence", allocationSize = 1, initialValue = 200)
    private Integer id;

    private String description;

    @Column(nullable = false)
    private LocalDateTime startDateTime;

    @Column(nullable = false)
    private LocalDateTime endDateTime;

    @ManyToOne
    @JoinColumn(name = "rooster_id",nullable = false)
    private Rooster rooster;

    @ManyToOne
    @JoinColumn(name = "chosen_user_id")
    private User chosenUser;

    @ManyToMany(mappedBy = "timeslots")
    private Set<User> users;

    @AssertTrue(message = "end-DateTime has to be after start-DateTime")
    private boolean isEndAfterStart() {
        return endDateTime.isAfter(startDateTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Timeslot other = (Timeslot) o;
        return id != null && id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
