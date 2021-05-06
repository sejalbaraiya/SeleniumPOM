package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.HomePage;

public class MyTest extends TestBase {

	//Test -0
	@Test
	public void testPageObject() throws Exception {

		homePage= PageFactory.initElements(driver, HomePage.class);

		driver.get(baseURL);
		chapterSecondPage = homePage.clickChapterSecond();
		chapterSecondPage.clickbut2();
		chapterSecondPage.clickRandom();
		String data = chapterSecondPage.getData();
		homePage = chapterSecondPage.clickIndex();

		chapterFirstPage = homePage.clickChapterFirst();
		chapterFirstPage.clickSecondAjaxloadButton();
		chapterFirstPage.clickSecondAjaxDataButton(data);
		chapterFirstPage.selectDropDown("Selenium Core");
		chapterFirstPage.verifyButton();

	}

}
