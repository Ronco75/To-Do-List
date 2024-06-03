package com.example.To_Do_List.model;

import jakarta.persistence.*;
import org.joda.time.Instant;

@Entity
@Table(name = "todo")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "created_at", nullable = false)
    private final Instant created_at;

    @Column(name = "completed", nullable = false)
    private boolean completed;

    public ToDo() {
        this.created_at = Instant.now();
    }

    public ToDo(String title) {
        this.title = title;
        this.created_at = Instant.now();
        this.completed = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instant getCreated_at() {
        return created_at;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }



}
