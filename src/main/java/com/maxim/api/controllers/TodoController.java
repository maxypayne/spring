package com.maxim.api.controllers;

import com.maxim.api.entities.Todo;
import com.maxim.api.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;
    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @GetMapping()
    public List<String> getTodos() {
        System.out.println("Request validated");
        List<String> collection = new ArrayList<String>();
        collection.add("First");
        collection.add("Second");
        collection.add("Third");
        collection.add("Fifth");
        return collection;
    }
    @PostMapping
    public String create(@RequestBody Todo todo) {
        System.out.println(todo.toString());
        return todoService.create(todo);
    }

    @GetMapping("/{id}")
    public Todo read(@PathVariable("id") Integer id) {
        System.out.println(id + ": this the id");
        return todoService.findById(id);
    }
    @PutMapping
    public String update(@RequestBody Integer id, @RequestBody Todo todo) {
        return todoService.update(id, todo);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") long id) {
        try {
            todoService.deleteById(id);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
}
