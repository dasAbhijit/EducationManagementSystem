package com.ems.batch.models;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import org.immutables.value.Value.Immutable;
import org.springframework.lang.Nullable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.v3.oas.annotations.media.Schema;

@Immutable
@JsonDeserialize(builder = ImmutableSchedule.Builder.class)
public interface Schedule {

	@Nullable
	UUID getId();

	LocalTime getStartTime();


	@Schema(example = "01:11:11")
	LocalTime getEndTime();

	DayOfWeek getDayOfWeek();
	
	@Nullable
	String getDescription();

	LocalDate getValidFrom();

	LocalDate getValidTo();

	String getName();
	

}