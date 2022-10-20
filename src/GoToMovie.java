import java.util.Scanner;

public class GoToMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Amount available ");
		int moneyAvailable = sc.nextInt();
		BuyMovieTicket buyTicket = new BuyMovieTicket();

		System.out.println(
				"Is the amount avaibale more than ticket amount: " + buyTicket.isMoneyavailable(moneyAvailable));
		System.out.println("Lets go to Movie.....YeAH");
	}

}
