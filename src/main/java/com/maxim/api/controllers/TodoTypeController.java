package com.maxim.api.controllers;
import com.maxim.api.entities.TodoType;
import com.maxim.api.services.TodoService;
import com.maxim.api.services.TodoTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todoType")
public class TodoTypeController {

    private TodoService todoService;
    private TodoTypeService todoTypeService;

    //constructor-based dependency injection of TodoTypeService
    @Autowired
    public TodoTypeController(TodoService todoService, TodoTypeService todoTypeService) {
        this.todoService = todoService;
        this.todoTypeService = todoTypeService;
    }
    @GetMapping(value = "/read", produces = {"application/json", "application/xml"})
    public TodoType readTodoType() {
        TodoType todoType = new TodoType();
        todoType.setCode("PERSONAL");
        todoType.setDescription("Todo for Personal Work");
        return todoType;
    }

    @PostMapping(value = "/create", produces = {"application/json", "application/xml"})
    public TodoType createTodoType() {
        TodoType todoType = new TodoType();
        todoType.setCode("PROFESSIONAL");
        todoType.setDescription("Todo for Professional Work");
        return todoType;
    }

    @PostMapping(consumes={"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
    public String create(@RequestBody TodoType todoType) {
        return todoTypeService.create(todoType);
    }

    @GetMapping(value = "/{code}", produces = {"application/xml"})
    public TodoType read(@PathVariable("code") String code) {
        return todoTypeService.findByCode(code);
    }

    @PutMapping
    public String updateTodo(@RequestBody String code, @RequestBody TodoType todoType) {
        return todoTypeService.update(code, todoType);
    }
    @DeleteMapping("/{code}")
    public ResponseEntity delete(@PathVariable("code") String code) {
        try {
            todoTypeService.deleteByCode(code);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
}
