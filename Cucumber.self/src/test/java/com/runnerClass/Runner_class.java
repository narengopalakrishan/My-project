package com.runnerClass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\Cucumber.self\\src\\test\\resources\\Features", 
glue= {"com.stepDefinition"},
monochrome = true,
plugin = {"pretty","html:target/htmlreport/report.html"})
public class Runner_class {


}
