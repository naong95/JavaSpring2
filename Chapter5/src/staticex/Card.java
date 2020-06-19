package staticex;

public class Card {
	
	private static int cardSerial = 10000;
	
	private int cardNumber;
	
	public int getCardNumber() {
		
		return cardNumber;
	}
	
	public Card() {
		cardSerial++;
		cardNumber = cardSerial;
	}

}
