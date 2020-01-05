package com.automationpractice.actions;

import org.openqa.selenium.WebDriver;

import com.automationpractice.pageobjects.HomepageUI;

public class HomePageActions extends HomepageUI {

	public HomePageActions(WebDriver driver) {
		super(driver);	
	}
	
	public void verifyLoggedUser() {
		lnkLogout.isDisplayed();
	}
	
	public void clickSignin() {
		lnkLogin.click();
	}

}
