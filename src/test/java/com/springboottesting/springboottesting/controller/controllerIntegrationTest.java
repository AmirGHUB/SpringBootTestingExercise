package com.springboottesting.springboottesting.controller;

import com.springboottesting.springboottesting.model.Students;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class controllerIntegrationTest {
    @Autowired
    private StudentController studentController;

    @Test
    public void addStudent(){
        // create new stdent object
        Students student = new Students("bino","kino","google");
        //post the student
        Students savedStudent = studentController.addStudent(student);

        //now test the method

        assertThat("bino",is(equalTo(savedStudent.getFirstName())));

    }


}
