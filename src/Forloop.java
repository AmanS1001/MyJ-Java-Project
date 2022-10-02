
public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int actualCapacity = 4;

		for (int counter = 1; counter <= 10; counter++) {
			System.out.println("Had " + counter + " drink");
			if (counter == actualCapacity) {
				System.out.println("Capacity is  reached");
				break;
			} 
			}
		}

	}
