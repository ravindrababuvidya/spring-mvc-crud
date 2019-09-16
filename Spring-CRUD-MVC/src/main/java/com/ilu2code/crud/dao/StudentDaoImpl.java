package com.ilu2code.crud.dao;

import java.util.List;

import javax.persistence.TypedQuery;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ilu2code.crud.entity.Student;
@Repository
public class StudentDaoImpl implements StudentDao {
	
	private final String   STUDENT_QUERY = "from Student";
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		//Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		TypedQuery<Student> query = sessionFactory.getCurrentSession().createQuery(STUDENT_QUERY);
		return query.getResultList();
	}

}
