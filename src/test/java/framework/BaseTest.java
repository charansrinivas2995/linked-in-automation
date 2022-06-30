package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	protected WebDriver driver;

	@BeforeGroups(groups = "TEST_TICKET")
	public void beforeGroups() {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("BeforeGroups");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("*************************************************");
		System.out.println("BeforeSuite");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");

		System.setProperty("webdriver.chrome.driver",
				"D:\\Testing\\Charanautomation\\New\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		//driver.get("http://www.facebook.com");

	}

	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("BeforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
		driver.quit();

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
		System.out.println("***************************************************************");

	}

	@AfterGroups(groups = "TEST_TICKET")
	public void afterGroups() {
		System.out.println("AfterGroups");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

	}

}
