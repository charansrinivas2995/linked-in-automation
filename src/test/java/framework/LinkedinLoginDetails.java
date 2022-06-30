package framework;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class LinkedinLoginDetails {

	protected WebDriver driver;

	@BeforeTest
	public void BeforeTest() throws IOException {

		final String User_DIR = "user.dir";

		final String URL = "https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin";

		String projectPath = System.getProperty(User_DIR);

		System.out.println("projectPath : " + projectPath);

		Properties prop = new Properties();

		Reader inStream = new FileReader(projectPath + "\\resources\\configuration\\configuration.properties");

		prop.load(inStream);

		String browserName = prop.getProperty("browser.name").toString();

		System.out.println("Browser Name : " + browserName);

		// WebDriver driver;

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", projectPath + "\\resources\\drivers\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {

			System.setProperty("webDriver.gecko.driver", projectPath + "\\resources\\drivers\\geckodriver.exe");

			driver = new FirefoxDriver();

		} else {

			System.setProperty("webDriver.edge.driver", projectPath + "\\resources\\drivers\\edgedriver.exe");

			driver = new EdgeDriver();
		}

		driver.get(URL);

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("95charan.srinivas@gmail.com");

		driver.findElement(By.id("password")).sendKeys("Charan@123");

		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();

	}

	@AfterTest
	public void afterTest() {

		driver.quit();

	}

}
