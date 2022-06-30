package testcases;

public class StaticNonStaticTest {

	public static void main(String[] args) {
		Student1 student1 = new Student1();

		student1.studentId = "SID01";
		student1.studentName = "Raj";

		Student1 student2 = new Student1();

		student2.studentId = "SID02";
		student2.studentName = "Kiran";

		Student1 student3 = new Student1();

		student3.studentId = "SID03";
		student3.studentName = "Akhil";

		System.out.println("StudentCount is : " + Student1.studentCount);

		Student1.printStudentCount();

	}

}
