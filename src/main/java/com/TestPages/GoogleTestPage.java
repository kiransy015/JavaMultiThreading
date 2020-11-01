package com.TestPages;

import org.openqa.selenium.By;

import com.pages.BasePage;

public class GoogleTestPage extends BasePage {
	
	//page actions:
	public void googleSearchTest(){
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("naveen automationlabs");
		driver.findElement(By.name("q")).submit();
		driver.findElements(By.xpath("//h3")).stream().forEach(ele -> System.out.println(ele.getText()));
	}
	
}
