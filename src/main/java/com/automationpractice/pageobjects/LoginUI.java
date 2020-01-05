package com.automationpractice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginUI {
	protected WebDriver driver;

	// default constructor

	public LoginUI(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "email")
	protected WebElement textUsername;
	
	@FindBy(how = How.ID, using = "passwd")
	protected WebElement textPassword;

	@FindBy(how = How.ID, using = "SubmitLogin")
	protected WebElement buttonLogin;

}
