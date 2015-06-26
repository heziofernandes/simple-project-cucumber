package simpleproject.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

import cucumber.api.java.After;
import simpleproject.framework.MessageConstants;

public class RegisterFields {
	private WebDriver driver = new BasePage().getDriver();
	private WebDriverWait Wait = new WebDriverWait(driver, 10);

	@FindBy(id = "login")
	private WebElement typeLogin;

	@FindBy(id = "password")
	private WebElement typePassaword;

	@FindBy(id = "name")
	private WebElement typeName;

	@FindBy(id = "email")
	private WebElement typeEMail;

	@FindBy(id = "address")
	private WebElement typeAddress;

	@FindBy(id = "reference-address")
	private WebElement typeReference;

	@FindBy(id = "opt-pica")
	private WebElement radioButton;

	@FindBy(id = "btn-save")
	private WebElement clickSave;

	public void type(WebElement webElement, String data) {
		webElement.clear();
		webElement.sendKeys(data);
	}

	public void typeLogin() {
		type(typeLogin, MessageConstants.LOGIN);
	}

	public void typePassword() {
		type(typePassaword, MessageConstants.PASSWORD);
	}

	public void typeName() {
		type(typeName, MessageConstants.NOME);
	}

	public void typeEmail() {
		type(typeEMail, MessageConstants.EMAIL);
	}

	public void typeAddress() {
		type(typeAddress, MessageConstants.ADDRESS);
	}

	public void typeReference() {
		type(typeReference, MessageConstants.REFERENCE);
	}

	public void selectEducation() {
		radioButton.click();
	}

	public void selectsCourse() {
		Select course = new Select(
				driver.findElement(By.className("qa-select")));
		course.selectByVisibleText("Java Script");
	}

	public void clickSave() {
		clickSave.click();

	}

	public void assertSave() {
		Wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
		Assert.assertEquals("Cadastro Realizado com Sucesso!", driver
				.findElement(By.id("message")).getText());
	}

	public void assertlogOnSystem() {
		Assert.assertEquals("Formulário Automação", driver.getTitle());
	}

}