package Encapsulation;

public class StudentDetails {
	public String studentName;
	private int studentRollNo;

	public StudentDetails(String studentName, int studentRollNo) {
		
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
	}

	public int getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
		System.out.println("New Roll Number Issued");
	}

}
