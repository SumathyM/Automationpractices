package com.orangehrm.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomepageUI {
	protected WebDriver driver;
	public HomepageUI (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//public WebElement linkWelcome = driver.findElement(By.id("welcome"));
	@FindBy(how = How.ID, using = "welcome")
	protected WebElement linkWelcome;
	//WebElement userSearchBox = driver.findElement(By.id("searchSystemUser_userName"));

}
