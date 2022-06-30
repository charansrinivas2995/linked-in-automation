package testcases;

public class Test1 {

	public static void main(String[] args) {
		PeopleManager peopleManager=new PeopleManager();
		
		System.out.println("total Salary : "+ peopleManager.getTotalSalary());
		
		peopleManager.printHello();

	}

}
