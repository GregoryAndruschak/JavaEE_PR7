package com.andruschak.app.dao.impl;

import javax.persistence.Cacheable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.andruschak.app.dao.StudentsDao;
import com.andruschak.app.entities.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
@Transactional
public class StudentDaoJPAImpl implements StudentsDao {
    @PersistenceContext
    private EntityManager em;

    public Student addStudent(Student student) {
        em.persist(student);
        return student;
    }

    public Student getStudent(int id) {
        return em.find(Student.class, id);
    }

    public void saveStudent(Student student) {
        em.merge(student);
    }


}