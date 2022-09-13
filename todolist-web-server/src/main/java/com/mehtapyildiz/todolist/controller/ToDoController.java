package com.mehtapyildiz.todolist.controller;


import com.mehtapyildiz.todolist.business.ToDoService;
import com.mehtapyildiz.todolist.model.ToDoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin

public class ToDoController {

    private ToDoService toDoService;
    private ToDoItem toDoItem;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/getall")
    public List<ToDoItem> getToDoList(){
        return this.toDoService.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody ToDoItem toDoItem){
        this.toDoService.delete(toDoItem);
    }
    @PostMapping("/add")
    public void  add(@RequestBody ToDoItem toDoItem){
        this.toDoService.add(toDoItem);
    }

    @PutMapping("/update")
    public void update(@RequestBody ToDoItem toDoItem){
        this.toDoService.update(toDoItem);
    }



}
