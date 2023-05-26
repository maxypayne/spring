package com.maxim.api.services;
import com.maxim.api.dao.TodoDAO;
import com.maxim.api.entities.Todo;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service //to define TodoService as the Spring's Service class
public class TodoService {
    private TodoDAO dao;
    public TodoService() {}
    @Autowired
    public TodoService(TodoDAO todoDAO) {
        dao = todoDAO;
    }

    public String create(Todo data) {
//        this.id = id;
//        this.title = title;
//        this.description = description;
//        this.done = done;
//        this.dateCreated = dateCreated;
//        this.dueDate = dueDate;
//        this.dateDone = dateDone;
//        this.lastUpdated = lastUpdated;
        Date date = new Date();
        Todo todo = new Todo(
                data.getTitle(),
                data.getDescription(),
                false,
                date,
                date,
                date,
                date
        );
        this.dao.create(todo);
        return "todo created";
    }

    public Todo findById(Integer id) {
        return dao.findById(id);
    }

    public String update(Integer id, Todo dataToUpdate) {
        Todo todo = dao.findById(id);
        if (todo.getId() > -1) {
            todo.setDescription(dataToUpdate.getDescription());
            dao.update(todo);
            return "Todo updated";
        }
        return "Can't find todo";
    }
    public void deleteById(Long id) throws Exception {
        dao.deleteById(id);
    }
}