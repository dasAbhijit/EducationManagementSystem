package com.ems.user.services;

import com.ems.user.models.Student;

import java.util.UUID;

public interface StudentService {
    Student getById(UUID id);

    Student add(Student student);

    Student update(Student student) throws Exception;
}
