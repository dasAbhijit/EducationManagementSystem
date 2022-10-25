package com.ems.user.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.user.models.Student;

@RestController
@RequestMapping("student")
public class StudentController {

    @GetMapping("{id}")
    public Student getStudent(@PathVariable UUID id){
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
