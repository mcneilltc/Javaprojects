package com.example.Notes.controller;

import com.example.Notes.model.Note;
import com.example.Notes.repository.NoteRepository;
import com.example.Notes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping(value = "/")
    public String getNotes(Model model){
        List<Note> noteList = noteService.findAll();
        model.addAttribute("notes", noteList);
        return "notes";
    }

    @GetMapping(value = "/note/new")
    public String getNewNote(Model model){
        model.addAttribute("newNote", new Note());
        return "newNote";
    }
    @PostMapping(value = "/note/new")
    public String postNewNote(Note note, Model model){
        noteService.save(note);
        //notes.add(note);
        model.addAttribute("title", note.getTitle());
        model.addAttribute("body", note.getBody());
        return "newNote";
    }

//    @PostMapping("/deleteNote/{id}")
//    public String deleteNote(@PathVariable Long id){
//        noteService.deleteNote(id);
//        return "redirect:/";
//    }

@RequestMapping(value="/note/edit/{id}", method= RequestMethod.GET)
    public String editnotes(@PathVariable("id") Long id, Model model){
        model.addAttribute("editnote", noteService.findAll());
        return "edit";
}

@PutMapping("/note/{id}/delete")
    public String editNote(Note note, Model model){
        noteService.save(note);
        mirrorDB();
        model.addAttribute("title", note.getTitle());
        model.addAttribute("body", note.getBody());
        Model noteEntry= model.addAttribute("noteEntry",note.getId());
        return "newNote";
}

@DeleteMapping("/note/{id}/delete")
    public String deleteNote(@PathVariable("id")Long id){
        noteService.deleteById(id);
        mirrorDB();
        return "result";
}

    private void mirrorDB() {
        Iterable<Note> noteList = noteService.findAll();
        //note.clear();
    }
}
