package com.maxim.api.services;
import com.maxim.api.dao.TodoTypeDAO;
import com.maxim.api.entities.TodoType;
import org.springframework.stereotype.Service;

@Service
public class TodoTypeService {
    TodoTypeDAO dao;
    public TodoTypeService() {}
    public TodoTypeService(TodoTypeDAO todoTypeDAO) {
        dao = todoTypeDAO;
    }
    public String create(TodoType todoType) {
        dao.create(todoType);
        return "todoType created";
    }

    public TodoType findByCode(String code) {
        return dao.findByCode(code);
    }

    public String update(String code, TodoType dataToUpdate) {
        TodoType todo = dao.findByCode(code);
        if (todo.getId() > -1) {
            todo.setDescription(dataToUpdate.getDescription());
            dao.update(todo);
            return "Todo updated";
        }
        return "Can't find todo";
    }

    public void deleteByCode(String code) throws Exception {
        dao.deleteByCode(code);
    }
}
