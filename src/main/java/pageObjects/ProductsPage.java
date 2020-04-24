package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	public WebDriver driver;

	public ProductsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='MLM760688904']/div[2]/div/h2/a/span")
	WebElement getproductid;

	public WebElement ProductId() {
		return getproductid;
	}
	
	@FindBy(css = ".item-title__primary ")
	WebElement gettitleid;

	public WebElement ItemTitle() {
		return gettitleid;
	}
}
