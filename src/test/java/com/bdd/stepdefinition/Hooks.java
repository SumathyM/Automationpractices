package com.bdd.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bdd.base.BaseUtil;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseUtil {

	WebDriver driver;

	@Before
	public void testInitializer(Scenario scenario) {
		System.out.println("Hooks java files executed");
		manage().deleteAllCookies();
	}

	@After
	public void testTearDown(Scenario scenario) {
		System.out.println("Hooks after tag executed");
		if (scenario.isFailed()) {
			try {
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
