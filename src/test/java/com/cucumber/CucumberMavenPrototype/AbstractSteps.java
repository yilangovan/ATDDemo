package com.cucumber.CucumberMavenPrototype;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import cucumber.api.java.Before;

public class AbstractSteps {
		
		protected static WebDriver driver = null;
		
		protected WebDriver getDriver(String browser){
			
			if(driver == null){				
			//Check if the browser is 'firefox'
			 
	        if(browser.equalsIgnoreCase("firefox")){
	        	
	        	System.setProperty("webdriver.firefox.bin","PATH_TO_BINARY");
	        	//FirefoxBinary binary = new FirefoxBinary(new File("path/to/binary"));
	        	FirefoxProfile profile = new FirefoxProfile();
	            driver = new FirefoxDriver(profile);
	        	
	        }
	        else if(browser.equalsIgnoreCase("safari")){
	        	driver = new SafariDriver(); 
	        	
	        }
	        
	      //Check if the browser is 'opera'
	        else if(browser.equalsIgnoreCase("opera")){
	        	
	        	//DesiredCapabilities capabilities = DesiredCapabilities.opera();
	            //capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	            	
	            System.setProperty("webdriver.opera.driver", "/Users/yuvarajilangovan/Downloads/operadriver");
	            driver = new OperaDriver();
	        }
	        else if(browser.equalsIgnoreCase("chrome")){
	   //   System.setProperty("webdriver.chrome.driver","/Users/yuvarajilangovan/Desktop/chromedriver");
	        	System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
	 
	      //create chrome instance
	      driver = new ChromeDriver();
			
	        }
		}
			return driver;
		
    }
}

	
	
	


