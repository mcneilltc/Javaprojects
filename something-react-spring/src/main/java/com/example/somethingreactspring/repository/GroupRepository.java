package com.example.somethingreactspring.repository;

import com.example.somethingreactspring.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByName(String name);
}
