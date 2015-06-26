package simpleproject.stepsdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import simpleproject.pages.BasePage;
import simpleproject.pages.RegisterFields;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;

/**
 * 
 * @author Hezio D. Fernandes - QA Automation Engineer
 * 
 *Class steps implemented to the feature writed in English
 *
 */

public class RegisterFieldsSteps {
	private RegisterFields registerFields;
	private WebDriver driver;

	public RegisterFieldsSteps() {
		driver = new BasePage().getDriver();
		registerFields = PageFactory.initElements(driver, RegisterFields.class);
	}

	@Dado("^the administrator is logged in$")
	public void the_administrator_is_logged_in() throws Throwable {
		registerFields.assertlogOnSystem();
	}

	@Dado("^insert a name$")
	public void insert_a_name() throws Throwable {
		registerFields.typeName();
	}

	@Dado("^insert a login$")
	public void insert_a_login() throws Throwable {
		registerFields.typeLogin();
	}

	@Dado("^insert a password$")
	public void insert_a_password() throws Throwable {
		registerFields.typePassword();
	}

	@Dado("^insert a email$")
	public void insert_a_email() throws Throwable {
		registerFields.typeEmail();
	}

	@Dado("^insert a main adress$")
	public void insert_a_main_adress() throws Throwable {
		registerFields.typeAddress();
	}

	@Dado("^insert a reference address$")
	public void insert_a_reference_address() throws Throwable {
		registerFields.typeReference();
	}

	@Dado("^select an academic background$")
	public void select_an_academic_background() throws Throwable {
		registerFields.selectEducation();
	}

	@Dado("^select a course of interest$")
	public void select_a_course_of_interest() throws Throwable {
		registerFields.selectsCourse();
	}

	@Dado("^save the form$")
	public void save_the_form(){
		registerFields.clickSave();
	}

	@Dado("^the system informs the administrator of successfully register.$")
	public void the_system_informs_the_administrator_of_successfully_register(){
		registerFields.assertSave();
	}
	
	
}
