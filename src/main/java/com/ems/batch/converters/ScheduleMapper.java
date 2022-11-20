package com.ems.batch.converters;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ems.batch.entities.ScheduleEntity;
import com.ems.batch.models.Schedule;
import com.ems.common.converters.StringToUUIDConverter;
import com.ems.common.converters.StringToUUIDConverter.StringToUUID;

@Mapper(uses = { StringToUUIDConverter.class })
public interface ScheduleMapper {

	@Mapping(target = "id", source = "id", qualifiedBy = StringToUUID.class)
	Schedule toModel(ScheduleEntity entity);

	ScheduleEntity toEntity(Schedule model);

}