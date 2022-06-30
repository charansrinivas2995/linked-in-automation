package testcases;

public class TestStudent {

	public static void main(String[] args) {

		int number1 = 10;

		Student john = new Student("John Kandy", 50, 60, 70);

		Student rama = new Student("Rama", 60, 55, 75);

		Student shyam = new Student("Shyam Prasad", 80, 60, 70);

		Student akhil = new Student("Akhil", 80, 60, 70, 85);

		john.printTotalMarks();
		rama.printTotalMarks();
		shyam.printTotalMarks();
		akhil.printTotalMarks1();

	}

}
