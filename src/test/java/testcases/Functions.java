package testcases;

public class Functions {

	public static void main(String[] args) {

		String student1Name = "John";
		String student2Name = "Raj";
		String student3Name = "Rama";

		int subject1Raj = 76;
		int subject2Raj = 80;
		int subject3Raj = 86;

		int subject1John = 86;
		int subject2John = 60;
		int subject3John = 66;

		int subject1Rama = 86;
		int subject2Rama = 77;
		int subject3Rama = 78;
		int subject4Rama = 89;

		int total;

		total = printTotalMarks(student1Name, subject1John, subject2John, subject3John);

		System.out.println("average of marks : " + total / 3);

		total = printTotalMarks(student2Name, subject1Raj, subject2Raj, subject3Raj);

		System.out.println("average of marks : " + total / 3);

		total = printTotalMarks("Shyam", 66, 75, 75);

		System.out.println("average of marks : " + total / 3);

		total = printTotalMarks(student3Name, subject1Rama, subject2Rama, subject3Rama, subject4Rama);

		System.out.println("average of marks : " + total / 4);

	}

	private static int printTotalMarks(String studentName, int subject1, int subject2, int subject3) {

		int total = subject1 + subject2 + subject3;

		System.out.println("Total  " + studentName + ": " + total);

		return total;
	}

	private static int printTotalMarks(String studentName, int subject1, int subject2, int subject3, int subject4) {

		int total = subject1 + subject2 + subject3 + subject4;

		System.out.println("Total  " + studentName + ": " + total);

		return total;

	}
}
