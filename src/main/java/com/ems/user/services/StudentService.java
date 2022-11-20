package com.ems.user.services;

import java.util.Collection;
import java.util.Set;
import java.util.UUID;

import com.ems.common.models.StudentSummary;
import com.ems.user.models.Student;

public interface StudentService {
	Student getById(String id);

	Student add(Student student);

	Student update(Student student);
	
	Collection<StudentSummary> findStudentSummaries(Set<UUID> ids);
}
