package Encapsulation;

public class MobileNumberDetails {
	public String customerName;
	private int mobileNumber;

	public MobileNumberDetails(String customerName, int mobileNumber) {

		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
