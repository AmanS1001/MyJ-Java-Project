package AssignmentWeek_8;

import java.util.Scanner;


public class BookingMyCruise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner keyBoard = new Scanner(System.in);
		System.out.println(
				"***************Welcome to Rockford Cruise Company***************\nPlease sign up to book a cruise.");

		CruiseRegistration registration = new CruiseRegistration();

		System.out.print(" Enter firstName => ");
		String firstName = scan.nextLine();
		registration.setFirstName(firstName);

		System.out.print(" Enter lastName => ");
		String lastName = scan.nextLine();
		registration.setLastName(lastName);

		System.out.print(" Enter userName => ");
		String userName = scan.nextLine();
		registration.setUserName(userName);

		System.out.print(" Enter password => ");
		String password = scan.nextLine();
		registration.setPassword(password);

		System.out.print(" Enter emailId => ");
		String emailId = scan.nextLine();
		registration.setEmailId(emailId);

		System.out.print(" Enter phoneNo => ");
		long phoneNo = scan.nextLong();
		registration.setPhoneNo(phoneNo);

		System.out.println(registration.toString());
		System.out.println("Thank you for registering!");
		System.out.println("Welcome to the Login Page");

		for (int j = 0; j < 3; j++) {

			System.out.println("Enter EmailID to login:");// username:user
			String userNewEmail = keyBoard.nextLine();
			String savedEmailid = registration.getEmailId();

			System.out.println("Enter password:");// password:user
			String userPassword = keyBoard.nextLine();
			String savedPassword = registration.getPassword();

			if (userNewEmail.equalsIgnoreCase(savedEmailid) && userPassword.equalsIgnoreCase(savedPassword)) {
				System.out.println("Logged on successfully");
				Scanner sc = new Scanner(System.in);
				String again;
				String cruiseSelec;
				int index = 0;
				CruiseDetails scenicCruise = new CruiseDetails("Scenic Cruise", 43.99, 12.99, 3);
				CruiseDetails sunsetCruise = new CruiseDetails("Sunset Cruise", 52.99, 15.99, 1);
				CruiseDetails discoveryCruise = new CruiseDetails("Discovery Cruise", 39.99, 9.99, 4);
				CruiseDetails mysteryCruise = new CruiseDetails("Mystery Cruise", 45.99, 12.99, 2);
				CruiseDetails[] cruiseDetails = { scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };

				do {
					System.out.println(
							"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.\n"
									+ "Scenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise\n");
					cruiseSelec = sc.nextLine();
					int counTry = 1;
					while (!cruiseSelec.equalsIgnoreCase("Scenic Cruise")
							&& !cruiseSelec.equalsIgnoreCase("Sunset Cruise")
							&& !cruiseSelec.equalsIgnoreCase("Discovery Cruise")
							&& !cruiseSelec.equalsIgnoreCase("Mystery Cruise")) {
						++counTry;
						if (counTry > 3) {
							System.out.println("Please Start over,you have reached the input limit");
							System.exit(0);
						}
						System.out.println("Invalid Selection try again below");
						cruiseSelec = sc.nextLine();
					}

					for (int i = 0; i < cruiseDetails.length; i++) {
						if ((cruiseSelec).equalsIgnoreCase(cruiseDetails[i].cruiseSelection)) {
							index = i;
							System.out
									.println("The cruise that you have selected is " + cruiseDetails[i].cruiseSelection
											+ " which is a " + cruiseDetails[i].numDay + " day cruise\r\n"
											+ "Price for Adults	(greater than 12)	: " + cruiseDetails[i].priceForAdult
											+ " per day\r\n" + "Price for kids above 5			: "
											+ cruiseDetails[i].priceForchildren + " per day\r\n" + "");
							break;
						}

					}
					System.out.println("Please press Y if you want to continue with the selection or\n"
							+ "press any other alphabet to select another");
					again = sc.nextLine();
				} while (!again.equalsIgnoreCase("Y"));

				System.out.println("Enter the number of adults");
				int numAdults = sc.nextInt();
				System.out.println("Enter the number of children");
				int numChildren = sc.nextInt();
				int ageAboveFive = 0;
				int age;
				if (numChildren > 0) {
					for (int i = 0; i < numChildren; i++) {
						System.out.println("Enter the age of child " + (i + 1));
						age = sc.nextInt();
						while (age >= 13 || age <= 0) {
							System.out.println("Please enter a valid age of child " + (i + 1) + " from (1-12)");
							age = sc.nextInt();
						}

						if (age >= 5) {
							ageAboveFive++;
						}
					}
				}

				System.out.println(
						"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at \n20.99 per day for adults and 4.99 per day for kids?"
								+ "\nPlease press Y if you want to Prebook otherwise press any other alphabet");
				String buffetMeal = sc.next();
				cruiseDetails[index].setbuffetPrice(buffetMeal);
				cruiseDetails[index].output(numAdults, ageAboveFive);
				break;

			} else
				System.out.println("Invalid Credential. KIndly try again");
		}

//		registration.UserLogin(userNewEmail, userPassword);
		scan.close();
		keyBoard.close();
		

	}
}
