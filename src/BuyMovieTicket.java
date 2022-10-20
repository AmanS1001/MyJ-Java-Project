
public class BuyMovieTicket {
int ticketMoney = 100;

boolean isMoneyavailable(int moneyAvailable) {
	if(ticketMoney <= moneyAvailable) {
		return true;
		
	}
	return false;
}
}
