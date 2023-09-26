package com.example.permanentie.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "user_sequence")
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1, initialValue = 200)
    private Integer id;

    @Column(nullable = false)
    private String username;

    @ManyToOne
    @JoinTable(
            name = "_user_group",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    private Group group;

    @ManyToOne
    @JoinTable(
            name = "_user_request_group",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    private Group requestGroup;

    @OneToMany(mappedBy = "chosenUser")
    private Set<Timeslot> chosenTimeslots;

    @ManyToMany
    @JoinTable(
            name = "_user_timeslot",
            joinColumns =  @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "timeslot_id"))
    private Set<Timeslot> timeslots;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User other = (User) o;
        return id != null && id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
