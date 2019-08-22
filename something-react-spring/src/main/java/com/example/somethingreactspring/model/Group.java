package com.example.somethingreactspring.model;

import lombok.Data;
import lombok.NoArgsConstructor;// (lombok) creates a default contructor with nothing in it
import lombok.NonNull;
import lombok.RequiredArgsConstructor;// creates a constructor with the argument for name

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name= "user_group")
public class Group {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;
    private String address, city, state, county, zip;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User user;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Event> events;

}
