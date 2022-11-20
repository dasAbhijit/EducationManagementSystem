package com.ems.batch.converters;

import com.ems.batch.entities.BatchEntity;
import com.ems.batch.models.Batch;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.UUID;

@Mapper
public interface BatchMapper {

    @Mappings({
            @Mapping(target = "id", source = "id", qualifiedByName = "stringToUUID")
    })
    Batch entityToModel(BatchEntity entity);

    @Mappings({
            @Mapping(target = "id", source = "id", qualifiedByName = "uUIDTOString")
    })
    BatchEntity modelToEntity(Batch model);

    @Named("uUIDTOString")
    public static String uUIDToString(UUID id) {
        return id.toString();
    }

    @Named("stringToUUID")
    public static UUID stringToUUID(String id) {
        return UUID.fromString(id);
    }
}