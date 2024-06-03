package com.example.To_Do_List.controller;

import com.example.To_Do_List.repo.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @GetMapping(value = "/todos")
    public ResponseEntity<?> getAllToDos() {
        return new ResponseEntity<>(toDoService.all(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getOneToDo(@PathVariable Long id) {
        return new ResponseEntity<>(toDoService.findById(id), HttpStatus.OK);
    }
}
