
public class TankOverflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxTankCapacity = 100;
		int currentTankLevel = 0;
		int bucketCapcaity = 10;
	

		for (int counter = currentTankLevel; counter < maxTankCapacity; counter += bucketCapcaity) {
			currentTankLevel = currentTankLevel + bucketCapcaity;

			System.out.println("Current Tank Level is " + currentTankLevel);
			if (currentTankLevel == maxTankCapacity) {
				System.out.println("Tank is full");
			}
		}
	}
}
