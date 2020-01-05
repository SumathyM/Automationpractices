package com.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtil extends EventFiringWebDriver {

	protected static WebDriver driver = null;
	
	public BaseUtil() {
		super(driver);
	}
	
	static {
		if (driver == null) {
			try { 
				newDriver();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static WebDriver newDriver () {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/");
		
		return driver;
	}
	
	public static void setWebDriver (WebDriver webDriver) {
		driver = webDriver;
	}
	public static WebDriver getWebDriver () {
		return BaseUtil.driver;
	}
	
	private static final Thread close_driver = new Thread() {
		@Override
		public void run() {
			driver.quit();
		}
	};
	
	static {
		Runtime.getRuntime().addShutdownHook(close_driver);
	}
	
	public void close() {
		if(Thread.currentThread() != close_driver) {
			throw new UnsupportedOperationException("You shouldn't close this driver. It is shared");
		}
		super.close();
	}
}
