package com.springboottesting.springboottesting.service;

import com.springboottesting.springboottesting.model.Students;
import com.springboottesting.springboottesting.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    StudentService(){

    }


    public Students addStudent(Students st){
        Students s1 = studentRepository.save(st);
        return s1;
    }

    public List<Students> getAllStudents(){
        List<Students> students = studentRepository.findAll();
        return students;
    }
}
