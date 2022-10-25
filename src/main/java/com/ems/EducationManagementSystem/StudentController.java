package com.ems.EducationManagementSystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome Abhijit";
    }
}
