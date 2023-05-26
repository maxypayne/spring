package com.maxim.api.repositories;

import com.maxim.api.entities.Todo;

import java.util.List;

public interface TodoRepository {
    List<Todo> getTodos();
    void create(Todo todo);
    void update(Todo todo);
    Todo findById(Integer id);
    void deleteById(Long id);
}
