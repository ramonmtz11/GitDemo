package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nav-link-accountList")
	WebElement getLogin;

	public WebElement LoginButton() {
		return getLogin;
	}

	@FindBy(id = "twotabsearchtextbox")
	WebElement search;

	public WebElement SearchBar() {
		return search;

	}

	@FindBy(id = "['search']/span/div/span/h1/div/div[1]/div/div")
	
	WebElement inflable;

	public WebElement Resultado() {
		return inflable;

	}

}