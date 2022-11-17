package com.ems.user.services;

import com.ems.user.models.Student;
import com.ems.user.repositories.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Object getById(String id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student add(Student student) {
        studentRepository.save(student);
        return student;
    }

    @Override
    public Student update(Student newStudent) {
        studentRepository.save(newStudent);
        return newStudent;
    }
}
