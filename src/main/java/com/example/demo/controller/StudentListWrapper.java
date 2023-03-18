package com.example.demo.controller;

import com.example.demo.model.Student;

import java.util.List;

public class StudentListWrapper {
    private final List<Student> students;

    public StudentListWrapper(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}
