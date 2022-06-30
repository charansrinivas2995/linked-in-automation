package testcases;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.employeeId = "EID01";
		emp1.salary = 50000;

		emp2.employeeId = "EID02";
		emp2.salary = 60000;

		emp1.goToOfficeEveryDay();
		emp1.performDuty();
		emp1.printEmployeeDetails();

		emp2.goToOfficeEveryDay();
		emp2.performDuty();
		emp2.printEmployeeDetails();

		Employee emp3 = new Employee("EID03", 70000);
		emp3.goToOfficeEveryDay();

		System.out.println("Salary " + emp3.salary);
		System.out.println("Employee Company Name " + Employee.companyName);

		Manager manager1 = new Manager();
		manager1.employeeId = "EID04";
		manager1.salary = 90000;
		manager1.goToOfficeEveryDay();
		manager1.performDuty();
		manager1.Works3DaysPerWeek();
		manager1.printEmployeeDetails();

	}

}
