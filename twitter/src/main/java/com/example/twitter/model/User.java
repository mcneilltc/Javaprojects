package com.example.twitter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;// java persistences api (jpa) hiberanate is a part of that.

import org.hibernate.validator.constraints.Length;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data// all of the getters and the setters for all of the app data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity// makes this a model file and that it is like a database

public class User {
    @Id// jpa annotations, the id for the model
    @GeneratedValue(strategy = GenerationType.AUTO)// auto generate the value
    @Column(name = "user_id")// gives the name to the col
    private Long id;

//    private String email;
//    private String username;
//    private String password;
//    private String firstName;
//    private String lastName;
    private int active;

    @Email(message = "Please provide a valid email")
    @NotEmpty(message = "Please provide an email")
    private String email;

    @Length(min = 3, message = "Your username must have at least 3 characters")
    @Length(max = 15, message = "Your username cannot have more than 15 characters")
    @Pattern(regexp="[^\\s]+", message="Your username cannot contain spaces")// regex short for regular expression
    private String username;

    @Length(min = 5, message = "Your password must have at least 5 characters")
    private String password;

    @NotEmpty(message = "Please provide your first name")
    private String firstName;

    @NotEmpty(message = "Please provide your last name")
    private String lastName;

    @CreationTimestamp
    private Date createdAt;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;//

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_follower", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "follower_id"))
    private List<User> followers;

    @ManyToMany(mappedBy="followers")
    private List<User> following;
}
