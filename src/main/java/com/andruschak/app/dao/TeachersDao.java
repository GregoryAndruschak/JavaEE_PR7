package com.andruschak.app.dao;

import com.andruschak.app.entities.Teacher;

public interface TeachersDao {

    Teacher addTeacher(Teacher teacher);

    Teacher getTeacher(int id);

    void saveTeacher(Teacher teacher);

}