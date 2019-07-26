package com.example.Notes.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_id")
    private Long id;




//    @ManyToOne(fetch = FetchType.LAZY, optional=false)
//    @JoinColumn(name = "note_id")
    @OnDelete(action= OnDeleteAction.CASCADE)
    private String title;
    private String noteEntry;

    @NotEmpty(message= "Note cannot be empty")
    private String body;


    @CreationTimestamp
    private Date createdAt;

    public Note(String title, String noteEntry, @NotEmpty(message = "Note cannot be empty") String body) {
        this.title = title;
        this.body = body;
        this.noteEntry = noteEntry;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", noteEntry='" + noteEntry + '\'' +
                '}';
    }

    public String getNoteEntry() {
        return noteEntry;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public void add(Note note) {
    }
}

