package simpleproject.framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty7.util.log.Logger;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.thoughtworks.selenium.Selenium;

/**
 * 
 * @author Hezio D. Fernandes - QA Automation Engineer
 *
 */

public class WebDriverUtil {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public Selenium selenium;

	public Logger logger;

	public WebDriverUtil(WebDriver driver) {
		wait = new WebDriverWait(driver, 10);
		this.driver = driver;
	}

	/**
	 * Clica no primeiro elemento encontrado na página que tenha o name
	 * fornecido e que esteja visível. Este método deve ser utilizado nos casos
	 * em que mais de um elemento com o mesmo name está presente na página mas
	 * ao menos um deles está invisível, pois nestes casos o método
	 * {@link Selenium#click(String)} pode falhar.
	 */
	public void clickVisibleElement(String name) {
		boolean clicked = false;
		List<WebElement> elements = driver.findElements(By.name(name));
		for (WebElement element : elements) {
			if (element.isDisplayed()) {
				element.click();
				clicked = true;
				break;
			}
		}
		if (!clicked) {
			selenium.click(name);
		}
	}

	public static void clicaElementoPorID(String id) {
		WebDriverUtil.aguardaElementoVisivelPorID(id);
		driver.findElement(By.id(id)).click();
	}

	public static void clicaElementoPorClassName(String className) {
		WebDriverUtil.aguardaElementoVisivelPorClassName(className);
		driver.findElement(By.className(className)).click();
	}

	public static void clicaElementoPorCSS(String css) {
		WebDriverUtil.aguardaElementoVisivelPorCss(css);
		driver.findElement(By.cssSelector(css)).click();
	}

	/**
	 * Insere texto no primeiro elemento encontrado na página que tenha o name
	 * fornecido e que esteja visível. Este método deve ser utilizado nos casos
	 * em que mais de um elemento com o mesmo name está presente na página mas
	 * ao menos um deles está invisível.
	 * 
	 * @param name
	 *            Nome do componente
	 * @param value
	 *            Valor que será inserido no campo
	 */
	public void typeVisibleElement(String name, String value) {
		boolean typeIn = false;
		List<WebElement> elements = driver.findElements(By.name(name));
		for (WebElement element : elements) {
			if (element.isDisplayed()) {
				element.clear();
				element.sendKeys(value);
				typeIn = true;
				break;
			}
		}
		if (!typeIn) {
			selenium.type(name, value);
		}
	}

	/**
	 * Clica no primeiro elemento encontrado na página que tenha o name
	 * fornecido e que esteja visível. Este método deve ser utilizado nos casos
	 * em que mais de um elemento com o mesmo name está presente na página mas
	 * ao menos um deles está invisível.
	 */
	public void keyDownVisibleElement(String name) {
		List<WebElement> elements = driver.findElements(By.name(name));
		for (WebElement element : elements) {
			if (!element.isDisplayed()) {
				continue;
			}

			element.clear();
			element.sendKeys(Keys.ARROW_DOWN);
			break;
		}
	}

	/**
	 * Método que da um duplo click em uma variavel do tipo Element
	 * 
	 * @param elemento
	 *            atributo a ser manipulada
	 */
	public static void doubleClickElement(WebElement elemento) throws Exception {
		Actions action = new Actions(driver);
		Actions doubleClick = action.doubleClick(elemento);
		doubleClick.perform();
		Thread.sleep(1000L);
	}

	/**
	 * Insere texto no primeiro elemento encontrado na página que tenha o Css
	 * fornecido e que esteja visível. Este método deve ser utilizado nos casos
	 * em que mais de um elemento com o mesmo name está presente na página mas
	 * ao menos um deles está invisível.
	 * 
	 * @param selenium
	 * @param css
	 *            do Componente
	 * @param value
	 *            Valor que será inserido no campo
	 */
	public void typeVisibleElementCss(Selenium selenium, String css,
			String value) {
		typeVisibleElementCss(selenium, css, value, 1);
	}

	public void typeVisibleElementCss(Selenium selenium, String css,
			String value, int elementPosition) {
		boolean typeIn = false;
		List<WebElement> elements = driver.findElements(By.cssSelector(css));
		int cont = 0;
		for (WebElement element : elements) {
			if (element.isDisplayed()) {
				cont++;
				if (cont == elementPosition) {
					element.clear();
					element.sendKeys(value);
					typeIn = true;
					break;
				}
			}
		}
		if (!typeIn) {
			selenium.type(css, value);
		}
	}

	public static void clickElementFindCSSAndText(String css, String nomeDoTexto) {
		List<WebElement> buttons = driver.findElements(By.cssSelector(css));
		for (WebElement button : buttons) {
			String text = button.getText();
			if (nomeDoTexto.equals(text)) {
				button.click();
				return;
			}
		}
	}

	public static WebElement findElementCSSAndText(String css,
			String nomeDoTexto) throws Throwable {
		List<WebElement> elements = driver.findElements(By.cssSelector(css));
		for (WebElement element : elements) {
			String text = element.getText();
			if (nomeDoTexto.equals(text)) {
				return element;
			}
		}
		return null;
	}

	/**
	 * Método que valida a xistencia de um elemento na tela
	 * 
	 * @param driver
	 *            instacia do webdriver
	 * @param css
	 *            elemento existente .class
	 * @param nomeDoTexto
	 *            nome do label exibido na interface
	 * @return retorna true se o elemento foi encontrado
	 * @throws Exception
	 */

	public static boolean validFindElementCSSAndText(String css,
			String nomeDoTexto) throws Exception {
		List<WebElement> elements = driver.findElements(By.cssSelector(css));
		for (WebElement element : elements) {
			String text = element.getText();
			if (nomeDoTexto.equalsIgnoreCase(text)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Método que verifica elemento existente na interface
	 * 
	 * @param Css
	 *            atributo passado por parametro que irá ser verificado
	 * @return retorna true se o elemento for encontrado.
	 * @throws Exception
	 */
	public static boolean validFindElementCSS(String css) throws Exception {
		boolean elementCss = driver.findElement(By.cssSelector(css)) != null;
		if (elementCss) {
			return true;
		}
		return false;
	}

	/**
	 * Método que verifica elemento existente na interface
	 * 
	 * @param Id
	 *            atributo passado por parametro que irá ser verificado
	 * @return retorna true se o elemento for encontrado.
	 * @throws Exception
	 */
	public static boolean validFindElementID(String Id) throws Exception {
		boolean elementId = driver.findElements(By.id(Id)) != null;
		if (elementId) {
			return true;
		}
		return false;
	}

	public void doubleClickElementFindCSSAndText(String css, String nomeDoTexto)
			throws Throwable {
		List<WebElement> buttons = driver.findElements(By.cssSelector(css));
		for (WebElement button : buttons) {
			String text = button.getText();
			if (nomeDoTexto.equals(text)) {
				doubleClickElement(button);
				return;
			}
		}
	}

	public static void pressionaTeclaEnter() {
		new Actions(driver).sendKeys(Keys.ENTER).build().perform();
	}

	public static void pressionaTeclaTab() {
		new Actions(driver).sendKeys(Keys.TAB).build().perform();
	}

	public static String atribuiNome(String nomeCarga) {
		double randNumber = Math.random();
		int random = (int) +(randNumber * 100);

		nomeCarga = nomeCarga + random;
		WebElement arquivo = driver.findElement(By.name("name"));
		arquivo.sendKeys(nomeCarga);
		boolean nomeVazio = driver.findElement(By
				.className("qa-erro-empty-name")) == null;
		if (nomeVazio) {
			arquivo.sendKeys(nomeCarga);
		}
		return nomeCarga;
	}

	

	public static void aguardaElementoVisivelPorClassName(String className) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.className(className)));

		} catch (Exception e) {
			System.out
					.println("ElementNotFoundException, Forçando a busca do elemento className:"
							+ className);
		}
	}

	public static void aguardaElementoVisivelPorID(String Id) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Id)));

		} catch (Exception e) {
			System.out
					.println("ElementNotFoundException, Forçando a busca do elemento id:"
							+ Id);
		}
	}

	public static void aguardaElementoVisivelPorCss(String css) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.cssSelector(css)));

		} catch (Exception e) {
			System.out
					.println("ElementNotFoundException, Forçando a busca do elemento Css: "
							+ css);
		}
	}

	public static void selecionaCSV(String caminhoCSV) throws Exception {
		WebElement file = driver.findElement(By.name("filename"));
		file.sendKeys(caminhoCSV);
	}

	public static void aguardaArquivoNoinputFile() throws Exception {
		boolean arquivoSelecionado = false;
		while (!arquivoSelecionado) {
			aguardaElementoVisivelPorCss(".uploadFile.ng-dirty.ng-valid.ng-valid-required");
			arquivoSelecionado = WebDriverUtil
					.validFindElementCSS(".uploadFile.ng-dirty.ng-valid.ng-valid-required");
		}
		aguardaElementoVisivelPorID("btnSave");
	}

	public static void typeElementoPorID(String id, String text) {
		WebDriverUtil.aguardaElementoVisivelPorID(id);
		driver.findElement(By.id(id)).sendKeys(text);
	}

}
