import java.util.Scanner;

public class MainClassPurchasingCellPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Type of Operating System of cell phone");

		String selectOperatingSystem = sc.next();

		SelectOSofCellPhone selectedOS = new SelectOSofCellPhone();

		String brandSelected = selectedOS.cellPhoneOSType(selectOperatingSystem);
		System.out.println("Brand selected"+brandSelected);
		System.out.println("Please enter the model that you want to buy: ");
	
		
		
		
		
		
	}
}
	