package quiz;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerHeo = new Customer(10010, "허진혁");
		Customer customerKim = new Customer(10020, "김강열");
		Customer customerLee = new GoldCustomer(10030, "이가흔");
		Customer customerPark = new GoldCustomer(10040, "박지현");
		Customer customerCheon = new VIPCustomer(10050, "천인우", 12345);
		
		customerList.add(customerHeo);
		customerList.add(customerKim);
		customerList.add(customerLee);
		customerList.add(customerPark);
		customerList.add(customerCheon);
		
		System.out.println("========  고객  정보  출력  ========");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("========  할인율과  보너스  포인트  계산  ========");
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
		}
		
		
		
		
	}

}
