package com.cucumber.CucumberMavenPrototype;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SharedSteps extends AbstractSteps {
	
	WebDriver driver = null;
	@Before
	public void MaketheDriverReady() throws Throwable {
		driver = getDriver("firefox");
	}

	@Given("^Open Parabank website Home page$")
	public void OpenWebsiteHomePage() throws Throwable {
		driver.navigate().to("http://parabank.parasoft.com/parabank/");
	}
	
	@After
	public void ClosetheDriver() throws Throwable {
		driver.quit();
	}
	
}
