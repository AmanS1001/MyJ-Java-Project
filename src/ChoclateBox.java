
public class ChoclateBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxBoxCapacity = 63;
		int currentChoclates = 27;
		int addChoclate = 5;
		for (int counter = currentChoclates; counter <= maxBoxCapacity; counter += addChoclate) {
			System.out.println("Number of Choclates in box are " + currentChoclates);
			currentChoclates = currentChoclates + addChoclate;
			if (currentChoclates > maxBoxCapacity) {
				System.out.println("Box reached its max capacity");
				break;
			}
		}if (currentChoclates == maxBoxCapacity)
		{System.out.println("Total number of choclates"  + currentChoclates + " = " + currentChoclates +1);
	}
}
}