package com.example.service;

import com.example.model.ToDo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ToDoService {

    private List<ToDo> toDos;

    public ToDoService() {
        this.toDos = new ArrayList<>();
    }

    public ToDoService(List<ToDo> t) {
        this.toDos = t;
    }

    public void addAToDoItem(ToDo item) {
        this.toDos.add(item);
    }

    public List<ToDo> getAllToDos() {
        return this.toDos;
    }

    public void clearAllToDos() {
        this.toDos.clear();
    }

    public void replaceWithDefaultList(List<ToDo> defaultList) {
        this.toDos = defaultList;
    }
}
