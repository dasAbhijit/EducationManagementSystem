package com.ems.user.services;

import com.ems.common.utils.ExceptionUtil;
import com.ems.user.converters.StudentMapper;
import com.ems.user.entities.StudentEntity;
import com.ems.user.models.Student;
import com.ems.user.repositories.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

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
			return studentMapper.entityToModel(student.get());
		}
		log.error("No Stident found for given id : {}", id);
		throw ExceptionUtil.buildException("EMS0001");
	}

	@Override
	public Student add(Student student) {
		student.setId(UUID.randomUUID());
		return studentMapper.entityToModel(studentRepository.save(studentMapper.modelToEntity(student)));
	}

	@Override
	public Student update(Student student) {
		// TODO : find student
		return studentMapper.entityToModel(studentRepository.save(studentMapper.modelToEntity(student)));
	}
}
