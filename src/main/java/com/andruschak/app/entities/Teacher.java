package com.andruschak.app.entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "TEACHERS")
public class Teacher {

    @Id
    @GeneratedValue
    @Column(name = "teacherId")
    private int id;

    @Column(length = 150, nullable = false)
    private String name;


    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "teach_lec",
            joinColumns = @JoinColumn(name = "teach_fk"),
            inverseJoinColumns = @JoinColumn(name = "lec_fk"))
    private List<Lecture> lectures;

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    // Getters and settings
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}