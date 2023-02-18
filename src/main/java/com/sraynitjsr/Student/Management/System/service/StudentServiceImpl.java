package com.sraynitjsr.Student.Management.System.service;

import com.sraynitjsr.Student.Management.System.model.Student;
import com.sraynitjsr.Student.Management.System.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void saveStudents(Student student) {
        studentRepository.save(student);
    }
}
