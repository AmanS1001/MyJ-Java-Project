package AssignmentWeek_7;

import java.util.Scanner;

public class BookingCruise {

	public static void main(String[] args) {

		System.out.println("***************Welcome to Rockford Cruise Company***************");
		System.out.println(
				"We offer 4 different packages as displayed below :\n1. Scenic Cruise\n2. Sunset Cruise\n3. Discovery Cruise\n4. Mystery Cruise \nPlease enter the cruise that you want to select");
		Scanner scan = new Scanner(System.in);

		DetailsCruise cruiseDetails = new DetailsCruise();
		cruiseDetails.collectCruiseName();

	}
}
