package com.ems.user.controllers;

import com.ems.user.models.Student;
import com.ems.user.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("{id}")
    public Object getById(@PathVariable String id){
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
