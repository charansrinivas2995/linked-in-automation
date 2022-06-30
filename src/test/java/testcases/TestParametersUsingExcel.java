package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import framework.BaseTest;

public class TestParametersUsingExcel extends BaseTest {

//	@Test
//	public void TestScenarios301() throws IOException, InterruptedException {
	public static void main(String[] args) throws IOException {

		System.out.println("Hello from testCase301");

		getExcelData();
		/*
		 * System.out.println("Hello from testCase301");
		 * 
		 * driver.findElement(By.name("email")).sendKeys("Test9");
		 * 
		 * driver.findElement(By.name("pass")).sendKeys("test@123");
		 * 
		 * driver.findElement(By.id("u_0_2_KE")).click();
		 */

	}

	public static void getExcelData() throws IOException {
		FileInputStream file = new FileInputStream(
				new File("D:\\Testing\\Charanautomation\\New\\resources\\TestData\\TestData.xls"));

		HSSFWorkbook workbook = new HSSFWorkbook(file);

		HSSFSheet sheet = workbook.getSheet("TestData");

		HSSFRow row = sheet.getRow(1);

		HSSFCell cell = row.getCell(0);

		String userName = cell.getStringCellValue();

		System.out.println("userName : " + userName);

		cell = row.getCell(1);

		String Password = cell.getStringCellValue();

		System.out.println("Password : " + Password);

	}

}
