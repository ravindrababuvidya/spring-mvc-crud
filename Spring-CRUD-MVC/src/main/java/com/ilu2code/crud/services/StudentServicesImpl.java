package com.ilu2code.crud.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ilu2code.crud.dao.StudentDao;
import com.ilu2code.crud.entity.Student;

@Service
public class StudentServicesImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	@Transactional
	public List<Student> getAllStudentDetais(){
		return studentDao.getAllStudents();
	}
	
}
