package com.everis.bdd_gherkin.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@test",glue = {""}, monochrome = true,
                plugin = {"pretty", "json:target/cucumber.json"})
public class RunnerTest {

}
