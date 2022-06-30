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
import org.openqa.selenium.support.ui.Select;

public class WebElementsDropDown {

	public static final String USER_DIR = "user.dir";
	public static final String URL = "https://www.orangehrm.com/contact-sales/";

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

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String browserTitle = driver.getTitle();

		System.out.println("The browser title  : " + browserTitle);

		driver.findElement(By.cssSelector("#Form_submitForm_FullName")).sendKeys("Charan P");

		driver.findElement(By.cssSelector("#Form_submitForm_CompanyName")).sendKeys("FinSana");

		driver.findElement(By.cssSelector("#Form_submitForm_JobTitle")).sendKeys("QA Developer");

		Select selectTotalEmployee = new Select(driver.findElement(By.name("NoOfEmployees")));

		selectTotalEmployee.selectByVisibleText("101 - 150");

		Thread.sleep(2000);

		selectTotalEmployee.selectByValue("26 - 50");

		Thread.sleep(2000);

		selectTotalEmployee.selectByIndex(1);

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#Form_submitForm_Contact")).sendKeys("+15147124377");

		driver.findElement(By.cssSelector("#Form_submitForm_Email")).sendKeys("test123@gmail.com");

		driver.findElement(By.cssSelector("#Form_submitForm_Comment")).sendKeys("Hello");

		driver.findElement(By.cssSelector("#Form_submitForm_Comment")).click();

		driver.findElement(By.cssSelector("#Form_submitForm_action_request")).click();

		Thread.sleep(2000);

		driver.quit();

	}

}
