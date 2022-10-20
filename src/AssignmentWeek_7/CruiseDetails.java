package AssignmentWeek_7;

import java.util.Scanner;

public class CruiseDetails {
	int adultCount = 0;
	int childrenCount = 0;
	int ageChildren;

	String cruiseType(String selectCruise) {
		String cruiseSelected;
		Scanner scan = new Scanner(System.in);
		if (selectCruise.equals("Scenic Cruise")) {
			cruiseSelected = "Scenic Cruise";
			System.out.println(
					"The cruise that you have selected is Scenic Cruise which is a 3 day cruise \nPrice for Adults(greater than 12)	: 43.99 per day \nPrice for kids above 5			: 12.99 per day");
			System.out.println("How many Adult members?");
			scan.nextInt();
			System.out.println("How many Children members?");
			scan.nextInt();

		} else if (selectCruise.equals("Sunset Cruise")) {
			cruiseSelected = "Sunset Cruise";
			System.out.println(
					"The cruise that you have selected is Sunset Cruise which is a 1 day cruise \nPrice for Adults	(greater than 12)	: 52.99 per day \nPrice for kids above 5			: 15.99 per day");
			System.out.println("How many Adult members?");
			scan.nextInt();
			System.out.println("How many Children members?");
			scan.nextInt();

		} else if (selectCruise.equals("Discovery Cruise")) {
			cruiseSelected = "Discovery Cruise";
			System.out.println(
					"The cruise that you have selected is Discovery Cruise which is a 1 day cruise \nPrice for Adults	(greater than 12)	: 39.99 per day \nPrice for kids above 5		: 9.99 per day");
			System.out.println("How many Adult members?");
			scan.nextInt();
			System.out.println("How many Children members?");
			scan.nextInt();

		} else if (selectCruise.equals("Mystery Cruise")) {
			cruiseSelected = "Mystery Cruise";
			System.out.println(
					"The cruise that you have selected is Mystery Cruise which is a 1 day cruise \nPrice for Adults	(greater than 12)	: 45.99 per day \nPrice for kids above 5			: 12.99 per day");
			System.out.println("How many Adult members?");
			scan.nextInt();
			System.out.println("How many Children members?");
			scan.nextInt();

		} else
			cruiseSelected = "Invalid input";
		return cruiseSelected;
	}
}
