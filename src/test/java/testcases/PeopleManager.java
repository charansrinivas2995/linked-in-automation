package testcases;

import framework.Employee1;

public class PeopleManager extends Employee1 {

	@Override
	public void performDuty() {
		System.out.println("employee perform duty from child class");

	}

	public void printHello() {
		System.out.println("Hello from child method");
	}

	@Override
	public int getTotalSalary() {
		return 110;
	}

	public void works3DaysPerWeek() {
		System.out.println("Works any three days per week ");
	
		
	}

}
