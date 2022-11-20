package com.ems.batch.models;

import java.util.List;
import java.util.UUID;

import org.immutables.value.Value.Immutable;
import org.springframework.lang.Nullable;

import com.ems.common.models.StudentSummary;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Immutable
@JsonDeserialize(builder = ImmutableBatch.Builder.class)
public interface Batch {


	@Nullable
	UUID getId();
	
	String getBoard();

	int getCapacity();

	@Nullable
	String getDescription();

	double getFee();

	String getName();

	List<StudentSummary> getStudents();
	
	List<Schedule> getSchedules();

}