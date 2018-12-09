package com.amazon.eCommerce.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePO extends BasePage{
	
	@FindBy(css = "div[id='nav-tools'] a[id='nav-link-yourAccount'] span:nth-child(2)")
	private WebElement homePageSignInButton;
	
	@FindBy(css = "#nav-link-yourAccount span.nav-line-1")
	private WebElement accountName;
	
	public void clickOnHomePageSignInButton() {
		clickOnWebElement(homePageSignInButton);
	}
	
	//assertTextOnWebElement(accountName, expectedName);
	
	public void verifyAccountName(String expectedName) {
		assertTextOnWebElement(accountName, expectedName);
	}
}
