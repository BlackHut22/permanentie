package com.example.permanentie.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_rooster")
public class Rooster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "rooster_sequence")
    @SequenceGenerator(name = "rooster_sequence", sequenceName = "rooster_sequence", allocationSize = 1, initialValue = 200)
    private Integer id;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @OneToMany(mappedBy = "rooster")
    private Set<Timeslot> timeslots;

    @ManyToOne
    @JoinColumn(name = "group_id",nullable = false)
    private Group group;

    @AssertTrue(message = "end-Date has to be after start-Date")
    private boolean isEndAfterStart() {
        return endDate.isAfter(startDate);
    }

    public Rooster(Integer roosterId) {
        this.id = roosterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rooster other = (Rooster) o;
        return id != null && id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
