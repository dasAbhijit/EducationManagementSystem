package com.ems.batch.models;

import com.ems.user.models.Student;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Batch {
    private UUID id = UUID.randomUUID();
    private String name;
    private String board;
    private String capacity;
    private List<Student> students;
    private double fee;
}
