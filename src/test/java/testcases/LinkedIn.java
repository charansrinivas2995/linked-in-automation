package testcases;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LinkedIn {

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

		driver.findElement(By.xpath("//header/div[1]/nav[1]/ul[1]/li[2]/a[1]/div[1]/div[1]/li-icon[1]/*[1]")).click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/a[1]/div[1]/div[1]"))
				.click();

		driver.findElement(By.linkText("Search with filters")).click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/span[1]/button[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/ul[1]/li[2]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/ul[1]/li[3]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/button[2]/span[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/span[1]/button[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/button[2]/span[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[4]/div[1]/span[1]/button[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/ul[1]/li[1]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/ul[1]/li[2]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/ul[1]/li[3]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/button[2]/span[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/span[1]/button[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/button[2]/span[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[5]/div[1]/span[1]/button[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[5]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/ul[1]/li[1]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[5]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/ul[1]/li[2]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[5]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/ul[1]/li[4]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[5]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/button[2]/span[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/span[1]/button[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/button[2]/span[1]"))
				.click();

		driver.findElement(
				By.xpath("//body/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", driver
				.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[6]/fieldset[1]/h3[1]")));

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[6]/fieldset[1]/div[1]/ul[1]/li[1]/label[1]"))
				.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[6]/fieldset[1]/div[1]/ul[1]/li[2]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[6]/fieldset[1]/div[1]/ul[1]/li[5]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[7]/fieldset[1]/div[1]/ul[1]/li[1]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[7]/fieldset[1]/div[1]/ul[1]/li[3]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[7]/fieldset[1]/div[1]/ul[1]/li[3]/label[1]"))
				.click();

		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", driver
				.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[8]/fieldset[1]/h3[1]")));

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[8]/fieldset[1]/div[1]/ul[1]/li[2]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[8]/fieldset[1]/div[1]/ul[1]/li[5]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[9]/fieldset[1]/div[1]/ul[1]/li[1]/label[1]"))
				.click();

		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", driver
				.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[11]/fieldset[1]/h3[1]")));

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[11]/fieldset[1]/div[1]/ul[1]/li[1]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[11]/fieldset[1]/div[1]/ul[1]/li[4]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[11]/fieldset[1]/div[1]/ul[1]/li[5]/label[1]"))
				.click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/div[1]/button[2]/span[1]")).click();

		driver.findElement(By
				.xpath("/html[1]/body[1]/div[5]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();

		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", driver
				.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[11]/fieldset[1]/h3[1]")));

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/div[1]/button[1]/span[1]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/div[1]/button[2]/span[1]")).click();

		Thread.sleep(3000);

		driver.quit();

	}

}
