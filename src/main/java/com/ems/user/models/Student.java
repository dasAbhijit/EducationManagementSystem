package com.ems.user.models;

import java.util.UUID;

import org.immutables.value.Value.Immutable;
import org.springframework.lang.Nullable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Immutable
@JsonDeserialize(builder = ImmutableStudent.Builder.class)
public interface Student {

	String getAddress();

	String getBoard();

	String getContactNo();

	@Nullable
	UUID getId();

	String getLevel();

	String getName();

	String getParentContactNo();

	String getParentFullName();

}