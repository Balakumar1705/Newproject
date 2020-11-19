package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageSteps {
	
	WebDriver driver;
	@Given("User is on the Addactin Page")
	public void user_is_on_the_Addactin_Page() {
	   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balas\\eclipse-workspace\\Addcatin\\driver\\chromedriver.exe" );
		driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@When("User Should enter {string} and {string}")
	public void user_Should_enter_and(String userName, String pass) {
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys(userName);
		
	
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(pass);
			
	}

	@When("User should click login button")
	public void user_should_click_login_button() {
		WebElement btnLogin = driver.findElement(By.id("login"));
	   btnLogin.click();
	}

	@Then("User should verify the msg")
	public void user_should_verify_the_msg() {
	   
		Assert.assertTrue("verifyurl", driver.getCurrentUrl().contains("adactin"));
		
	}



}
