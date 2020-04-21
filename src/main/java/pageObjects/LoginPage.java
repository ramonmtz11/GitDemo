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

	@FindBy(css = "input[name=email]")
	WebElement usernamebox;

	public WebElement Username() {
		return usernamebox;
	}
	
	@FindBy(css= "input[id=continue]")
	WebElement continuebtn;

	public WebElement ContinueButton() {
		return continuebtn;
	}
	
	@FindBy(css= "input[id=ap_password]")
	WebElement pwd;

	public WebElement Password() {
		return pwd;
	}
	
	@FindBy(css="span[id=auth-signin-button]")
	WebElement login;
	
	public WebElement LoginButton(){
		return login;
	}
	
	@FindBy(className= "a-list-item")
	WebElement verif;

	public WebElement VerificationText() {
		return verif;
	}

}
