package com.bdd.stepdefinition;

import com.bdd.base.ActionContainer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdefinition {
	
	private ActionContainer act;
	
	public Loginstepdefinition (ActionContainer act) {
		this.act=act;
	}
	
	//WebDriver driver;

	@Given("I want to login to the URL (.*)")

	public void openurl(String URL) throws InterruptedException {

		//WebDriverManager.chromedriver().setup();

		//driver = new ChromeDriver();

		//driver.manage().window().maximize();

		//driver.get(URL);

		System.out.println("1. Open Chrome & Application");
		act.gethomepage().clickSignin();
		Thread.sleep(3000);
	}

	@When("I enter the valid (.*) and (.*)")
	public void entercredentials(String username, String password) throws InterruptedException {
		//WebElement textUsername = driver.findElement(By.id("txtUsername"));

		//textUsername.sendKeys(username);
		act.getlogin().enterUserName(username);
		act.getlogin().enterPassword(password);
		
		//WebElement textPassword = driver.findElement(By.id("txtPassword"));

		//textPassword.sendKeys(password);
	}

	@When("click submit")
	public void click_login() throws InterruptedException {
		//WebElement buttonLogin = driver.findElement(By.id("btnLogin"));
		//buttonLogin.click();
		act.getlogin().clickLogin();
		Thread.sleep(50000);

	}

	@Then("I want to login successfully")
	public void output() {
		//WebElement linkWelcome = driver.findElement(By.id("welcome"));
		act.gethomepage().verifyLoggedUser();

		//String username = linkWelcome.getText();
		//String login = "Welcome Admin";
		//if (username.equals(login)) {
			//System.out.println("User name is correct");
		//} else {
			//System.out.println("Username is not correct");

		}
		
	}

