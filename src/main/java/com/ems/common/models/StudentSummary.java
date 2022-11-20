package com.ems.common.models;

import org.immutables.value.Value.Immutable;
import org.springframework.lang.Nullable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.v3.oas.annotations.media.Schema;

@Immutable
@JsonDeserialize(builder = ImmutableStudentSummary.Builder.class)
public interface StudentSummary {

	@Schema(example = "a0dd60a1-e5eb-4776-96c0-93fcf0198c22")
	String getId();

	@Nullable
	@Schema(example = "Firstname Surname")
	String getName();
}
