package simpleproject.stepsdefinitions.hokks;

import org.openqa.selenium.WebDriver;

import simpleproject.pages.BasePage;
import cucumber.api.java.After;

public class RegisterFieldsHooks {
	private WebDriver driver = new BasePage().getDriver();

	
	@After(value = "@registration,@cadastro")
	public void closeApplication() {
		driver.close();
	}
}
