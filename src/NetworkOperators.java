
public class NetworkOperators {
String networkOperatorsType(String selectNetworkOperator) {
	String networkTobeSelected;
	if(selectNetworkOperator.equals("No Mobile Plan")) {
		networkTobeSelected ="";
		System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
	}
	return networkTobeSelected;
}
}
