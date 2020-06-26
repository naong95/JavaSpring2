package quiz;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerHeo = new Customer(10010, "������");
		Customer customerKim = new Customer(10020, "�谭��");
		Customer customerLee = new GoldCustomer(10030, "�̰���");
		Customer customerPark = new GoldCustomer(10040, "������");
		Customer customerCheon = new VIPCustomer(10050, "õ�ο�", 12345);
		
		customerList.add(customerHeo);
		customerList.add(customerKim);
		customerList.add(customerLee);
		customerList.add(customerPark);
		customerList.add(customerCheon);
		
		System.out.println("========  ��  ����  ���  ========");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("========  ��������  ���ʽ�  ����Ʈ  ���  ========");
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�� �Դϴ�.");
		}
		
		
		
		
	}

}
