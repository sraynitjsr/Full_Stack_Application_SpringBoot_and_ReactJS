package com.sraynitjsr.Student.Management.System.service;

import com.sraynitjsr.Student.Management.System.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public List<Student> getAllStudents();
    public Optional<Student> getStudentById(Long id);
    public void addStudent(Student student);
    public void updateStudent(Student student);
    public void deleteStudentById(Long id);
}
