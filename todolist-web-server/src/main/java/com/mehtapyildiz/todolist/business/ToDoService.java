package com.mehtapyildiz.todolist.business;

import com.mehtapyildiz.todolist.model.ToDoItem;

import java.util.List;

public interface ToDoService {
    void add(ToDoItem todo);
    void delete(ToDoItem todo);

    void update(ToDoItem todo);

    List <ToDoItem> getAll();
}
