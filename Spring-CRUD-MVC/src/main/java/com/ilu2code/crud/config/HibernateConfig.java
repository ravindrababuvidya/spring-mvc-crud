package com.ilu2code.crud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.ilu2code.crud.entity.Student;

@Configuration
@EnableTransactionManagement
public class HibernateConfig {
	@Autowired
	private ApplicationContext applicationContext;
	
	@Bean
	public LocalSessionFactoryBean getSessionfactory() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setConfigLocation(applicationContext.getResource("classpath:hibernate-cfg.xml"));
		factoryBean.setAnnotatedClasses(Student.class);
		System.out.println("Created session Factory "+factoryBean.getMetadataSources());
		return factoryBean;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		
		transactionManager.setSessionFactory(getSessionfactory().getObject());
		return transactionManager;
		
	}
}
