package testcases;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LinkedInSignin {

	public static final String User_DIR = "user.dir";

	public static final String URL = "https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin";

	// public static void main(String[] args) throws IOException,
	// InterruptedException {
	@Test
	public void linkedInSignInTest() throws IOException, InterruptedException {

		String projectPath = System.getProperty(User_DIR);

		System.out.println("projectPath : " + projectPath);

		Properties prop = new Properties();

		Reader inStream = new FileReader(projectPath + "\\resources\\configuration\\configuration.properties");

		prop.load(inStream);

		String browserName = prop.getProperty("browser.name").toString();

		System.out.println("Browser Name : " + browserName);

		WebDriver driver;

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

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String browserTitle = driver.getTitle();

		System.out.println("The browser title : " + browserTitle);

		driver.findElement(By.id("username")).sendKeys("95charan.srinivas@gmail.com");

		driver.findElement(By.id("password")).sendKeys("Charan@123");

		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();

	}
}
