package com.techlistic.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/PracticeOnDemoWebPage.feature"
		,glue="com/techlistic/steps"
		,dryRun=false
		,monochrome=true
		,plugin= {"pretty","html:target/cucumber-default-reports", "json:target/cucumber.json"}
		,tags= {"@dataTable"}
		)
public class TestRunner {
	
	
}
