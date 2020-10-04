package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	
	
	
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
		
	@FindBy (id="courseSearchInput")
	WebElement inputField;
	
	@FindBy (className="cb-enable")
	WebElement popup;
	
	@FindBy(xpath="//div[starts-with(@class, 'footer-links hidden-xs')]//a[1]")
	WebElement firstUrl;
	
	@FindBy(css=".site-header.flex a[href]")
	List<WebElement> allHeaderLinks;

	
	
	

	
public WebElement getInputField() {
		
		return inputField; 
	}

public WebElement getPopup() {
	
	return popup; 
}

public WebElement getFirstUrl() {
	
	return firstUrl; 
}

public List<WebElement> getAllHeaderLinks() {
	
	return allHeaderLinks; 
}

}

	
	

	

