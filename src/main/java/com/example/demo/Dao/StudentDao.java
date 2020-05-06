package com.example.demo.Dao;

import com.example.demo.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudent();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentDao(Student student);
}
