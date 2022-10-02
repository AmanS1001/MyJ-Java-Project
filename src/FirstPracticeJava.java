
public class FirstPracticeJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		int y = 10;
		if (x % 3 == 0 && y % 3 == 0) {
			System.out.println("Both the numbers are divisible by 3");
		} else if (x % 3 == 0 && y % 3 != 0) {
			System.out.println("x is divisible by 3 but y is not divisible by 3");
		} else if (x % 3 == 0 && y % 3 == 0) {
			System.out.println("y is divisible by 3 but x is not divisible by 3");
		} else if (x % 3 != 0 && y % 3 != 0) {
			System.out.println("Both the numbers are not divisible by 3");
		}
	}
}
