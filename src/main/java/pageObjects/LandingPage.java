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

	@FindBy(id = "login")
	WebElement getLogin;

	public WebElement LoginButton() {
		return getLogin;
	}

	@FindBy(name = "as_word")
	WebElement search;

	public WebElement SearchBar() {
		return search;

	}

	@FindBy(id = "nav-cart")
	
	WebElement inflable;

	public WebElement Resultado() {
		return inflable;

	}

}
