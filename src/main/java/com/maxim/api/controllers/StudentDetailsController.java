package com.maxim.api.controllers;

import com.maxim.api.models.StudentDetails;
import com.maxim.api.repositories.StudentDetailsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(
        value = "/details",
        produces = "application/json"
)
public class StudentDetailsController {
    StudentDetailsRepository studentDetailsService;
    public StudentDetailsController(StudentDetailsRepository studentDetailsRepository) {
        this.studentDetailsService = studentDetailsRepository;
    }

    @GetMapping("/{id}")
    public Optional<StudentDetails> getStudentDetailsById(@PathVariable Integer id) {
        Optional<StudentDetails> studentDetails = studentDetailsService.findById(id);
        System.out.println(studentDetails);
        return studentDetails;
    }
    @GetMapping("/all")
    public List<StudentDetails> getAllDetails() {
        List<StudentDetails> details = studentDetailsService.findAll();
        System.out.println(details);
        return details;
    }
    @PostMapping("/add")
    public String getAllDetails(@RequestBody StudentDetails studentDetails) {
        String response = null;
        try {
            studentDetailsService.save(studentDetails);
            response = "Details added";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return response;
    }
}
