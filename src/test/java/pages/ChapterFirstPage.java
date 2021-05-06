package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChapterFirstPage {

	private WebDriver driver;

	@FindBy(id="secondajax")
	WebElement secondajaxload;

	@FindBy(id="verifybutton")
	WebElement verifyButton;

	@FindBy(xpath="//select[@id='selecttype']")
	WebElement dropdown;

	public ChapterFirstPage(WebDriver driver) {
		this.driver= driver;
	}

	//Method -1 
	public ChapterFirstPage clickSecondAjaxloadButton() {

		secondajaxload.click();
		return PageFactory.initElements(driver, ChapterFirstPage.class);
	}

	//Method -2 
	public ChapterFirstPage verifyButton() {

		verifyButton.click();
		return PageFactory.initElements(driver, ChapterFirstPage.class);
	}
	
	//Method -3 
	public ChapterFirstPage selectDropDown(String value) {

		new Select(dropdown).selectByVisibleText(value);
		return PageFactory.initElements(driver, ChapterFirstPage.class);
	}
	
	//Method- 4
	public ChapterFirstPage clickSecondAjaxDataButton(String data) {

		System.out.println(data);
		return PageFactory.initElements(driver, ChapterFirstPage.class);
	}
	
	
	
}
