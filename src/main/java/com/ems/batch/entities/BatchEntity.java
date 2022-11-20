package com.ems.batch.entities;

import com.ems.user.models.Student;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("Students")
public class BatchEntity {
    @Id
    private String id;
    private String name;
    private String board;
    private String capacity;
    private List<Student> students;
    private double fee;
}
