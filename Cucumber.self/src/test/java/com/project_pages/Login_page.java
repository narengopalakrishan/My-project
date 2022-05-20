package com.project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Login_page {

	public static WebDriver driver1;

	public Login_page(WebDriver driver) {
		this.driver1=driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this);
	}
	
	@FindBy(id = "name") public static WebElement id;
	public static WebElement getId() {
		return id;
	}

	@FindBy(id = "password") public static WebElement pass;
	public static WebElement getPass() {
		return pass;
	}

	public void login() {
		WebElement login = driver1.findElement(By.id("login"));
		login.click();
	}
	
	@FindBy(xpath = "//div[text()='Password is invalid']") public static WebElement invalid;

	public static WebElement getInvalid() {
		return invalid;
	}

	public void full_login_function(String fullname, String password) {
		WebElement id = driver1.findElement(By.id("name"));
		id.sendKeys(fullname);
		WebElement pass = driver1.findElement(By.id("password"));
		pass.sendKeys(password);
		WebElement login = driver1.findElement(By.id("login"));
		login.click();
	}

}
