package com.codestates;

import javax.persistence.Entity;

@Entity
public class ToDo {
    private long toDoId;
    private int toDoList;
    private Boolean completed;
}
