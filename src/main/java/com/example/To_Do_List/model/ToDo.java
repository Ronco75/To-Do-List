package com.example.To_Do_List.model;

import jakarta.persistence.*;
import org.joda.time.Instant;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "todo")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(nullable = false)
    String title;

    final Instant created_at;

    public ToDo(long id, String title) {
        this.id = id;
        this.title = title;
        this.created_at = Instant.now();
    }

}
