package com.maxim.api.dao;

import com.maxim.api.entities.TodoType;
import com.maxim.api.repositories.TodoTypeRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class TodoTypeDAO implements TodoTypeRepository {
    private final EntityManager entity;
    @Autowired
    public TodoTypeDAO(EntityManager entityManager) {
        this.entity = entityManager;
    }
    public void create(TodoType todo) {
        this.entity.persist(todo);
    }

    public TodoType findByCode(String code) {
        return this.entity.find(TodoType.class, code);
    }

    public void update(TodoType todo) {
        this.entity.merge(todo);
    }
    public void deleteByCode(String code) {
        entity.remove(code);
    }
}


