package com.springboottesting.springboottesting.TestSuite;


import com.springboottesting.springboottesting.controller.controllerIntegrationTest;
import com.springboottesting.springboottesting.controller.controllerUnitTest;
import com.springboottesting.springboottesting.repository.StudentRepositoryIntegrationTest;
import com.springboottesting.springboottesting.service.StudentServiceUnitService;
import com.springboottesting.springboottesting.service.studentServiceIntegrationTest;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ controllerIntegrationTest.class , controllerUnitTest.class , StudentRepositoryIntegrationTest.class,
        StudentServiceUnitService.class , studentServiceIntegrationTest.class})
public class CollectionTest {
}
