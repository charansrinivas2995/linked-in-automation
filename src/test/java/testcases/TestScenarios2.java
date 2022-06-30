package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenarios2 {
	@Test()
	public void createFlightTicket() {
		System.out.println("Create flight ticket");

	}

	@Test(dependsOnMethods = { "createFlightTicket", "updateFlightTicket" })
	public void cancelFlightTicket() {
		System.out.println("Cancel flight ticket");

		int Number  = 9;
		//int Number2 = 10;
		
		//int total = Number + Number2;
	//Assert.assertEquals(16,total);
		
		Assert.assertTrue(Number == 6);
	}

	@Test(dependsOnMethods = "createFlightTicket")
	public void updateFlightTicket() {
		System.out.println("Update Flight Ticket");

	}

	// hard dependency
	@Test(dependsOnMethods = "cancelFlightTicket")
	public void orderFood() {
		System.out.println("Order food");

	}

	// soft dependency
	@Test(dependsOnMethods = "cancelFlightTicket", alwaysRun = true)
	public void goToHotel() {
		System.out.println("Go to Hotel");
	}
}