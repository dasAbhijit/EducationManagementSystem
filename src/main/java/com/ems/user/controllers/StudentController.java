package com.ems.user.controllers;

import java.util.UUID;

import com.ems.user.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ems.user.models.Student;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("{id}")
    public Student getById(@PathVariable UUID id){
        return studentService.getById(id);
    }

    @PostMapping("add")
    public Student add(@RequestBody Student student) {
        return studentService.add(student);
    }

    @PutMapping("update")
    public Student update(@RequestBody Student student) throws Exception {
        return studentService.update(student);
    }
}
