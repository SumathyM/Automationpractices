package com.automationpractice.pageobjects;

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
	
	@FindBy(how = How.CLASS_NAME, using = "login")
	protected WebElement lnkLogin;
	
	@FindBy(how = How.CLASS_NAME, using = "logout")
	protected WebElement lnkLogout;

}
