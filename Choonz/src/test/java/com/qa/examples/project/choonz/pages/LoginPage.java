package com.qa.examples.project.choonz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

  WebDriver webDriver;
  WebElement username;
  WebElement password;
  WebElement submit;
  public static final String URL = "http://localhost:8082/login.html";
	
	
	
	public LoginPage(WebDriver webDriver) {
	  this.webDriver = webDriver;	
	  PageFactory.initElements(webDriver, this);	
	}


    public void typeUserNameAndPassword(String username, String password) {
    	webDriver.findElement(By.id("username")).sendKeys(username);
        webDriver.findElement(By.id("password")).sendKeys(password);  	
    }

    public void clickSubmit() {
      webDriver.findElement(By.id("submit")).click();
    }

    public void logOutButtonIsDisplayed() {
      webDriver.findElement(By.id("searchbar")).isDisplayed();	
    }
    
}
