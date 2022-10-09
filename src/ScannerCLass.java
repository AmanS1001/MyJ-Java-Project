import java.util.Scanner;

public class ScannerCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		String name = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Entere the first number");
		num1 = sc.nextInt();
		System.out.println("Entere the second number");
		num2 = sc.nextInt();
		System.out.println("Entere the third number");
		num3 = sc.nextInt();
		int num4 = num1 + num2 + num3;
		System.out.println(num4);

		System.out.println("Enter Your Name");
		name = sc.next();
		System.out.println(name);
	}

}
