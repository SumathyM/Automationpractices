package com.bdd.base;

import com.automationpractice.actions.HomePageActions;
import com.automationpractice.actions.LoginActions;

public class ActionContainer extends BaseUtil {
	public ActionContainer() {
		createPageObjects();
	}
	private HomePageActions homepage;
	private LoginActions login;
	
	public HomePageActions gethomepage() {
		return homepage;
	}
	public LoginActions getlogin() {
		return login;
	}
	
	private void createPageObjects() {
		homepage  = new HomePageActions(getWebDriver());
		login  = new LoginActions(getWebDriver());
	}

}

