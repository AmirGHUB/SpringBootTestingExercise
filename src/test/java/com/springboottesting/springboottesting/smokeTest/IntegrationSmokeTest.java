package com.springboottesting.springboottesting.smokeTest;

import com.springboottesting.springboottesting.SpringbootTestingApplicationTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ DBHealth.class , SpringbootTestingApplicationTests.class})
public class IntegrationSmokeTest {
}
