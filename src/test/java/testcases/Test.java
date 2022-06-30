package testcases;

public class Test {

	public static void main(String[] args) {
		PeopleManager peopleManager=new PeopleManager();
		
		System.out.println("total Salary : "+ peopleManager.getTotalSalary());
		
		peopleManager.printHello();

	}

}
