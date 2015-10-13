package com.cucumber.CucumberMavenPrototype;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


public class SharedSteps extends AbstractSteps {
	
	WebDriver driver = null;
	@Before
	public void MaketheDriverReady() throws Throwable {
		driver = getDriver(GetBrowserName());
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
