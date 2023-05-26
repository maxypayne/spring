package com.maxim.api.controllers;

import com.maxim.api.models.Student;
import com.maxim.api.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(
        value = "/students",
        produces = "application/json"
)
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
    StudentRepository studentService;
    @Autowired
    public StudentController(StudentRepository studentRepository) {
        studentService = studentRepository;
    }
    @GetMapping()
    public List<Student> getStudents() {
        List<Student> students = null;
        try {
            students = studentService.findAll();
            System.out.println("students");
            System.out.println(students);
            return students;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return students;
    }
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        System.out.println(student.toString());
        studentService.save(student);
        return "Student added";
    }

}
