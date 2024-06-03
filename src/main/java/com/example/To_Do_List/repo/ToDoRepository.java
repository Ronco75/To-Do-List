package com.example.To_Do_List.repo;

import com.example.To_Do_List.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
