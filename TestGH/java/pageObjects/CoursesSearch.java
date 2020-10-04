package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursesSearch {

	WebDriver driver;

	public CoursesSearch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='5084']//following-sibling::label")
	WebElement classroom;

	@FindBy(css = ".block--pagination li")
	List<WebElement> pages;

	public WebElement getClassroom() {

		return classroom;
	}

	public List<WebElement> getPages() {

		return pages;
	}

}
