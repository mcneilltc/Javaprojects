package com.example.Notes.service;

import com.example.Notes.model.Note;
import com.example.Notes.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
// this passes the info from the controller to the repository.
    //NoteService will be the only class that directly interacts with NoteREpository
   @Autowired
   private NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository){
        this.noteRepository = noteRepository;
    }

    public void save(Note note) {
        noteRepository.save(note);
    }

    public List<Note> findAll() {
        List<Note> note = noteRepository.findAll();
        return note;
    }

    public void deleteNote(Long id) {

    }

    public void deleteById(Long id) {
    }
}
