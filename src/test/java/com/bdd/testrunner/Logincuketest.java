package com.bdd.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(value= Cucumber.class)
@CucumberOptions(monochrome = true,
features = "././resources/feature/Hrmlogin.feature",
glue = {
		"com.bdd.stepdefinition"
},
plugin = { "pretty","html:target/cucumber-html-report",
			"json:target/cucumber.json",
			"junit:target/cucumber.junit",
			"rerun:target/rerun.txt"}
)
public class Logincuketest {

}
