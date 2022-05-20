package com.project_stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.project_pages.Home_page;
import com.project_pages.Login_page;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {
	WebDriver driver;
	Login_page page1;
	Home_page page2;
	String expected = "TestProject";

	@Before
	public void browser() {
		System.out.println("Broswer will open soon");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@After
	public void close() throws InterruptedException {
		System.out.println("Broswer will close soon");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Given(value="User is on correct URL")
	public void user_is_on_correct_url() {
		driver.get("https://example.testproject.io/web/");
	}
	
	@Then(value = "^Enter (.*) and (.*)$")
	public void enter_fullname_and_password(String fullname, String password) {
		page1 = new Login_page(driver);
		page1.id.sendKeys(fullname);
		page1.pass.sendKeys(password);
	}

	@And(value = "click login button")
	public void click_login_button() {
		page1.login();
	}

	@Then(value = "check user is move to homepage")
	public void check_user_is_move_to_homepage() {
		page2 = new Home_page(driver);
		boolean displayed = page2.logout.isDisplayed();
		Assert.assertTrue(displayed == true);
	}
	
	@Then(value = "check invalid message was shown")
	public void check_invalid_message_was_shown() {
		boolean displayed_invalid = page1.invalid.isDisplayed();
		Assert.assertTrue(displayed_invalid);
	}
}
