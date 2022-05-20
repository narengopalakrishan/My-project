package com.project_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\Cucumber.self\\src\\test\\resources\\Features",
glue= {"com.project_stepDefinition"},
monochrome = true,
plugin= {"pretty","html:target/report/loginreport.html"})
public class TestRunner {

}
