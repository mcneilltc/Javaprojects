package com.example.Ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User implements UserDetails {
    @Id// jpa annotations, the id for the model
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String username, password;

    @ElementCollection
    private Map<Product, Integer> cart = new HashMap<>();

    //this is needed for user details because the getters are being overriden by lombok
    // @transient makes is to that these are hard coded into the database

    @Transient
    private boolean accountNonExpired = true;
    @Transient
    private boolean accountNonLocked = true;
    @Transient
    private boolean credentialsNonExpired =true;
    @Transient
    private boolean enabled= true;
    @Transient
    private Collection<GrantedAuthority> authorities= null;
    }
