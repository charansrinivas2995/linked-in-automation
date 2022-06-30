package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello world from First Test");

		System.setProperty("webdriver.chrome.driver",
				"D:\\Testing\\Charanautomation\\New\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("Charan");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("12345");

		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(10000);
		
		driver.quit();
	}
}