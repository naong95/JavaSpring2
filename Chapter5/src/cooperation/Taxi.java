package cooperation;

public class Taxi {
	
	int money;
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showTaxiInfo() {
		System.out.println("���� ������ ������ " + money + "�� �Դϴ�.");
	}

}
