package com.ems.user.services;

import com.ems.user.models.Student;

public interface StudentService {
    Object getById(String id);

    Student add(Student student);

    Student update(Student student) throws Exception;
}
