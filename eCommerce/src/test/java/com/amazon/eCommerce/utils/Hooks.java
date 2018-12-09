package com.amazon.eCommerce.utils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.util.concurrent.TimeUnit;

public class Hooks extends WebConnector {

	@Before
	public void beforeScenario(Scenario scenario) {
		log.debug("Executing scenario: " + scenario.getName());
		scenarioName = scenario.getName();
		WebConnector.driver.manage().window().maximize();
		WebConnector.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void afterScenario(Scenario scenario) {
		if (!scenario.getStatus().equals("passed")) {
			embedScreenshot(scenario);
		}
		log.debug("Finishing scenario: " + scenario.getName());
	}

	/**
	 * Takes a screenshot of the browser in it's current state and adds it to
	 * the Scenario object
	 *
	 * @param scenario
	 *            The scenario object is required to embed the screenshot to
	 */
	private void embedScreenshot(Scenario scenario) {
		try {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

			scenario.embed(screenshot, "image/png");
		} catch (WebDriverException somePlatformsDontSupportScreenshots) {
			System.err.println(somePlatformsDontSupportScreenshots.getMessage());
		}
	}
}
