package com.ems.user.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {
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
