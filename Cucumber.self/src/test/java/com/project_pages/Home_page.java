package com.project_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {

	public WebDriver driver2;
	
	public Home_page(WebDriver driver) {
		this.driver2=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "logout") 
	@CacheLookup
	public static WebElement logout;
	
	public static WebElement getLogout() {
		return logout;
	}
	
}
