package quiz;

public class GoldCustomer extends Customer {

	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
		
	}
	
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	//Ŀ����ӿ��� ��� �޾Ƽ� ������ �����
	//��̸���Ʈ�� ���� 5���� 10000��¥�� ��ǰ ���� ����
	//������ ����
}