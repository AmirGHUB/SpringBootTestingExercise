package com.springboottesting.springboottesting.service;

import com.springboottesting.springboottesting.model.Students;
import com.springboottesting.springboottesting.repository.StudentRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@RunWith(MockitoJUnitRunner.class)
public class StudentServiceUnitService {

    @InjectMocks
    private StudentService studentService;
    @Mock
    private StudentRepository studentRepository;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void addStudent(){
        //create an object
        Students student = new Students("ken","ben","google");
        //tell the mock what to do in a specific case
        when(studentRepository.save(any(Students.class))).thenReturn(student);
        //now save the object
        Students savedStudent = studentService.addStudent(student);
        //now test the saved student we got back from the mock
        assertEquals("ken",savedStudent.getFirstName());

    }
}
