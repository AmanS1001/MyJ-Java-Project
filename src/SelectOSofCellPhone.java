
public class SelectOSofCellPhone {
	String cellPhoneOSType(String selectOperatingSystem) {
		String brandSelected;
		if (selectOperatingSystem.equals("Android")) {
			brandSelected = "Samsung";
		
		} 
		else if (selectOperatingSystem.equals("IOS")) {
			brandSelected = "Apple";
		} else
			brandSelected = "None";
		return brandSelected;
	}
}