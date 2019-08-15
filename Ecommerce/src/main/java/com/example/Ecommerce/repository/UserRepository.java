package com.example.Ecommerce.repository;

import com.example.Ecommerce.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
