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

	@FindBy(linkText = "Ingresa")
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

	@FindBy(css = ".nav-menu-cp.nav-menu-cp-logged")

	WebElement zipcode;

	public WebElement ZipCode() {
		return zipcode;

	}
	
	@FindBy(css = ".nav-menu-link-cp")

	WebElement zipcode2;

	public WebElement ZipCode2() {
		return zipcode2;

	}

	@FindBy(name = "zipcode")

	WebElement zipcodebox;

	public WebElement ZipCodeBox() {
		return zipcodebox;

	}

	@FindBy(css = "button[type='submit']")

	WebElement usar;

	public WebElement UsarButton() {
		return usar;

	}

}
