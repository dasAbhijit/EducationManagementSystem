package com.ems.EducationManagementSystem;

import com.ems.EducationManagementSystem.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student/1")
    public Student getStudent(){
        Student student1 = new Student();
        student1.setId(1);
        student1.setFullName("Abhijit Das");
        student1.setLevel("class 8");
        student1.setBoard("WB");
        student1.setContactNo("+91 9038793810");
        student1.setAddress("469 P N Dey, Road West Rajapur, Kolkata - 32");
        student1.setParentFullName("Ashok Kumar Das");
        student1.setParentContactNo("+91 9113930050");
        return student1;
    }
}
