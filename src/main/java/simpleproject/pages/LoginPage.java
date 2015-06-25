package simpleproject.pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import simpleproject.framework.MessageConstants;

/**
 * 
 * @author Hezio D. Fernandes - QA Automation Engineer
 *
 */

public class LoginPage{
private static WebDriver driver = new BasePage().getDriver(); 	
	
	
@FindBy(id="")	
private WebElement typeLogin; 	
	

@FindBy(id="")
private WebElement typePassaword;



public void logOnSystem(){
	driver.get(MessageConstants.URL);
	Assert.assertEquals("Formulário Automação", driver.getTitle());
}


public void setLoginPassaword(){
	typeLogin.sendKeys(MessageConstants.LOGIN);
	typePassaword.sendKeys(MessageConstants.PASSWORD);
}
}