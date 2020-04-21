package Automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateLoginTest extends base {

	public static Logger logger = LogManager.getLogger(ValidateLoginTest.class.getName());

	@BeforeTest
	public void Initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void basePageNav() throws IOException, InterruptedException {

		LandingPage lp = new LandingPage(driver);
		LoginPage login = new LoginPage(driver);

		lp.LoginButton().click();
		logger.trace("Entering Website");
		login.Username().sendKeys(prop.getProperty("username"));
		login.ContinueButton().click();
		login.Password().sendKeys(prop.getProperty("pwd"));
		login.LoginButton().click();
		Assert.assertEquals(login.VerificationText().getText(), prop.getProperty("message"));
		logger.info("Succesful Validation");
		logger.error("Error!!!");

	}

	@AfterTest

	public void TearDown() {
		driver.close();
		driver=null;
	}

}
