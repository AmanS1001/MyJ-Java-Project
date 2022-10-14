import java.util.Scanner;

public class MainClassPurchasingCellPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Type of Operating System of cell phone");

		String selectOperatingSystem = sc.next();

		SelectOSofCellPhone selectedOS = new SelectOSofCellPhone();

		String brandSelected = selectedOS.cellPhoneOSType(selectOperatingSystem);

		switch (brandSelected) {
		case "Samsung":
			System.out.println("Brand selected:Samsung");
			break;
		case "Apple":
			System.out.println("Brand selected:Apple");
			break;
		}
		System.out.println("Please enter the model that you want to buy: ");
		String modelSelected =sc.next();
		//Creating an instance of class
		SelectMobilePhone selectMP = new SelectMobilePhone();
		String modelTobePurchased = selectMP.modelType(modelSelected);
		switch (modelTobePurchased) {
		case "S22":
			System.out.println("Model slected is S22 and price is $25/month");
			break;
		case "S22 plus":
			System.out.println("Model slected is S22plus and price is $35/month");
			break;
		case "S22 Ultra":
			System.out.println("Model slected is S22 Ultra and price is $55/month");
			break;
		case "S22 FE":
			System.out.println("Model slected is S22FE and price is $20/month");
			break;
			default:
				System.out.println("Invalid Input");
				break;
		}
			
		
		
		
		
		
	}
}
	