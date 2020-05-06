package com.example.demo.Dao;

import com.example.demo.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDaoImplementation implements StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Amit", "Computer Science"));
                put(2, new Student(2, "Ajay", "Information Technology"));
                put(3, new Student(3, "Ram", "Electronics"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudent(){
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id){
        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student){
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(),student);
    }

    @Override
    public void insertStudentDao(Student student) {
        this.students.put(student.getId(), student);
    }
}
