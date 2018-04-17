package com.andruschak.app.workers;

import org.springframework.beans.factory.annotation.Autowired;

import com.andruschak.app.dao.StudentsDao;
import com.andruschak.app.entities.Student;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import javax.persistence.Cacheable;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentsWorker {
    @Autowired
    StudentsDao studentsDao;

    public Student addStudent(Student student) {
        student = studentsDao.addStudent(student);
        System.out.println(student);
        return student;
    }

    public Student getStudent(int id) {
        Student s = studentsDao.getStudent(id);
        System.out.println(s);
        return s;
    }

    public void saveStudent(Student student) {
        System.out.println(student);
        studentsDao.saveStudent(student);
    }

    @Cacheable(cacheName = "studentsCache")
    public Student getStudentById(int id){
        return jdbcTemplate.queryForObject(SQL_SELECT_STUDENT_BY_ID,
                new ParameterizedRowMapper<Student>() {
                    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Student student = new Student();
                        student.setStudentId(rs.getInt(1));
                        student.setName(rs.getString(2));
                        student.setCourse(rs.getInt(3));
                        return student;
                    }
                },id);
    }


}