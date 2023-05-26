package com.maxim.api.repositories;

import com.maxim.api.entities.TodoType;

import java.util.List;

public interface TodoTypeRepository {
    void create(TodoType todo);
    TodoType findByCode(String code);
    void update(TodoType todo);
    void deleteByCode(String code);
}
