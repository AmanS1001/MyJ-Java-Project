
public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 44;
		double num2 = 2;
		double result;
		String operator = "*";
		switch (operator) {
		case "+":
			result = num1 + num2;
			System.out.println(result);
			break;
		case "-":
			result = num1 - num2;
			System.out.println(result);
			break;
		case "/":
			result = num1 / num2;
			System.out.println(result);
			break;
		case "*":
			result = num1 * num2;
			System.out.println(result);
			break;
		case "%":
			result = num1 % num2;
			System.out.println(result);
			break;
		default:
			System.out.println("Invalid operator selected");
			break;
		}
	}

}
