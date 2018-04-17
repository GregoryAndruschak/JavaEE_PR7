package com.andruschak.app;

import com.andruschak.app.workers.StudentsWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.andruschak.app.entities.Lecture;
import com.andruschak.app.entities.Student;
import com.andruschak.app.entities.Teacher;
import com.andruschak.app.workers.TeachersWorker;

import java.util.ArrayList;
import java.util.List;

public class AppApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Lecture lecture = new Lecture();
		Teacher t = new Teacher();
		Student s = new Student();
		List<Student> ls = new ArrayList<Student>();
		ls.add(s);
		t.setName("Mykhailevich");
		lecture.setName("MODO");
		lecture.setCredits(5);
		List<Lecture> l = new ArrayList<Lecture>();
		l.add(lecture);
		t.setLectures(l);
		TeachersWorker worker = (TeachersWorker) context.getBean("Teachersworker");
		worker.addTeacher(t);

		System.out.println("<================>");

		StudentsWorker sworker = (StudentsWorker) context.getBean("Studentworker");

		Student student = sworker.getStudentById(1);
		System.out.println(student);
		student = sworker.getStudentById(1);
		System.out.println(student);
	}
}
