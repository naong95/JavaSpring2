package q;

public class Order {
	
	String numberOfOrder;
	String ID;
	String date;
	String name;
	String goodsNumber;
	String address;

	void showOrderInfo() {
		System.out.println("�ֹ� ��ȣ: " + numberOfOrder);
		System.out.println("�ֹ��� ���̵�: " + ID);
		System.out.println("�ֹ� ��¥: " + date);
		System.out.println("�ֹ��� �̸�: " + name);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + goodsNumber);
		System.out.println("��� �ּ�: " + address);
	}
}
