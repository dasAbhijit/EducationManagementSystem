package com.ems.user.services;

import com.ems.user.models.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Override
    public Student getById(final UUID id) {
        Student student1 = new Student();
        student1.setId(id);
        student1.setName("Abhijit Das");
        student1.setLevel("class 8");
        student1.setBoard("WB");
        student1.setContactNo("+91 9038793810");
        student1.setAddress("469 P N Dey, Road West Rajapur, Kolkata - 32");
        student1.setParentFullName("Ashok Kumar Das");
        student1.setParentContactNo("+91 9113930050");
        return student1;
    }
}
