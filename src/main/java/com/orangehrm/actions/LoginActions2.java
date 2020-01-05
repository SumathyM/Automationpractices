package com.orangehrm.actions;

import org.openqa.selenium.WebDriver;

import com.orangehrm.pageobjects.LoginUI;

public class LoginActions2 extends LoginUI {

	public LoginActions2(WebDriver driver) {
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
