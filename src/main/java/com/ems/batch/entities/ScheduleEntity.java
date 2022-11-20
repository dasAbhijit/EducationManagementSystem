package com.ems.batch.entities;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class ScheduleEntity {
	private String id;
	private LocalTime startTime;
	private LocalTime endTime;
	private DayOfWeek dayOfWeek;
	private String description;
	private LocalDate validFrom;
	private LocalDate validTo;
	private String name;
}
