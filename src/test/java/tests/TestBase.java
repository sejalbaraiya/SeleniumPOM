package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ChapterFirstPage;
import pages.ChapterSecondPage;
import pages.HomePage;

public class TestBase {

	
	protected WebDriver driver;
	protected String baseURL;
	protected HomePage homePage;
	protected ChapterFirstPage chapterFirstPage;
	protected ChapterSecondPage chapterSecondPage;
	
	//Method-1
	@BeforeSuite
	public void setup() {
		WebDriverManager.firefoxdriver().setup();
		baseURL= "http://book.theautomatedtester.co.uk/";
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
}
