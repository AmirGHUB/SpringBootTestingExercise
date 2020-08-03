package com.springboottesting.springboottesting.controller;

import com.springboottesting.springboottesting.model.Students;
import com.springboottesting.springboottesting.service.StudentService;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(StudentController.class)
public class controllerUnitTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private StudentService studentService;
    @InjectMocks
    private StudentController studentController;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void addStudent() throws Exception {
        //create student object
        Students mock = new Students("ken","ben","google");
        //create mock response
        when(studentService.addStudent(any(Students.class))).thenReturn(mock);
        //then crate the actual object to be sent with post mapping
        Students student = new Students("ken","ben","google");
        //then test it
        mockMvc
                .perform(post("/students", student))
                .andExpect(status().is(200))
                .andReturn();
    }
    @Test
    public void getStudents() throws Exception{
        Students mock = new Students("ken","ben","google");
        //create mock response
        when(studentService.addStudent(any(Students.class))).thenReturn(mock);

        mockMvc
                .perform(get("/students"))
                .andExpect(status().is(200))
                .andReturn();

    }

}
