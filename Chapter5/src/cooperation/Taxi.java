package cooperation;

public class Taxi {
	
	int money;
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showTaxiInfo() {
		System.out.println("오늘 기사님의 수입은 " + money + "원 입니다.");
	}

}
