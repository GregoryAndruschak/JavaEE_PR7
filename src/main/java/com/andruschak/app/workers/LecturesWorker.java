package com.andruschak.app.workers;

import org.springframework.beans.factory.annotation.Autowired;

import com.andruschak.app.dao.LecturesDao;
import com.andruschak.app.entities.Lecture;

public class LecturesWorker {
    @Autowired
    LecturesDao lecturesDao;

    public Lecture addLecture(Lecture lecture) {
        lecture = lecturesDao.addLecture(lecture);
        System.out.println(lecture);
        return lecture;
    }

    public  Lecture getLectre (int id) {
        Lecture l = lecturesDao.getLecture(id);
        System.out.println(l);
        return l;
    }

    public void saveLecture(Lecture lecture) {
        System.out.println(lecture);
        lecturesDao.saveLecture(lecture);
    }
}