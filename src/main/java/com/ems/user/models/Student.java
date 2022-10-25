package com.ems.user.models;

import java.util.UUID;

import lombok.Data;

@Data
public class Student {
    private UUID id;
    private String name;
    private String contactNo;
    private String address;
    private String level;
    private String board;
    private String parentFullName;
    private String parentContactNo;
}
