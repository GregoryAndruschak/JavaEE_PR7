package com.andruschak.app.dao;

import com.andruschak.app.entities.Lecture;

public interface LecturesDao {

    Lecture addLecture(Lecture lecture);

    Lecture getLecture(int id);

    void saveLecture(Lecture lecture);

}