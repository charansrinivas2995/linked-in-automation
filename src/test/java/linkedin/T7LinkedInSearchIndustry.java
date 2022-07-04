package linkedin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import common.SeleniumUtils;

public class T7LinkedInSearchIndustry extends SeleniumUtils {

	@Test(description = "TC19 - To verify the search functionality by selecting Industry filter")
	public void LinkedInSearchIndustryTC19() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String browserTitle = driver.getTitle();

		System.out.println("The browser title : " + browserTitle);

		System.out.println("LinkedIn Search With Multiple Industry Filter");

		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/header[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]"))
				.click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/a[1]/div[1]/div[1]"))
				.click();

		driver.findElement(By.linkText("Search with filters")).click();

		driver.findElement(By
				.xpath("/html[1]/body[1]/div[6]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", driver
				.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[8]/fieldset[1]/h3[1]")));

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[8]/fieldset[1]/div[1]/ul[1]/li[1]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[8]/fieldset[1]/div[1]/ul[1]/li[2]/label[1]"))
				.click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[8]/fieldset[1]/div[1]/ul[1]/li[4]/label[1]"))
				.click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/div[1]/button[2]/span[1]")).click();

		Thread.sleep(3000);

	}

	@Test(description = "TC20 - To verify the search functionality by selecting Reset Industry filter")
	public void LinkedInSearchIndustryTC20() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String browserTitle = driver.getTitle();

		System.out.println("The browser title : " + browserTitle);

		System.out.println("LinkedIn Search With Reset Industry Filter");

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[6]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[4]/div[1]/span[1]/button[1]"))
				.click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[6]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]"))
				.click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[6]/div[3]/div[2]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/button[2]/span[1]"))
				.click();

		Thread.sleep(3000);

	}

}
