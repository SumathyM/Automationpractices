package com.automationpractice.actions;

import org.openqa.selenium.WebDriver;

import com.automationpractice.pageobjects.LoginUI;

public class LoginActions extends LoginUI {

	public LoginActions(WebDriver driver) {
		super(driver);
	}

	public void enterUserName(String username) {
		textUsername.sendKeys(username);
	}

	public void enterPassword(String password) {
		textPassword.sendKeys(password);
	}

	public void clickLogin() {
		buttonLogin.click();
	}
}
