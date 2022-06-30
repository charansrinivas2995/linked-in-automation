package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Hello from SecondTest");

		System.setProperty("webdriver.chrome.driver",
				"D:\\Testing\\Charanautomation\\New\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("firstname")).sendKeys("Charan");

		Thread.sleep(2000);

		driver.findElement(By.name("lastname")).sendKeys("Srinivas");

		Thread.sleep(2000);

		driver.findElement(By.name("reg_email__")).sendKeys("test123@mail.com");

		Thread.sleep(2000);

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("test123@mail.com");

		Thread.sleep(2000);

		driver.findElement(By.name("reg_passwd__")).sendKeys("test123");

		Thread.sleep(2000);

		driver.findElement(By.name("birthday_month")).sendKeys("Apr");

		Thread.sleep(2000);

		driver.findElement(By.name("birthday_day")).sendKeys("29");

		Thread.sleep(2000);

		driver.findElement(By.name("birthday_year")).sendKeys("1995");

		Thread.sleep(2000);

		driver.findElement(By
				.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input"))
				.click();

		Thread.sleep(2000);

		driver.findElement(By.name("websubmit")).click();

		Thread.sleep(2000);
		

		driver.close();

	}

}
