
public class MethodwithReturnType {
	String licenseType(String currentLicense) {
		String licenseTobeApplied;
		if(currentLicense.equals("No license")) {
			licenseTobeApplied = "G1";
		}else if(currentLicense.equals("G1")) {
			licenseTobeApplied = "G2";
		}else if(currentLicense.equals("G2")) {
			licenseTobeApplied = "G";
		}else {
			licenseTobeApplied = "You already have a license";
		}
		
		return licenseTobeApplied;

	}
}
