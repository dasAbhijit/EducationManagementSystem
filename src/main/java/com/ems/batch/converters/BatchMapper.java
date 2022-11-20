package com.ems.batch.converters;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ems.batch.entities.BatchEntity;
import com.ems.batch.models.Batch;
import com.ems.common.converters.StringToUUIDConverter;
import com.ems.common.converters.StringToUUIDConverter.StringToUUID;
import com.ems.common.converters.StudentSummaryMapper;

@Mapper(uses = { StringToUUIDConverter.class, StudentSummaryMapper.class, ScheduleMapper.class })
public interface BatchMapper {

	@Mapping(target = "id", source = "id", qualifiedBy = StringToUUID.class)
	Batch toModel(BatchEntity entity);

	BatchEntity toEntity(Batch model);

}