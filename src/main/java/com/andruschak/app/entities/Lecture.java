package com.andruschak.app.entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "lectures")
public class Lecture {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(length = 150, nullable = false)
    private String name;

    private double credits;


    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "lec_stud",
            joinColumns = @JoinColumn(name = "lec_fk"),
            inverseJoinColumns = @JoinColumn(name = "stud_fk"))
    private List<Student> students;


    @ManyToOne(cascade = {CascadeType.ALL})

    private Teacher teacher;



    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // Getters and settings
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Lecture [name=" + name + ", credits=" + credits + "]";
    }

}