
public class ExampleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 60;
		while (counter > 0) {
			System.out.println("Time Stops in " + counter);
			counter--;

			if (counter == 0) {
				System.out.println("Time Finished");
			}
		}

	}
}
