package com.ems.EducationManagementSystem.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    int id;
    String fullName;
    String contactNo;
    String address;
    String level;
    String board;
    String parentFullName;
    String parentContactNo;
}
