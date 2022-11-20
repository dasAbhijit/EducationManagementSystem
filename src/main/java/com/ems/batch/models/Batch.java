package com.ems.batch.models;

import java.util.List;
import java.util.UUID;

import com.ems.common.models.StudentSummary;

import lombok.Data;

@Data
public class Batch {
    private UUID id = UUID.randomUUID();
    private String name;
    private String board;
    private String capacity;
    private List<StudentSummary> students;
    private double fee;
}
