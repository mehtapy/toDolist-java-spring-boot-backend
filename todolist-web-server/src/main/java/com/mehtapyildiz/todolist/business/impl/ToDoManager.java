package com.mehtapyildiz.todolist.business.impl;

import com.mehtapyildiz.todolist.business.ToDoService;
import com.mehtapyildiz.todolist.model.ToDoItem;
import com.mehtapyildiz.todolist.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ToDoManager implements ToDoService {

    private ToDoRepository toDoRepository;

    @Autowired
    public ToDoManager(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    @Transactional
    public void add(ToDoItem todo) {
        this.toDoRepository.save(todo);
    }

    @Override
    @Transactional
    public void delete(ToDoItem todo) {
        this.toDoRepository.delete(todo);
    }
    @Override
    @Transactional
    public void update(ToDoItem todo){
        this.toDoRepository.save(todo );
    }

    @Override
    @Transactional
    public List<ToDoItem> getAll() {
        return this.toDoRepository.findAll();
    }
}
