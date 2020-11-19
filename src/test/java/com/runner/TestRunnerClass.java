package com.runner; 

import org.apache.commons.lang.math.JVMRandom;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.utilities.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue = {"com.stepdefinition"},plugin= {"pretty","json:src\\test\\resources\\Reports\\cucumber.json"})

public class TestRunnerClass {
  public static void afterClass() {
	JVMReport.generateJVMreoprt(System.getProperty("user.dir")+"src\\test\\resources\\Reports\\cucumber.json");

}
	
	
}
