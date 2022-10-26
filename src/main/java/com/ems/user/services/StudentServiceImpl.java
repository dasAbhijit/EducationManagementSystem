package com.ems.user.services;

import com.ems.user.models.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    List<Student> studentList = new ArrayList<>();
    @Override
    public Student getById(final UUID id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }

    @Override
    public Student add(Student student) {
        student.setId(UUID.randomUUID());
        studentList.add(student);
        return student;
    }
}
