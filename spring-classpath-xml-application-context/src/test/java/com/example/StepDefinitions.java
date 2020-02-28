package com.example;

import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import static org.junit.Assert.assertNotNull;

public class StepDefinitions {

    @Autowired
    private ApplicationContext applicationContext;

    @Given("an application context")
    public void anApplicationContext() {
        assertNotNull(applicationContext);
    }
}
