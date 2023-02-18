package com.sraynitjsr.Student.Management.System.controller;

import com.sraynitjsr.Student.Management.System.model.Student;
import com.sraynitjsr.Student.Management.System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudents(student);
        return "Added New Student\n" + student;
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
