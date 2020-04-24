package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[id=user_id]")
	WebElement usernamebox;

	public WebElement Username() {
		return usernamebox;
	}

	@FindBy(css = "button[type=submit]")
	WebElement continuebtn;

	public WebElement ContinueButton() {
		return continuebtn;
	}

	@FindBy(css = "input[id=password]")
	WebElement pwd;

	public WebElement Password() {
		return pwd;
	}

	@FindBy(css = "button[id=action-complete]")
	WebElement login;

	public WebElement LoginButton() {
		return login;
	}

	@FindBy(className = "method-selector__title")
	WebElement verif;

	public WebElement VerificationText() {
		return verif;
	}

}
