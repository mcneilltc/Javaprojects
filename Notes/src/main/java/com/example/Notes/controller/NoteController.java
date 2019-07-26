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
import java.util.Optional;

@Controller
public class NoteController {

    private NoteRepository noterepository;
    private List<Note> note;
//
//    @Autowired
//    private NoteService noteService;

    public NoteController(List<Note>note, NoteRepository noteRepository){
        this.noterepository= noteRepository;
        this.note = note;
    }

    @GetMapping(value = "/")
    public String getNotes(Model model){
        List<Note> noteList = noterepository.findAll();
        model.addAttribute("notes", noteList);
        return "/notes";
    }

    @GetMapping(value = "/notes/new")
    public String getNewNote(Model model){
        model.addAttribute("newNote", new Note());
        return "newNote";
    }
    @PostMapping(value = "/note/new")
    public String postNewNote(Note note, Model model){
        noterepository.save(note);
        //notes.add(note);
        model.addAttribute("title", note.getTitle());
        model.addAttribute("body", note.getBody());
        model.addAttribute("noteEntry", note.getNoteEntry());
        return "newNote";
    }

//    @PostMapping("/deleteNote/{id}")
//    public String deleteNote(@PathVariable Long id){
//        noteService.deleteNote(id);
//        return "redirect:/";
//    }

@PutMapping("/note/{id}/edit")
    public String editNoteEntry( Note note, Model model){
        model.addAttribute("editnote", noterepository.findAll());
        noterepository.save(note);
        mirrorDB();
        model.addAttribute("title", note.getTitle());
        model.addAttribute("body", note.getBody());
        Model noteEntry = model.addAttribute("noteEntry", note.getNoteEntry());
        return "result";
}
@GetMapping("note/{id}/edit")
public String editNoteEntryView(@PathVariable("id")Long id, Model model){
        Optional<Note> optionalNote = noterepository.findById(id);
        model.addAttribute("note", optionalNote.get());
        return "edit";
}

//@PutMapping("/note/{id}/delete")
//    public String editNote(Note note, Model model){
//        noteService.save(note);
//        mirrorDB();
//        model.addAttribute("title", note.getTitle());
//        model.addAttribute("body", note.getBody());
//        Model noteEntry= model.addAttribute("noteEntry",note.getId());
//        return "newNote";
//}

@DeleteMapping("/note/{id}/delete")
    public String deleteNote(@PathVariable("id")Long id){
        noterepository.deleteById(id);
        mirrorDB();
        return "result";
}

    private void mirrorDB() {
        Iterable<Note> noteList = noterepository.findAll();
        note.clear();
        for(Note note: noteList){
            note.add(note);
        }
    }
}
