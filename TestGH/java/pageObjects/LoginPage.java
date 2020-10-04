package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="#EmailAddress")
	WebElement email;
	

	@FindBy(css="#Password")
	WebElement password;
	
	@FindBy(css="button[type='submit']")
	WebElement submit;
	
	@FindBy(css=".validation-summary-errors")
	WebElement errormsg;
	
	@FindBy(css=".cc-dismiss")
	WebElement popup;
	
	
	

	

	public WebElement getEmail() {

		return email;
	}
	
	public WebElement getPassword() {

		return password;
	}
	
	public WebElement getSubmit() {

		return submit;
	}
	
	public WebElement getErrorMsg() {

		return errormsg;
	}
	
	public WebElement getPopup() {

		return popup;
	}

	

}
