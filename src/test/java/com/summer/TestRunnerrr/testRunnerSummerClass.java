package com.summer.TestRunnerrr;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.summer.utilityy.base_classSummer;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/FeatureSummer"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDefinitionSummer" ) //tags= {"@Tom"})

public class testRunnerSummerClass extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	public void startURLSUM () {
		base_classSummer testsum = new base_classSummer();
		testsum.initbrowsersum();
		
		
	}
	
	@AfterTest
	public void closeURLSUM () {
		
		base_classSummer testsum = new base_classSummer();
		
	testsum.driver.quit();
		
	}
}
