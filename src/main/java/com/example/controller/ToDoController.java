package com.example.controller;

import com.example.model.ResponseMessage;
import com.example.model.ToDo;
import com.example.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @RequestMapping("/todo")
    public ResponseEntity<List<ToDo>> getAllToDos() {
        return new ResponseEntity<>(this.toDoService.getAllToDos(), HttpStatus.OK);
    }

    @RequestMapping(value="/todo", method= RequestMethod.POST)
    public ResponseEntity<ResponseMessage> addAToDo(@RequestBody ToDo toDoItem) {
        toDoService.addAToDoItem(toDoItem);
        return new ResponseEntity<>(new ResponseMessage("All good!"), HttpStatus.CREATED);
    }

}
