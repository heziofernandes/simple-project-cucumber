package simpleproject.webdriver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 
 * @author Hezio D. Fernandes - QA Automation Engineer
 *
 */

public class FireFoxWebDriver {

	private FireFoxWebDriver() {

	}

	public static FireFoxWebDriver getIntance() {
		if (fireFoxWebDriver == null) {
			fireFoxWebDriver = new FireFoxWebDriver();
		}
		return fireFoxWebDriver;
	}

	private static FireFoxWebDriver fireFoxWebDriver;
	private WebDriver driver;

	public synchronized WebDriver createWebDriver() {
		File pathToFirefoxBinary = new File(
				"/usr/bin/firefox");
		FirefoxBinary firefoxbin = new FirefoxBinary(pathToFirefoxBinary);
		if (driver == null) {
			driver = new FirefoxDriver(firefoxbin, null);
		}
		return driver;
	}
}
