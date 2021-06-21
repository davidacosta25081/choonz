package com.qa.examples.project.choonz.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.qa.examples.project.choonz.hooks.Hooks;
import com.qa.examples.project.choonz.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginChoonz {

	WebDriver webDriver;
	LoginPage login;

	public LoginChoonz(Hooks hooks) {
		// webDriver = hooks.getWebDriver();

		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		webDriver = new ChromeDriver();

	}

	@Given("user navigates to website of Choonz")
	public void userNavigatesToWebsiteOfChoonz() {
		login = new LoginPage(webDriver);
		webDriver.get(LoginPage.URL);

	}

	@When("typing credentials: username and password")
	public void typingCredentialsUsernameAndPassword() {

		login.typeUserNameAndPassword("Messi", "password");
		login.clickSubmit();

	}

	@Then("login must be successful")
	public void loginMustBeSuccessful() {
		login.logOutButtonIsDisplayed();
	}

}
