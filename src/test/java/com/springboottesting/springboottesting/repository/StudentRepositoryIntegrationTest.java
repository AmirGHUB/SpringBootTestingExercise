package com.springboottesting.springboottesting.repository;

import com.springboottesting.springboottesting.model.Students;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import java.util.List;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StudentRepositoryIntegrationTest {

    @Autowired
    private EntityManager entityManager;
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void addStudent(){
        //create student
        Students student = new Students("iron","man","AvengersHQ");
        //persist wit entity manager
        entityManager.persist(student);
        //check if the list cotains iron
        List<Students> students = studentRepository.findAll();
        boolean checkName = false;
        for(Students s : students){
            if(s.getFirstName()=="iron"){
                checkName = true;
            }
        }
        //now test the method
        assertTrue(checkName);

        }
}
