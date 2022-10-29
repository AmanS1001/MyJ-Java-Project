package AssignmentWeek_7;

import java.util.Scanner;

public class DetailsCruise {
	int adultCount = 0;
	int childrenCount = 0;
	int ageChildren;
	int[] adultMembersarray;
	Scanner scan = new Scanner(System.in);
	String selectCruise;
	String cruiseSelected;

	public int checkAdultMemberAge(int age) {
		if (age <= 12) {
			System.out.println("Pls Enter Correct Age");
			int personAge = scan.nextInt();
			checkAdultMemberAge(personAge);

		}
		return age;
	}
	public void collectNumberofAdults() {
		int adultMembers = scan.nextInt();
		adultMembersarray = new int[adultMembers];
		for (int i = 0; i < adultMembersarray.length; i++) {
			System.out.println("Pls enter the age of adult" + (i + 1));
			int personAge = scan.nextInt();
			if (personAge <= 12) {
				System.out.println("Person is not adult");
				personAge = checkAdultMemberAge(personAge);
			}

			adultMembersarray[i] = personAge;
		}
	}
	public void collectCruiseName() {
		selectCruise = scan.nextLine();
		if (selectCruise.equals("Scenic Cruise")) {
			cruiseSelected = "Scenic Cruise";
			System.out.println(
					"The cruise that you have selected is Scenic Cruise which is a 3 day cruise \nPrice for Adults(greater than 12)	: 43.99 per day \nPrice for kids above 5			: 12.99 per day");
			System.out.println("How many Adult members?");
			
			System.out.println("How many Children members?");
			scan.nextInt();
			}
		
	}

	String cruiseType(String selectCruise) {
		

		

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
