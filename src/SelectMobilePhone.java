
public class SelectMobilePhone {
	String modelType(String modelSelected) {
		String modelTobePurchased;
		if (modelSelected.equals("No model")) {
			modelTobePurchased = "Select a Model";
		} else if (modelSelected.equals("S22")) {
			modelTobePurchased = "Model selected is S22";

		} else if (modelSelected.equals("S22 plus")) {
			modelTobePurchased = "Model selected is S22 plus";
		} else if (modelSelected.equals("S22 Ultra")) {
			modelTobePurchased = "Model selected is S22 Ultra";
		} else if (modelSelected.equals("S22 FE")) {
			modelTobePurchased = "Model selected is S22FE";
		} else {
			modelTobePurchased = "Select different brand";
		}
		return modelTobePurchased;

	}
}
