package testcases;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import framework.BaseTest;

public class AssertGoogleTitle extends BaseTest {

	public static final String USER_DIR = "user.dir";
	public static final String URL = "https://www.google.com/";

	@Test
	public void openGoogle() throws IOException {
		String projectPath = System.getProperty(USER_DIR);

		System.out.println("projectPath: " + projectPath);

		// String browserName ="edge";

		Properties prop = new Properties();

		Reader inStream = new FileReader(projectPath + "\\resources\\configuration\\configuration.properties");

		prop.load(inStream);

		String browserName = prop.getProperty("browser.name").toString();

		System.out.println("browserName: " + browserName);

		WebDriver driver;

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "\\resources\\drivers\\chromedriver.exe");

			driver = new ChromeDriver();// launch browser

		} else if (browserName.contentEquals("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\resources\\drivers\\geckodriver.exe");

			driver = new FirefoxDriver();// launch browser

		} else {

			System.setProperty("webdriver.edge.driver", projectPath + "\\resources\\drivers\\msedgedriver.exe");

			driver = new EdgeDriver();// launch browser

		}
		driver.get(URL);// navigate to url

		driver.manage().window().maximize();// maximize the window

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// String browserTitle = driver.getTitle();

		String actualGoogleTitle = driver.getTitle();

		String expectedGoogleTitile = "Google";

		// Assert.assertEquals(actualGoogleTitle, expectedGoogleTitile , "Validate
		// Google Website title");

		if (actualGoogleTitle.contentEquals(expectedGoogleTitile)) {
			Assert.assertTrue(true);
		} else {
			Reporter.log("google title validation failed : Expected Title =" + expectedGoogleTitile
					+ " \nActual Titile = " + actualGoogleTitle);
			Assert.assertTrue(false);
		}
		System.out.println("Test completed ");

		driver.quit();
	}

}