package com.mehtapyildiz.todolist.repository;

import com.mehtapyildiz.todolist.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoItem,Long> {

}
