package testcases;

public class Student {

	String studentName;
	int subject1;
	int subject2;
	int subject3;
	int subject4;

	public Student(String studentName, int subject1, int subject2, int subject3) {

		this.studentName = studentName;
		this.subject1 = subject1;
		this.subject2 = subject2;
	    this.subject3 = subject3;
	    
	}


	public Student(String studentName, int subject1, int subject2, int subject3, int subject4) {

		this.studentName = studentName;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;

	}

	public int printTotalMarks() {

		int total = subject1 + subject2 + subject3;

		System.out.println("Total  " + studentName + ": " + total);

		return total;

	}

	public int printTotalMarks1() {

		int total = subject1 + subject2 + subject3 + subject4;

		System.out.println("Total  " + studentName + ": " + total);

		return total;
	}

	public static int printTotalMarks(String studentName, int subject1, int subject2, int subject3) {

		int total = subject1 + subject2 + subject3;

		System.out.println("Total  " + studentName + ": " + total);

		return total;
	}

	public static int printTotalMarks(String studentName, int subject1, int subject2, int subject3, int subject4) {

		int total = subject1 + subject2 + subject3 + subject4;

		System.out.println("Total  " + studentName + ": " + total);

		return total;

	}
}
