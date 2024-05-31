package com.example.To_Do_List.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ToDoController {

    @GetMapping(value = "/todos")
    public String getAllToDos() {
        return "Hello World";
    }
}
