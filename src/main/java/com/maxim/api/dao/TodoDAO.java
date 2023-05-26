package com.maxim.api.dao;

import com.maxim.api.entities.Todo;
import com.maxim.api.repositories.TodoRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TodoDAO implements TodoRepository {
    private final EntityManager entity;
    @Autowired
    public TodoDAO(EntityManager entityManager) {
        this.entity = entityManager;
    }
    public Todo findById(Integer id) {
        System.out.println("dao inside id : " + id);
        return this.entity.find(Todo.class, id);
    }
    @Override
    @Transactional
    public void create(Todo todo) {
        this.entity.persist(todo);
    }
    public void update(Todo todo) {
        this.entity.merge(todo);
    }
    public void deleteById(Long id) {
        entity.remove(id);
    }
    @Override
    public List<Todo> getTodos() {
        return null;
    }

}
