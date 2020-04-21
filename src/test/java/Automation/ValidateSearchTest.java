package Automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateSearchTest extends base {

	@BeforeTest
	public void Initialize() throws IOException{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test
	public void basePageNav() throws IOException, InterruptedException {

		
		LandingPage lp = new LandingPage(driver);
		lp.SearchBar().click();
		lp.SearchBar().sendKeys("Inflable");
		lp.SearchBar().submit();
//		
		
		
	}
	@AfterTest
	
	public void TearDown(){
		driver.close();
		driver=null;
	}

}
