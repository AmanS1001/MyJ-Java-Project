package LearningConstructors;

public class AccountDetailwithConstr {
	String accountNumber = "10000005678";
	int pIN;
	double balance;

//Constructor always has the same name as class name but with method brackets
//Always invoked when object is created
	// Does not have a return type
//A constructor can have arguments or cannot have arguments
	AccountDetailwithConstr() {
		System.out.println("This is a Constructor");
	}

//This method is updating the value of balance
	void updateBalance() {
		balance = balance + 500;
		System.out.println(balance);
	}
}
