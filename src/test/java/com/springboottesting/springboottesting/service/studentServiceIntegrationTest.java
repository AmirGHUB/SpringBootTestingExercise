package com.springboottesting.springboottesting.service;


import com.springboottesting.springboottesting.model.Students;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class studentServiceIntegrationTest {

    @Autowired
    public StudentService studentService;

    @Test
    public void addStudent(){

        //create student object
        Students student = new Students("ken", "ben", "google");

        //test the service class when adding student object
        Students savedStudent = studentService.addStudent(student);

        assertNotNull(savedStudent);
        assertEquals("ken", savedStudent.getFirstName());

    }

    @Test
    public void getStudents(){
        //get the list from the database
        List<Students> students = studentService.getAllStudents();

        //check if the size is the same as a given count
        assertEquals(students.size() , 4);

    }


}
