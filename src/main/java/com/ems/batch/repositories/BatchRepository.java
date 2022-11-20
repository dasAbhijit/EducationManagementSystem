package com.ems.batch.repositories;

import com.ems.batch.entities.BatchEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchRepository extends MongoRepository<BatchEntity, String> {
}

