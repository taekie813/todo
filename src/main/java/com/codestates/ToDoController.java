package com.codestates;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

    @GetMapping("/")
    public String toDoApplication() {
        return "To-Do Application !";
    }
}
