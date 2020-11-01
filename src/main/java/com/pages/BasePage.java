package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	public WebDriver driver;
	
	// init driver;
	public WebDriver setUp(String browserName){
		
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "G:\\Kiran\\Java\\eclipseWorkSpace\\JavaMultiThreading\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "G:\\Kiran\\Java\\eclipseWorkSpace\\JavaMultiThreading\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("http://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public void tearDown(){
		driver.quit();
	}
}
