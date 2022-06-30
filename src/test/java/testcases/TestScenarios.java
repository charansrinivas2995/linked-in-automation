package testcases;

import org.testng.annotations.Test;

public class TestScenarios {
	@Test(priority = 1)
	public void createFlightTicket() {
		System.out.println("Create flight ticket");

	}

	@Test(priority = 2)
	public void updateFlightTicket() {
		System.out.println("Update Flight Ticket");

	}

	@Test(priority = 3)
	public void cancelFlightTicket() {
		System.out.println("Cancel flight ticket");

	}

	@Test(priority = 4)
	public void orderFood() {
		System.out.println("Order food");
		
	}
}