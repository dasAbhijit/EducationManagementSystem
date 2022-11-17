package com.ems.user.converters;

import com.ems.user.entities.StudentEntity;
import com.ems.user.models.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.UUID;

@Mapper
public interface StudentMapper {

    @Mappings({
            @Mapping(target = "id", source = "id", qualifiedByName = "stringToUUID")
    })
    Student entityToModel(StudentEntity entity);

    @Mappings({
            @Mapping(target = "id", source = "id", qualifiedByName = "uUIDTOString")
    })
    StudentEntity modelToEntity(Student model);

    @Named("uUIDTOString")
    public static String uUIDToString(UUID id) {
        return id.toString();
    }

    @Named("stringToUUID")
    public static UUID stringToUUID(String id) {
        return UUID.fromString(id);
    }
}