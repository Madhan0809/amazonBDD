package com.amazon.eCommerce.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePage {

	@FindBy(css = "input[id='ap_email']")
	private WebElement emailTextField;

	@FindBy(css = "input[id='ap_password']")
	private WebElement passwordTextField;

	@FindBy(css = "input[id='signInSubmit']")
	private WebElement loginPageSignInButton;

	public void enterEmailId(String email) {
		enterText(emailTextField, email);
	}

	public void enterPassword(String password) {
		enterText(passwordTextField, password);
	}

	public void clickOnLoginPageSignInButton() {
		clickOnWebElement(loginPageSignInButton);
	}
}
