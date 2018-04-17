package com.andruschak.app.dao;

import com.andruschak.app.entities.Student;

public interface StudentsDao {

    Student addStudent(Student student);

    Student getStudent(int id);

    void saveStudent(Student student);

}