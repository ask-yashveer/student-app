package com.example.demo.Service;

import com.example.demo.Dao.StudentDaoImplementation;
import com.example.demo.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDaoImplementation studentDaoImplementation;

    public Collection<Student> getAllStudent(){
        return this.studentDaoImplementation.getAllStudent();
    }

    public Student getStudentById(int id){
        return this.studentDaoImplementation.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDaoImplementation.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.studentDaoImplementation.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDaoImplementation.insertStudentDao(student);
    }
}
