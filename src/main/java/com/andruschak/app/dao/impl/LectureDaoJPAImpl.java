package com.andruschak.app.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.andruschak.app.dao.LecturesDao;
import com.andruschak.app.entities.Lecture;

@Repository
@Transactional
public class LectureDaoJPAImpl implements LecturesDao {
    @PersistenceContext
    private EntityManager em;

    public Lecture addLecture(Lecture lecture) {
        em.persist(lecture);
        return lecture;
    }

    public Lecture getLecture(int id) {
        return em.find(Lecture.class, id);
    }

    public void saveLecture(Lecture lecture) {
        em.merge(lecture);
    }

}