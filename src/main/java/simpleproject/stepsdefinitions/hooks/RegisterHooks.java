package simpleproject.stepsdefinitions.hooks;

import org.openqa.selenium.WebDriver;

import simpleproject.pages.BasePage;
import cucumber.api.java.After;

public class RegisterHooks {
	private WebDriver driver = new BasePage().getDriver();

	
	@After(value = "@registration")
	public void closeApplication() {
		driver.close();
	}
}
