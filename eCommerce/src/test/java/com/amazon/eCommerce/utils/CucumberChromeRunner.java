package com.amazon.eCommerce.utils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.amazon.eCommerce.utils.WebConnector;
import com.amazon.eCommerce.utils.WebConnector.Browsers;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/amazon/eCommerce/bdd" },
                tags = {"@m"}, 
                //dryRun=true,
                monochrome = true, 
                strict = true, 
                plugin = { "pretty","html:target/cucumber" },
                glue = {"com.amazon.eCommerce.bdd.stepDefinitions", "com.amazon.eCommerce.utils" })

public class CucumberChromeRunner {
	@BeforeClass
	public static void setUp() {
		WebConnector.getInstance().initialiseDriver(Browsers.valueOf("Chrome"));
	}

	@AfterClass
	public static void tearDown() {
		if(WebConnector.driver !=null) {
			WebConnector.driver.quit();
			WebConnector.driver=null;
		}
	}
}
