package com.ems.user.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

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
