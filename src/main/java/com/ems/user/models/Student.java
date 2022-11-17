package com.ems.user.models;

import lombok.Data;

import java.util.UUID;

@Data
public class Student {
    private UUID id = UUID.randomUUID();
    private String name;
    private String contactNo;
    private String address;
    private String level;
    private String board;
    private String parentFullName;
    private String parentContactNo;
}
