package testcases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static final String USER_DIR = "user.dir";

	public static final String URL = "https://www.google.com/";

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {

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

		Thread.sleep(2000);

		driver.manage().window().maximize();// maximize the window

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String browserTitle = driver.getTitle();

		System.out.println("The browser title  : " + browserTitle);

		driver.findElement(By.name("q")).isDisplayed();

		driver.findElement(By.name("q")).sendKeys("Selenium Dev");

		Thread.sleep(2000);

		driver.findElement(By.name("q")).submit();

		Thread.sleep(2000);

		String searchTitle = driver.getTitle();

		System.out.println("searchtitle : " + searchTitle);

		Thread.sleep(2000);

		driver.navigate().back();

		Thread.sleep(2000);

		driver.findElement(By.name("q")).sendKeys("Youtube");

		driver.findElement(By.name("q")).submit();

		String searchTitle1 = driver.getTitle();

		System.out.println("searchtitle : " + searchTitle1);

		Thread.sleep(2000);

		driver.navigate().back();

		Thread.sleep(2000);

		driver.navigate().forward();

		Thread.sleep(1000);

		driver.quit();

	}

}
