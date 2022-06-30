package testcases;

public class TessAccessModifiers extends Employee {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.printHello();
		emp1.printEmployeeDetail();
		emp1.printHi();
		// emp1.printPrivateHi();

	}

}
