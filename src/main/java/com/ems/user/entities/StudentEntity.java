package com.ems.user.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Students")
public class StudentEntity {
    @Id
    private String id;
    private String name;
    private String contactNo;
    private String address;
    private String level;
    private String board;
    private String parentFullName;
    private String parentContactNo;
}
