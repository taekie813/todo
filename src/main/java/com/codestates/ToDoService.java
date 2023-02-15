package com.codestates;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
    private final ToDo toDo;
    private final ToDoRepository toDoRepository;

    public ToDoService(ToDo toDo, ToDoRepository toDoRepository) {
        this.toDo = toDo;
        this.toDoRepository = toDoRepository;
    }
}
