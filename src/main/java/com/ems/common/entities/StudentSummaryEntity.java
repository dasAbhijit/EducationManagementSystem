package com.ems.common.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class StudentSummaryEntity {

	@Schema(example = "a0dd60a1-e5eb-4776-96c0-93fcf0198c22")
	private String id;

	@Schema(example = "Firstname Surname")
	private String name;
}
