package com.ems.user.services;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.common.models.StudentSummary;
import com.ems.common.utils.ExceptionUtil;
import com.ems.user.converters.StudentMapper;
import com.ems.user.entities.StudentEntity;
import com.ems.user.models.Student;
import com.ems.user.repositories.StudentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public Student getById(String id) {
		Optional<StudentEntity> student = studentRepository.findById(id);
		if (student.isPresent()) {
			return studentMapper.toModel(student.get());
		}
		log.error("No Student found for given id : {}", id);
		throw ExceptionUtil.buildException("EMS0001");
	}

	@Override
	public Student add(Student student) {
		student.setId(UUID.randomUUID());
		return studentMapper.toModel(studentRepository.save(studentMapper.toEntity(student)));
	}

	@Override
	public Student update(Student student) {
		if (studentRepository.existsById(studentMapper.toEntity(student).getId())) {
			return studentMapper.toModel(studentRepository.save(studentMapper.toEntity(student)));
		}
		throw ExceptionUtil.buildException("EMS0001");
	}

	@Override
	public Collection<StudentSummary> findStudentSummaries(Set<UUID> ids) {
		return StreamSupport.stream(studentRepository
				.findAllById(ids.stream().map(UUID::toString).collect(Collectors.toList())).spliterator(), false)
				.map(studentMapper::toStudentSummaryModel).collect(Collectors.toList());
	}
}
