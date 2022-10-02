
public class License {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ageAman = 21;
		String licenseIssued = "G2";

		if (ageAman < 16) {
			System.out.println("License will not be issued");
		} else if (ageAman >= 16 && licenseIssued == "") {
			System.out.println("Aman is eligible for G1");
		} else if (ageAman >= 16 && licenseIssued == "G1") {
			System.out.println("Aman is eligible for G2");

		} else if (ageAman >= 16 && licenseIssued == "G2") {
			System.out.println("Aman is eligible for G");
		} else if (ageAman >= 16 && licenseIssued == "G") {
			System.out.println("You already have a G license");
		} else {
			System.out.println("Eligibility cannot be determined");
		}
	}
}