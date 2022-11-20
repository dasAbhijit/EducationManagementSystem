package com.ems.batch.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ems.common.entities.StudentSummaryEntity;

import lombok.Data;

@Data
@Document("Batches")
public class BatchEntity {
	@Id
	private String id;
	private String name;
	private String board;
	private int capacity;
	private String description;
	private double fee;
	private List<StudentSummaryEntity> students;
	List<ScheduleEntity> schedules;
}
