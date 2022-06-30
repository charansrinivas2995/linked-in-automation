package testcases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestFluentWait {
	
	public static final String USER_DIR = "user.dir";
	public static final String URL = "https://www.google.com/";

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
		
		driver.findElement(By.name("q")).sendKeys("seleniumhq.org");

		driver.findElement(By.name("q")).submit();

		System.out.println("Search result title : " + driver.getTitle());
		
	
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
		
		
		WebElement linkSelenumHQ = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				
				return driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/cite[1]"));
			}
			
		
		});
		

		System.out.println(linkSelenumHQ.getText());

		linkSelenumHQ.click();

		driver.findElement(By.xpath("//span[contains(text(),'Projects')]")).click();

		WebElement link = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'W3C Recommendation!')]")));

		boolean hasprojectDisplayed = driver.findElement(By.xpath("//a[contains(text(),'W3C Recommendation!')]"))
				.isDisplayed();

		System.out.println("hasprojectDisplayed :" + hasprojectDisplayed);

		driver.quit();

	}



}



