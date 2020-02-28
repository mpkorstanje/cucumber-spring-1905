package com.example;

import io.cucumber.java.en.Given;

public class StepDefinitions {

    @Given("an application context")
    public void anApplicationContext() {
        // Generic application context doesn't support DI so not really.
    }
}
