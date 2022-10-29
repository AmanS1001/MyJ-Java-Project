package Encapsulation;

public class MobileNumberDetails {
	public String customerName;
	private long mobileNumber;

	public MobileNumberDetails(String customerName, long mobileNumber) {

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
