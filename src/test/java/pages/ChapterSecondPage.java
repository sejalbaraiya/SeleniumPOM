package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChapterSecondPage {

	private WebDriver driver;
	
	@FindBy(xpath = "//input[@name='but2']")
	WebElement btnWithName;
	
	@FindBy(xpath = "//input[@id='random']")
	WebElement randombtn;
	
	@FindBy(linkText = "Index")
	WebElement index;
	
	
	public ChapterSecondPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Method-1.
		public ChapterSecondPage clickRandom() {
			randombtn.click();
			return PageFactory.initElements(driver, ChapterSecondPage.class);
		}

		// Method-2.
		public ChapterSecondPage clickbut2() {
			btnWithName.click();
			return PageFactory.initElements(driver, ChapterSecondPage.class);
		}

		// Method-3.
		public HomePage clickIndex() {
			index.click();
			return PageFactory.initElements(driver, HomePage.class);
		}
		
		//Method-4
		public String getData() {
			return index.getText();
		}
		
}
