package com.ems.batch.services;

import com.ems.batch.converters.BatchMapper;
import com.ems.batch.entities.BatchEntity;
import com.ems.batch.models.Batch;
import com.ems.batch.repositories.BatchRepository;
import com.ems.common.utils.ExceptionUtil;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class BatchServiceImpl implements BatchService {

	@Autowired
	private BatchRepository batchRepository;
	@Autowired
	private BatchMapper batchMapper;

	@Override
	public Batch getById(String id) {
		Optional<BatchEntity> batch = batchRepository.findById(id);
		if (batch.isPresent()) {
			return batchMapper.toModel(batch.get());
		}
		log.error("No Batch found for given id : {}", id);
		throw ExceptionUtil.buildException("EMS0002");
	}

	@Override
	public Batch add(Batch batch) {
		batch.setId(UUID.randomUUID());
		return batchMapper.toModel(batchRepository.save(batchMapper.toEntity(batch)));
	}

	@Override
	public Batch update(Batch batch) {
		return batchMapper.toModel(batchRepository.save(batchMapper.toEntity(batch)));
	}
}
