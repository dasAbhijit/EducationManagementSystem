package com.ems.common.converters;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ems.common.converters.StringToUUIDConverter.StringToUUID;
import com.ems.common.entities.StudentSummaryEntity;
import com.ems.common.models.StudentSummary;

@Mapper(uses = StringToUUIDConverter.class)
public interface StudentSummaryMapper {

	@Mapping(target = "id", source = "id", qualifiedBy = StringToUUID.class)
	public StudentSummary toModel(StudentSummaryEntity entity);

	public StudentSummaryEntity toEntity(StudentSummary model);
}
