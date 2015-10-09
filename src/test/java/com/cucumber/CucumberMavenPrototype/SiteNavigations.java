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

public class SiteNavigations extends AbstractSteps {
	
	WebDriver driver = null;
	@Before
	public void MaketheDriverReady() throws Throwable {
		driver = getDriver("chrome");
	}
	
	@Then("^click on Open New Account link \"([^\"]*)\"$")
	public void ClickOnOpenNewAccountLink(String arg1) throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Open New Account')]")).click();
	}
	
	@Then("^click on Open New Account Button \"([^\"]*)\"$")
	public void ClickonNewAccountButton(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@value='Open New Account' and @type='submit']")).click();
	}
	
	@Then("^click on newly created account number$")
	public void click_on_newly_created_account_number() throws Throwable {
		driver.findElement(By.id("newAccountId")).click();
	}	
	
	@Then("^click on Update contact info \"([^\"]*)\"$")
	public void click_on_Update_contact_info(String arg1) throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();
	}
	
	@Then("^click on Transfer Funds \"([^\"]*)\"$")
	public void click_on_Transfer_Funds(String arg1) throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Transfer Funds')]")).click();
	}

	@Then("^Fill up the amount \"([^\"]*)\" to be transferred$")
	public void Fill_up_the_amount_to_be_transferred(String arg1) throws Throwable {
		driver.findElement(By.name("amount")).sendKeys(arg1);
	}

	@When("^from account \"([^\"]*)\" to account \"([^\"]*)\"$")
	public void from_account_to_account(String arg1, String arg2) throws Throwable {
		Select dropdown = new Select(driver.findElement(By.id("fromAccountId")));
		dropdown.selectByVisibleText(arg1);
		Select dropdown1 = new Select(driver.findElement(By.id("toAccountId")));
		dropdown1.selectByVisibleText(arg2);
	}

	@Then("^Click on Transfer button \"([^\"]*)\"$")
	public void Click_on_Transfer_button(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@value='Transfer' and @type='submit']")).click();
	}

	@Then("^Verify the transfer is complete$")
	public void Verify_the_transfer_is_complete() throws Throwable {
		Assert.assertEquals("ParaBank | Transfer Complete", driver.getTitle());
	}
	
}
