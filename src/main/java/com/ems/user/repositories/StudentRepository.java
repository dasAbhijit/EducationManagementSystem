package com.ems.user.repositories;

import com.ems.user.entities.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentEntity, String> {
	
}
