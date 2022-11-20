package com.ems.user.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ems.user.models.Student;
import com.ems.user.services.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("{id}")
	public Object getById(@PathVariable String id) {
		return studentService.getById(id);
	}

	@PostMapping("add")
	public Student add(@RequestBody Student student) {
		return studentService.add(student);
	}

	@PutMapping("update")
	public Student update(@RequestBody Student student) {
		return studentService.update(student);
	}

	@GetMapping("summary")
	public Object findSummariesByIds(@RequestParam UUID... ids) {
		return studentService.findStudentSummaryByID(ids);
	}
}
