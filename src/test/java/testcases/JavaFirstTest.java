package testcases;

public class JavaFirstTest {

	public static void main(String[] args) {
		System.out.println("hello world");

		int number1 = 10;
		int number2 = 60;
		int total;

		total = number1 + number2;

		System.out.println("The sum of two number is : " + total);

		int subs = number1 - number2;

		System.out.println("the substraction of given number is :" + subs);

		int multiplication = number1 * number2;

		System.out.println("The  multiplication of given number is " + multiplication);

		int number3 = 20;
		int number4 = 3;

		double div = (double) number3 / (double) number4;
		System.out.println("The division of given number is :" + div);

		String employeName = "John";
		String employeCode = "35";
		int employeCodeInt = Integer.parseInt(employeCode);

		System.out.println("Employee code :" + employeCodeInt);
		
		

	}

}
