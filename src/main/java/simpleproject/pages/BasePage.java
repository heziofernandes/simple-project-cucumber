package simpleproject.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import simpleproject.framework.MessageConstants;
import simpleproject.webdriver.ChromeWebDriver;

/**
 * 
 * @author Hezio D. Fernandes - QA Automation Engineer
 *
 */

public class BasePage {

	private static WebDriver driver;

	public BasePage() {
		if (driver == null) {
			driver = ChromeWebDriver.createAndStartService();
			driver.manage().window().maximize();
			driver.get(MessageConstants.URL);
			Assert.assertEquals("Formulário Automação", driver.getTitle());
		}
	}

	public WebDriver getDriver() {
		return driver;
	}
	
}