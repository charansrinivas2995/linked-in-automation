package testcases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static final String USER_DIR = "user.dir";
	public static final String URL = "https://demoqa.com/automation-practice-form";

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

		driver.manage().window().maximize();// maximize the window

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String browserTitle = driver.getTitle();

		System.out.println("The browser title  : " + browserTitle);

		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Charan");

		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Padavala");

		driver.findElement(By.cssSelector("#userEmail")).sendKeys("test123@gmail.com");

		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

		driver.findElement(By.cssSelector("#userNumber")).sendKeys("+919123456789");

		driver.findElement(By.cssSelector("#dateOfBirthInput")).sendKeys(Keys.CONTROL, "A");

		driver.findElement(By.cssSelector("#dateOfBirthInput")).sendKeys("29 Apr 1995");

		driver.findElement(By.cssSelector("#userNumber")).click();

		driver.findElement(By.xpath("//*[@id='subjectsInput']")).sendKeys("QA Developer");

		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();

		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\chara_ca053xs\\Desktop\\pic.png");

		driver.findElement(By.cssSelector("#currentAddress")).sendKeys("1650 boulevard de Maisonneuve oust");

		driver.findElement(By.xpath(("//div[contains(text(),'NCR')]"))).sendKeys("NCR");

		driver.findElement(By.xpath("//div[contains(text(),'Delhi')]")).sendKeys("Agra");

		driver.findElement(By.cssSelector("#submit")).click();

		driver.quit();

	}

}
