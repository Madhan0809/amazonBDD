package com.amazon.eCommerce.bdd.stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.amazon.eCommerce.pageObjects.HomePagePO;
import com.amazon.eCommerce.pageObjects.LoginPO;
import com.amazon.eCommerce.utils.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	HomePagePO homePage = PageFactory.initElements(WebConnector.driver, HomePagePO.class);
	LoginPO loginPage = PageFactory.initElements(WebConnector.driver, LoginPO.class);

	// Given I go to "www.amazon.co.uk"
	@Given("^I go to Amazon Home page$")
	public void goToAmazonHomePage() {
		homePage.navigateToHomePage();
	}

	// When I click on Sign In button in Home Page
	@When("^I click on Sign In button in Home Page$")
	public void signInButtonInHomePage() {
		homePage.clickOnHomePageSignInButton();
	}	
	
	// And I enter my email as "madhan@gmail.com"
	@And("^I enter my email as \"([^\"]*)\"$")
	public void enterEmailId(String email) {
		loginPage.enterEmailId(email);
	}
	
	// And I enter my password as "Password123"
	@And("^I enter my password as \"([^\"]*)\"$")
	public void enterPassword(String password) {
		loginPage.enterPassword(password);

	}
	// And I click on Sign In button in Login Page
	@And("^I click on Sign In button in Login Page$")
	public void signInButtonInLoginPage() {
		loginPage.clickOnLoginPageSignInButton();
	}
	
	// Then I should see "Hello, Madhan" text in home page
	@Then("^I should see \"([^\"]*)\" text in home page$") 
	public void verifyAccountNameInHomePage(String expectedName) {
		homePage.verifyAccountName(expectedName);
	}
	
	@Then("^I click on xxx button$")
	public void i_click_on_xxx_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}
}
