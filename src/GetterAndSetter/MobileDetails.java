package GetterAndSetter;

public class MobileDetails {
	public String personName;
	public String brandName;
	private int passwordCode;

	public MobileDetails(String personName, String brandName, int passwordCode) {
		super();
		this.personName = personName;
		this.brandName = brandName;
		this.passwordCode = passwordCode;

	}
	
	public String getPersonName() {
		return personName;
	}
	
	public void setpasswordCode(int passwordCode) {
		this.passwordCode = passwordCode;
	}

		public String getBrandName() {
		return brandName;
	}

	public char[] getPasswordCode() {
		// TODO Auto-generated method stub
		return null;
	}

}
