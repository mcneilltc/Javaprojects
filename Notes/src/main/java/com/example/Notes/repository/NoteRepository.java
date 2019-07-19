package com.example.Notes.repository;

import com.example.Notes.model.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {
    List<Note> findAll();
}
