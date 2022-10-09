
public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] wordList = { "Free", "Cry", "See", "Dream", "Free","Cry" };

		System.out.println(wordList);
		for (int i = 0; i < wordList.length; i++) {
						for (int j = i + 1; j < wordList.length; j++) {
				if ((wordList[i] == wordList[j]) ) {
					System.out.println(wordList[j]);
				}
			}
		}
	}
}