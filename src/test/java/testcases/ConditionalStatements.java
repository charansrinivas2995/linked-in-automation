package testcases;

public class ConditionalStatements {

	public static void main(String[] args) {
		int subject1 = 75;
		int subject2 = 85;
		int subject3 = 90;

		int TotalMarks = subject1 + subject2 + subject3;

		System.out.println("Total of subject marks :" + TotalMarks);

		int marksAverage = TotalMarks / 3;

		System.out.println("Average : " + marksAverage);

		if (marksAverage > 40) {
			System.out.println("Student Passed");

			if (marksAverage >= 80) {
				System.out.println("Student Passed with First Class");
			}
		} else if (marksAverage < 40) {
			System.out.println("Student Failed");

		} else {
			System.out.println("Student Just Passed");
		}
		int monthNumber = 4;

		switch (monthNumber) {

		case 1:

			System.out.println("I am January");
			break;

		case 2:

			System.out.println("I am February");

		default:

			System.out.println("I am neither January nor February");

		}
	}

}
