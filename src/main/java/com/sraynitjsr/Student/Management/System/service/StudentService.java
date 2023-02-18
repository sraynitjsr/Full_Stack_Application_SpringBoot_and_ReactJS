package com.sraynitjsr.Student.Management.System.service;

import com.sraynitjsr.Student.Management.System.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudents(Student student);
    public List<Student> getAllStudents();
}
