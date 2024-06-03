package com.example.To_Do_List.repo;

import com.example.To_Do_List.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ToDoService {

    @Autowired
    ToDoRepository toDoRepository;

    public Iterable<ToDo> all() {
        return toDoRepository.findAll();
    }

    public Optional<ToDo> findById(Long id) {
        return toDoRepository.findById(id);
    }

}
