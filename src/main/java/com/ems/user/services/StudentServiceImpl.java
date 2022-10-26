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

    List<Student> studentDB = new ArrayList<>();
    @Override
    public Student getById(final UUID id) {
        for (Student student : studentDB) {
            if (student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }

    @Override
    public Student add(Student student) {
        student.setId(UUID.randomUUID());
        studentDB.add(student);
        return student;
    }

    @Override
    public Student update(Student newStudent) throws Exception {
        Student student = getById(newStudent.getId());
        if (student != null) {
            studentDB.remove(student);
            newStudent.setId(student.getId());
            studentDB.add(newStudent);
            return newStudent;
        } else {
            throw new Exception("Data not found");
        }
    }
}
