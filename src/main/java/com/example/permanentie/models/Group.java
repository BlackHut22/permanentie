package com.example.permanentie.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "_group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String groupname;

    @OneToMany(mappedBy = "group")
    private Set<User> users;

    @OneToMany(mappedBy = "group")
    private Set<User> requestedUsers;

    @OneToMany(mappedBy = "group")
    private Set<Rooster> roosters;

    public Group(Integer groupId) {
        this.id = groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Group other = (Group) o;
        return id != null && id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
