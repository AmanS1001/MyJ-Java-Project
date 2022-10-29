package Encapsulation;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StudentDetails aman = new StudentDetails("Amanpreet Singh", 230495);
		System.out.println("Name of Student is : " + aman.studentName +"\nRoll no. of student is :"+ aman.getStudentRollNo());
		
		aman.setStudentRollNo(230496);
//		System.out.println("New Roll no. issued");
		System.out.println("Name of Student is : " + aman.studentName +"\nRoll no. of student is :"+ aman.getStudentRollNo());
		
	}

}
