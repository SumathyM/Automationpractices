package com.orangehrm.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginUI {
	protected WebDriver driver;
	
	//default constructor
	
	public LoginUI(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	
	//public WebElement textUsername = driver.findElement(By.id("txtUsername"));
	@FindBy(how = How.ID, using = "txtUsername")
	protected WebElement textUsername;
	//public WebElement textPassword = driver.findElement(By.id("txtPassword"));
	@FindBy(how = How.ID, using = "txtPassword")
	protected WebElement textPassword;
	//public WebElement buttonLogin = driver.findElement(By.id("btnLogin"));
	@FindBy(how = How.ID, using = "btnLogin")
	protected WebElement buttonLogin;
		
	
}
