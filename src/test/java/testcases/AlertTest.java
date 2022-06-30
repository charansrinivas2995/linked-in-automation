package testcases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static final String USER_DIR = "user.dir";
	public static final String URL = "https://demoqa.com/alerts";

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {

		String projectPath = System.getProperty(USER_DIR);

		System.out.println("projectPath: " + projectPath);

		Properties prop = new Properties();

		Reader inStream = new FileReader(projectPath + "\\resources\\configuration\\configuration.properties");

		prop.load(inStream);

		String browserName = prop.getProperty("browser.name").toString();

		browserName = "chrome";

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

		String browserTitle = driver.getTitle();

		System.out.println("The browser title  : " + browserTitle);

		driver.findElement(By.id("alertButton")).click();

		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();

		Thread.sleep(1000);

		System.out.println("alertText : " + alertText);

		alert.accept();

		driver.findElement(By.id("alertButton")).click();

		Thread.sleep(1000);

		alert = driver.switchTo().alert();

		alert.dismiss();

		Thread.sleep(1000);

		driver.quit();

	}

}
