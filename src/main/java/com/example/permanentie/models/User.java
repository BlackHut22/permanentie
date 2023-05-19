package com.example.permanentie.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
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

    @ManyToMany
    @JoinTable(
            name = "_user_timeslot",
            joinColumns =  @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "timeslot_id"))
    private Set<Timeslot> timeslots;

    public User(String username, Group group, Group requestedGroup, Set<Timeslot> timeslots) {
    }
}
