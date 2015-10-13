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

public class LogInOutSteps extends AbstractSteps {
	
	WebDriver driver = null;
	@Before
	public void MaketheDriverReady() throws Throwable {
		driver = getDriver(GetBrowserName());
	}

	@When("^user \"([^\"]*)\" logs in using password \"([^\"]*)\"$")
	public void EnterUsernamePassword(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
	}

	@Then("^clickon Log Out \"([^\"]*)\"$")
	public void clickon_Log_Out(String arg1) throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	}
	
}
