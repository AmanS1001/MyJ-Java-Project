import java.util.Scanner;

public class DetectDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String nameList[] = new String[5];

		System.out.println("Enter 5 Name:");
		for (int i = 0; i < 5; i++) {
			nameList[i] = sc.nextLine();
		}
		System.out.println();
		System.out.println("Name of friends are:");
		for (int i = 0; i < 5; i++) {
			System.out.println(nameList[i]);
			for (int j = i + 1; j < nameList.length; j++) {
				if (i != j && (nameList[i] == nameList[j])) {
					System.out.println(nameList[j]);
					j++;
					System.out.println(j+ "Number the times word repeated");
				}

			}
		}
	}
}
