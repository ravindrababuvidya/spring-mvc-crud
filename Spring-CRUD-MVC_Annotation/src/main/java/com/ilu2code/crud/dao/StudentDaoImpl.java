package com.ilu2code.crud.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder.In;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ilu2code.crud.entity.Student;
@Repository
public class StudentDaoImpl implements StudentDao {
	
	private final String   STUDENT_QUERY = "from Student";
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		//Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		TypedQuery<Student> query = sessionFactory.getCurrentSession().createQuery(STUDENT_QUERY);
		return query.getResultList();
	}

	@Transactional
	public void saveStudentDetails(Student student) {
		// TODO Auto-generated method stub
		
		System.out.println("Storing Student Data");
		
		sessionFactory.getCurrentSession().saveOrUpdate(student);
		
	}

	public Student getStudentDetails(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Student.class, id);
	}

	public void deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		//sessionFactory.getCurrentSession().delete(student);
		System.out.println("Delete Student Dao Called ");
		Session session = sessionFactory.getCurrentSession();
		Query query= session.createQuery("delete from Student  where id=:studentId");
		query.setParameter("studentId", studentId);
		query.executeUpdate();
		System.out.println("Delete Record  Called ");
	}

}
