package com.example;

import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
@DirtiesContext
public class StepDefinitions {
    @Autowired
    private ApplicationContext applicationContext;

    @Given("an application context")
    public void anApplicationContext() {
        assertNotNull(applicationContext);
    }
}
