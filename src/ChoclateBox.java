
public class ChoclateBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxBoxCapacity = 63;
		int currentChocolates = 27;
		int addChocolate = 5;
		for (int counter = currentChocolates; counter <= maxBoxCapacity; counter += addChocolate) {
			System.out.println("Number of Chocolates in box are " + currentChocolates);
			currentChocolates = currentChocolates + addChocolate;
			if (currentChocolates > maxBoxCapacity) {
				System.out.println("Box reached its max capacity");
				break;
			}

		}
	}
}