package com.ilu2code.crud.services;

import java.util.List;

import com.ilu2code.crud.entity.Student;

public interface StudentService {
	public List<Student> getAllStudentDetais();

	public void saveStudent(Student student);
}
