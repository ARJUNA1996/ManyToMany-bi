package com.ty.manytomany.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytomany.dto.Subject;
import com.ty.manytomany.dto.Teacher;

public class SaveTeacher {
	
	
	public static void main(String[] args) {
		
		List<Subject> subs=new ArrayList<Subject>();
		
		List<Teacher> teachs=new ArrayList<Teacher>();
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager manager=factory.createEntityManager();
		
		EntityTransaction transaction=manager.getTransaction();
		
		Teacher teacher= new Teacher();
		teacher.setName("MAllikarjuna");
		teacher.setAge(26);
		
		Subject subject=new Subject();
		subject.setName("AES");
		subject.setDays(15);
		
		Subject subject1=new Subject();
		subject1.setName("AWS");
		subject1.setDays(15);
		
		Subject subject2=new Subject();
		subject2.setName("EE");
		subject2.setDays(25);
		
		subs.add(subject);
		subs.add(subject1);
		subs.add(subject2);
		
		teacher.setSubjects(subs);
		
//		
//		Subject subject3=new Subject();
//		subject.setName("AES");
//		subject.setDays(15);
//
//		
//		Teacher teacher1= new Teacher();
//		teacher1.setName("NAGENDRA");
//		teacher1.setAge(32);
//		
//		Teacher teacher2= new Teacher();
//		teacher2.setName("LAKSHMI");
//		teacher2.setAge(22);
//		
//		Teacher teacher3= new Teacher();
//		teacher.setName("MEGHANA");
//		teacher.setAge(28);
//		
//		teachs.add(teacher);
//		teachs.add(teacher1);
//		teachs.add(teacher2);
//		teachs.add(teacher3);
//		
//		subject.setTeahers(teachs);
//		
//	
		
		transaction.begin();
		manager.persist(teacher);
	//	manager.persist(teacher1);
	//	manager.persist(teacher2);
	//	manager.persist(teacher3);
		manager.persist(subject);
		manager.persist(subject1);
		manager.persist(subject2);
	//	manager.persist(subject3);
		transaction.commit();
		
		
		
		
	}

}
