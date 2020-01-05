package com.orangehrm.actions;

import org.openqa.selenium.WebDriver;

import com.orangehrm.pageobjects.HomepageUI;

public class HomePageActions1 extends HomepageUI {

	public HomePageActions1(WebDriver driver) {
		super(driver);
		
	}
	
	public void verifyLoggedUser() {
		linkWelcome.isDisplayed();
	}

}
