
public class ChoclateBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxBoxCapacity = 63;
		int currentChoclates= 27;
		int addChoclate = 5;
	

		for (
				int counter = currentChoclates; 
				counter < maxBoxCapacity; 
				counter += addChoclate) 
		{
			currentChoclates = currentChoclates + addChoclate;

			System.out.println("Number of Choclates in box are " + currentChoclates);
			if (currentChoclates == maxBoxCapacity) {
				System.out.println("No more choclates to be added");
				break;
			}
		}
	}
}
