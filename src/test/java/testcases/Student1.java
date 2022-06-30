package testcases;

public class Student1 {
	String studentName;
	String studentId;

	static int studentCount = 0;

	public Student1() {
		studentCount++;
		System.out.println("StudentCount : " + studentCount);
	}

	public static void printStudentCount() {
		System.out.println("StudentCount is : " + studentCount);

	}
}
