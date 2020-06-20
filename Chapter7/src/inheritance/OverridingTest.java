package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
	
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + "���ұݾ��� " + priceLee + "�� �Դϴ�.");
		System.out.println(customerKim.showCustomerInfo() + "���ұݾ��� " + priceKim + "�� �Դϴ�.");

		Customer customerHeo = new VIPCustomer(10030, "������"); //Ÿ���� ���� Ŭ�������� �ν��Ͻ��� ���� Ŭ������ ������ VIP�� �޼��尡 �Ҹ���(10���� ����)
		customerHeo.bonusPoint = 10000;
		System.out.println(customerHeo.showCustomerInfo() + "���ұݾ��� " + customerHeo.calcPrice(10000) + "�� �Դϴ�.");
		//������ �� �޼���� ���� �޼���� �̸��� ���Ƶ� �ּҰ� �ٸ���.
	}

}