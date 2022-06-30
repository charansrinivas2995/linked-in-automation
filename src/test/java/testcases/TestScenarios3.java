package testcases;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import framework.BaseTest;

public class TestScenarios3 extends BaseTest {

	// @Test(groups = "TEST_TICKET")
	@Parameters({ "UserName", "Password" })
	public void TestScenarios301(@Optional("admin") String username, @Optional("mercury") String password) {

		System.out.println("Hello from testCase301");

		System.out.println("UserName :" + username);

		System.out.println("Password :" + password);

		/*
		 * driver.findElement(By.name("email")).sendKeys(username);
		 * driver.findElement(By.name("pass")).sendKeys(password);
		 * driver.findElement(By.id("u_0_2_KE")).click();
		 */
	}

	@Test(dataProvider = "DataProviderFromExcel")
	public void TestScenarios302_DataProvider(String userName, String password, String City, String eMail)
			throws InterruptedException {
		System.out.println("Hello from testCase302");

		System.out.println("userName :" + userName);
		System.out.println("password :" + password);
		System.out.println("City :" + City);
		System.out.println("Email :" + eMail);

		driver.get("http://www.facebook.com");

		driver.findElement(By.name("email")).sendKeys(userName);

		driver.findElement(By.name("pass")).sendKeys(password);

		driver.findElement(By.id("u_0_2_KE")).click();

		Thread.sleep(2000);

	}

	@DataProvider(name = "DataProvider1")
	public Object[][] testData() {

		Object[][] object = new Object[][] { { "User1", "Password1", "Paris" }, { "User2", "Password2", "London" },
				{ "User3", "Password3", "Pune" } };
		return object;

	}

	@DataProvider(name = "DataProviderFromExcel")
	public Object[][] testDataFromExcel() throws IOException {

		Object[][] object;

		FileInputStream file = new FileInputStream(
				"D:\\Testing\\Eclipse\\Java Programs\\resources\\TestData\\TestData1.xls");

		HSSFWorkbook workbook = new HSSFWorkbook(file);

		HSSFSheet sheet = workbook.getSheet("TestData");

		int intRowCount = sheet.getPhysicalNumberOfRows();

		HSSFRow row = sheet.getRow(0);

		HSSFCell cell;

		String cellData;

		int intColumnCount = row.getPhysicalNumberOfCells();

		object = new Object[intRowCount - 1][intColumnCount];

		for (int rowCounter = 1; rowCounter <= intRowCount - 1; rowCounter++) {

			row = sheet.getRow(rowCounter);

			for (int colCounter = 0; colCounter <= intColumnCount - 1; colCounter++) {

				cell = row.getCell(colCounter);

				cellData = cell.getStringCellValue();

				object[rowCounter - 1][colCounter] = cellData;
			}
		}

		return object;
	}

}
