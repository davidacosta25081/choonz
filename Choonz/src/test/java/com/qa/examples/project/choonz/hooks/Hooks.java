package com.qa.examples.project.choonz.hooks;
import com.qa.examples.project.choonz.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import com.qa.examples.project.choonz.utils.WebDriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	private WebDriver webDriver;
	
	@Before
	public void setup() {
		if (webDriver == null) {
			webDriver = WebDriverFactory.createWebDriver();
		}
	}
	
	@After
	public void teardown() {
		if (webDriver != null) {
			webDriver.quit();
		}
	}
	
	public WebDriver getWebDriver() {
		return webDriver;
	}
}