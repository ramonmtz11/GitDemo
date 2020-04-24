package resources;

import java.io.IOException;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ProductsPage;
import resources.base;

@RunWith(Cucumber.class)
public class stepDefinition extends base {

	@Given("^User is on MercadoLibre landing page")
	public void user_is_on_amazon_page() throws IOException, Throwable {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		System.out.println("Mercado Libre page open");
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application() throws Throwable {
		LandingPage lp = new LandingPage(driver);
		LoginPage login = new LoginPage(driver);

		lp.LoginButton().click();
		login.Username().sendKeys(prop.getProperty("username"));
		login.ContinueButton().click();
		login.Password().sendKeys(prop.getProperty("pwd"));
		login.LoginButton().click();
		System.out.println("Credentials entered correctly");
	}

	@Then("^Verification Message is displayed$")
	public void verification_message() throws Throwable {
		LoginPage login = new LoginPage(driver);
		Assert.assertEquals(login.VerificationText().getText(), prop.getProperty("message"));
		System.out.println("Message Validated Succesfully!");
		driver.close();
		driver = null;
		
	}
	
	@When("^user sets a zipcode$")
	public void user_enter_zipcode() throws InterruptedException{
		LandingPage lp = new LandingPage(driver);
		
		lp.ZipCode().click();
		Thread.sleep(3000);
		//driver.switchTo().frame(0);
		lp.ZipCodeBox().sendKeys("45134");
		Thread.sleep(1000);
		lp.UsarButton().click();
		
	}
	@Then("^zipcode is displayed$")
	public void zipcode_displayed() throws InterruptedException{
		LandingPage lp = new LandingPage(driver);
		Thread.sleep(1000);
		Assert.assertEquals(lp.ZipCode2().getText(), prop.getProperty("zipcodemessage"));
		System.out.println(lp.ZipCode().getText());
		driver.close();
		driver = null;
		}
	
	@When("^User performs a product search$")
	public void User_performs_Search(){
		LandingPage lp = new LandingPage(driver);
		lp.SearchBar().click();
		lp.SearchBar().sendKeys("galaxy s20");
		lp.SearchBar().submit();
		
		
	}
	@Then("^User selects first item$")
	public void user_selects_first_item(){
		ProductsPage pp = new ProductsPage (driver);
		pp.ProductId().click();
		Assert.assertEquals(pp.ItemTitle().getText(), prop.getProperty("itemtitle"));
		driver.close();
		driver = null;
		
	}
	
}
