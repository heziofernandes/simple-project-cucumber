package simpleproject.webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * 
 * @author Hezio D. Fernandes - QA Automation Engineer
 *
 */

public class ChromeWebDriver {

	private ChromeWebDriver() {

	}

	private static RemoteWebDriver driver;
	private static ChromeDriverService service;

	public static WebDriver createAndStartService() {
		if (driver == null) {
			String driverFileName = null;
			if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
				driverFileName = "chromedriverWindows.exe";
			} else {
				driverFileName = "chromedriverLinux";
			}

			ClassLoader classLoader = WebDriver.class.getClassLoader();
			File file = new File(classLoader.getResource(driverFileName).getFile());
			file.setExecutable(true);

			service = new ChromeDriverService.Builder().usingDriverExecutable(file).usingAnyFreePort().build();

			try {
				service.start();
			} catch (IOException e) {
				e.printStackTrace();
			}

			/**
			 * For Https hosts with self-signed certificates
			 */
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability("acceptSslCerts", true);

			driver = new RemoteWebDriver(service.getUrl(), capabilities);
		}
		return driver;
	}
}
// if (driver == null) {
// service = new ChromeDriverService.Builder().usingDriverExecutable(new
// File("/usr/bin/chromedriver"))
// .usingAnyFreePort().build();
// try {
// service.start();
// } catch (IOException e) {
// e.printStackTrace();
// }
// driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
// }
// return driver;
//
// }

// }
