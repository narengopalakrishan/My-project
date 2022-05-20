package com.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	String expected = "Facebook – log in or sign up";

	@Given(value = "user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When(value = "^enter (.*) and (.*)$")
	public void enter_userid_and_password(String username,String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@And(value = "click login button")
	public void click_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then(value = "user is logged-in")
	public void user_is_logged_into_homepage() {
		String title = driver.getTitle();
		Assert.assertEquals(expected, title);
	}

	@And(value = "close chrome")
	public void close_chrome() {
		driver.quit();
	}

//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		System.out.println("load url page");
//	}
//
//	@When("enter userid and password")
//	public void enter_userid_and_password() {
//		System.out.println("userid & password");
//	}
//
//	@When("click login button")
//	public void click_login_button() {
//		System.out.println("click submit");
//	}
//
//	@Then("user is logged into homepage")
//	public void user_is_logged_into_homepage() {
//		System.out.println("homepage is loaded..?");
//	}
}
