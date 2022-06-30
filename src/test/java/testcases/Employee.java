package testcases;

public class Employee {
	String employeeId;
	int salary;
	static String companyName = "Apple";

	public Employee() {
		System.out.println("I am in method Employee");
	}

	public Employee(String employeeId, int salary) {
		System.out.println("I am in constructor Employee");
		this.employeeId = employeeId;
		this.salary = salary;

		int salaryTakeHome = getTakeHomeSalary();
		System.out.println("Take home Salary : " + salaryTakeHome);

	}

	public int getTakeHomeSalary() {
		int salaryTakeHome = (int) (this.salary - this.salary * 0.1);
		return salaryTakeHome;

	}

	public void goToOfficeEveryDay() {

		System.out.println("employee goes to office everyday");
		printPrivateHi();
	}

	public void performDuty() {
		System.out.println("employee perform duty");

	}

	public void printEmployeeDetails() {
		System.out.println("Employee Id - " + employeeId);

		System.out.println("Salary - " + salary);
	}

	public void printEmployeeDetail() {
		System.out.println("Print Employee Detail  Public Method()");

	}

	void printHello() {
		System.out.println("default print Hello Method()");

	}

	protected static void printHi() {
		System.out.println("Print Hi from Protected Method()");

	}

	private void printPrivateHi() {
		System.out.println("Print Hi from Private Method");
	}

}
