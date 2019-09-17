package com.ilu2code.crud.dao;

import java.util.List;

import com.ilu2code.crud.entity.Student;

public interface StudentDao {
	public List<Student> getAllStudents();

	public void saveStudentDetails(Student student);

	public Student getStudentDetails(int id);

	public void deleteStudent(int student);
}
