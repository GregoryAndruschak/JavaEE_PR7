package com.andruschak.pr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;

import com.andruschak.pr.entities.Student;
import com.andruschak.pr.entities.Teacher;
import com.andruschak.pr.worker.*;


public class PrApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		Student testStudent = new Student("Vlad Valt", 5);
		WorkWithStudents worker = (WorkWithStudents) context.getBean("worker");
		Student student = worker.getStudentFromDb(1);
		System.out.println(student);
		student = worker.getStudentFromDb(1);
		System.out.println(student);
	}
}
