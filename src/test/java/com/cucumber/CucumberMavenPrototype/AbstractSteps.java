package com.cucumber.CucumberMavenPrototype;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

//import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import cucumber.api.java.Before;

public class AbstractSteps {
		
		protected static WebDriver driver = null;
		public String bname = null;
		
		protected String GetBrowserName()
		{
			
			try {
				File file = new File("config.properties");
				FileInputStream fileInput = new FileInputStream(file);
				Properties properties = new Properties();
				properties.load(fileInput);
				fileInput.close();

				Enumeration enuKeys = properties.keys();
				while (enuKeys.hasMoreElements()) {
					String key = (String) enuKeys.nextElement();
					if(key.equals("browserName")){
						bname = properties.getProperty(key);				
					}
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return bname;
		}
		
 		protected WebDriver getDriver(String browser){
			
			if(driver == null){				
			//Check if the browser is 'firefox'
			 
	        if(browser.equalsIgnoreCase("firefox")){
	            driver = new FirefoxDriver();
	        	
	        }
	        else if(browser.equalsIgnoreCase("safari")){
	        	driver = new SafariDriver(); 
	        }
	        
	        //Check if the browser is 'opera'
	        else if(browser.equalsIgnoreCase("opera")){	
	            System.setProperty("webdriver.opera.driver", "/usr/bin/operadriver");
	            driver = new OperaDriver();
	        }
	        else if(browser.equalsIgnoreCase("chrome")){
	        	System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver1");
	 
	        //create chrome instance
	            driver = new ChromeDriver();
			
	        }
		}
			return driver;
		
    }
}

	
	
	


