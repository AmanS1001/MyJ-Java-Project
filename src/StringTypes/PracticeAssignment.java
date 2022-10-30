package StringTypes;

public class PracticeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Assignment for today
		// Write your first and Last name and replace Last name with *
		// Print first name
		// Find length of your name
		// Just print your first name
		// Replace all e with another character in your name

		String myName = "Amanpreet Singh";
		String newmyName = myName.replace("e", "-");
		System.out.println("New String " + newmyName);

		// Change String to Upper Case
		String upperCaseName = myName.toUpperCase();
		System.out.println("Uppper Case Name " + upperCaseName);

		// Change String to Lower Case
		String lowerCaseName = myName.toLowerCase();
		System.out.println("Lower Case Name " + lowerCaseName);

		// Length of the string
		System.out.println("Length of Name: " + myName.length());

		// Length of String without spaces
		// myName = myName.replace(" ", "");
		// System.out.println("Length of name without spaces: "+myName.length());
		System.out.println("Length of name without spaces: " + myName.replace(" ", "").length());
		

		// Masking
		System.out.println(myName.replaceAll("Singh", " "));
		System.out.println(myName.replaceAll("Singh", "*****"));

		String amanName = "Aman is 32 years old";
		
		//Using Substring with index
		int indexofAmanAge = amanName.indexOf("32");
		System.out.println(indexofAmanAge);

		System.out.println(amanName.substring(amanName.indexOf("32")));
		
		

	}

}
