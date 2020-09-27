package com.saucedemo.pages;

import com.saucedemo.utils.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test extends TestBase{

	WebElement webElement;
	
	@Given("I navigate to sauce demo web site")
	public void i_navigate_to_sauce_demo_web_site() {
		TestBase.initialisation();
	}

	@When("I enter user name and password")
	public void i_enter_user_name_and_password() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		webElement = driver.findElement(By.id("login-button"));
		webElement.click();
	}

	@Then("I sort the product from high to low")
	public void i_sort_the_product_from_high_to_low() {
		Select objSelect = new Select(driver.findElement(By.className("product_sort_container")));
		objSelect.selectByVisibleText("Price (high to low)");
	}
	
	@Then("I add the cheapest product to basket")
	public void i_add_the_cheapest_product_to_basket() {
		webElement = driver.findElement(By.cssSelector(".inventory_list .inventory_item:nth-of-type(6) .btn_inventory"));
		webElement.click();
	}

	@Then("I add the second costliest product to basket")
	public void i_add_the_second_costliest_product_to_basket() {
		webElement = driver.findElement(By.cssSelector(".inventory_list .inventory_item:nth-of-type(2) .btn_inventory"));
		webElement.click();
	}
	
	@Then("I open the basket")
	public void i_open_the_basket() {
		webElement = driver.findElement(By.cssSelector("svg[role='img']"));
		webElement.click();
	}
	
	@Then("I click on checkout button")
	public void i_click_on_checkout_button() {
		webElement = driver.findElement(By.cssSelector(".btn_action.checkout_button"));
		webElement.click();
	}
	
	@Then("I enter contact details")
	public void i_enter_contact_details() {
		driver.findElement(By.id("first-name")).sendKeys("standard");
		driver.findElement(By.id("last-name")).sendKeys("user");
		driver.findElement(By.id("postal-code")).sendKeys("111111");
	}
	
	@Then("I click on continue button")
	public void i_click_on_continue_button() {
		webElement = driver.findElement(By.cssSelector("[type='submit']"));
		webElement.click();
	}

	@Then("I click on finish button")
	public void i_click_on_finish_button() {
		webElement = driver.findElement(By.cssSelector(".cart_button"));
		webElement.click();
	}

	@Then("I close the browser")
	public void i_close_the_browser() throws InterruptedException {
		driver.quit();
	}
	
}
