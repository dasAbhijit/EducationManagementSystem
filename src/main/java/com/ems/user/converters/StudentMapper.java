package com.ems.user.converters;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ems.common.converters.StringToUUIDConverter;
import com.ems.common.converters.StringToUUIDConverter.StringToUUID;
import com.ems.common.models.StudentSummary;
import com.ems.user.entities.StudentEntity;
import com.ems.user.models.Student;

@Mapper(uses = StringToUUIDConverter.class)
public interface StudentMapper {

	@Mapping(target = "id", source = "id", qualifiedBy = StringToUUID.class)
	Student toModel(StudentEntity entity);

	StudentEntity toEntity(Student model);

	@Mapping(target = "id", source = "id", qualifiedBy = StringToUUID.class)
	StudentSummary toStudentSummaryModel(StudentEntity entity);
}