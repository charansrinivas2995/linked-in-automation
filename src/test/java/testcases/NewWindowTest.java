package testcases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindowTest {

	public static final String USER_DIR = "user.dir";
	public static final String URL = "https://demoqa.com/browser-windows";

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {

		String projectPath = System.getProperty(USER_DIR);

		System.out.println("projectPath: " + projectPath);

		Properties prop = new Properties();

		Reader inStream = new FileReader(projectPath + "\\resources\\configuration\\configuration.properties");

		prop.load(inStream);

		String browserName = prop.getProperty("browser.name").toString();

		// browserName = "chrome";

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

		String tabTitle = driver.getTitle();

		System.out.println("The Tab Title : " + tabTitle);

		driver.findElement(By.id("tabButton")).click();

		String defaultTabId = driver.getWindowHandle();

		Set<String> tabIds = driver.getWindowHandles();

		for (String tabId : tabIds) {
			if (!tabId.equals(defaultTabId)) {
				driver.switchTo().window(tabId);
				break;

			}
		}
		String newTabTitle = driver.getTitle();

		System.out.println("new Tab Title : " + newTabTitle);

		driver.close();

		driver.switchTo().window(defaultTabId);

		String defaultTabTitle = driver.getTitle();

		System.out.println("default Tab Title : " + defaultTabTitle);

		driver.quit();

	}
}
