package com.springboottesting.springboottesting.controller;

import com.springboottesting.springboottesting.model.Students;
import com.springboottesting.springboottesting.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }


    @PostMapping
    public Students addStudent(@RequestBody Students studs){

       return studentService.addStudent(studs);


    }

    @GetMapping
    public List<Students> getAllStudents(){
        List<Students> students = studentService.getAllStudents();
        return students;
    }

}
