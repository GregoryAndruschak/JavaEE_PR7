package com.andruschak.pr.entities;

import java.util.Objects;

public class Student {

    private int studentId;
    private String pib;
    private int course;


    public Student() {
    }

    public Student(String pib, int course) {
        this.pib = pib;
        this.course = course;
    }


    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getPib() {
        return pib;
    }
    public void setPib(String pib) {
        this.pib = pib;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId &&
                course == student.course &&
                Objects.equals(pib, student.pib);
    }

    @Override
    public int hashCode() {

        return Objects.hash(studentId, pib, course);
    }
}