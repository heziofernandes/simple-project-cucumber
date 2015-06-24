package simpleproject.cucumbersteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import simpleproject.pages.BasePage;
import simpleproject.pages.LoginPage;
import simpleproject.pages.RegisterFields;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

/**
 * 
 * @author Hezio D. Fernandes - QA Automation Engineer
 *
 */

public class RegisterFieldsSteps {
	private RegisterFields registerFields;
	private WebDriver driver;

	public RegisterFieldsSteps() {
		driver = new BasePage().getDriver();
		registerFields = PageFactory.initElements(driver, RegisterFields.class);
	}

	@Dado("^que o usuário esta logado$")
	public void que_o_usuário_esta_logado() throws Throwable {
	}

	@Quando("^informar o nome$")
	public void informar_o_nome() throws Throwable {
		registerFields.typeName();
	}

	@Quando("^informar um login$")
	public void informar_um_login() throws Throwable {
		registerFields.typeLogin();
	}

	@Quando("^informar uma senha$")
	public void informar_uma_senha() throws Throwable {
		registerFields.typePassword();
	}

	@Quando("^informar um email$")
	public void informar_um_email() throws Throwable {
		registerFields.typeEmail();
	}

	@Quando("^informar o endereço$")
	public void informar_o_endereço() throws Throwable {
		registerFields.typeAddress();
	}

	@Quando("^informar uma referência para o endereço$")
	public void informar_uma_referência_para_o_endereço() throws Throwable {
		registerFields.typeReference();
	}

	@Quando("^Selecionar uma formação acadêmica$")
	public void Selecionar_uma_formação_acadêmica() throws Throwable {
		registerFields.selectEducation();

	}

	@Quando("^Selecionar uma curso de interesse$")
	public void Selecionar_uma_curso_de_interesse() throws Throwable {
		registerFields.selectsCourse();
	}

	@Quando("^Salvar o formulário$")
	public void Salvar_o_formulário() throws Throwable {
		registerFields.clickSave();

	}

	@Então("^o sistema informa para o usuário, cadastro com sucesso$")
	public void o_sistema_informa_para_o_usuário_cadastro_com_sucesso()
			throws Throwable {
	}
}
