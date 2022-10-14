import java.util.Scanner;

public class CRSCalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your current Education Level");
		String currentEducation = sc.next();
		EducationCriteriaClass ecClass = new EducationCriteriaClass();
		String educationPointsTobeGiven = ecClass.educationType(currentEducation);
		System.out.println();
	}

}
