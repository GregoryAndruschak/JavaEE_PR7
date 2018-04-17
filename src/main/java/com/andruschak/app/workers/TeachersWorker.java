package com.andruschak.app.workers;

import com.andruschak.app.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;

import com.andruschak.app.dao.TeachersDao;
import com.andruschak.app.entities.Teacher;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import javax.persistence.Cacheable;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeachersWorker {
    @Autowired
    TeachersDao teachersDao;

    public Teacher addTeacher(Teacher teacher) {
        teacher = teachersDao.addTeacher(teacher);
        System.out.println(teacher);
        return teacher;
    }

    public Teacher getTeacher(int id) {
        Teacher l = teachersDao.getTeacher(id);
        System.out.println(l);
        return l;
    }

    public void saveTeacher(Teacher teacher) {
        System.out.println(teacher);
        teachersDao.saveTeacher(teacher);
    }


}