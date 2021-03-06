package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
	
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee + "원 입니다.");
		System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim + "원 입니다.");

		Customer customerHeo = new VIPCustomer(10030, "허진혁"); //타입이 상위 클래스지만 인스턴스는 하위 클래스기 때문에 VIP쪽 메서드가 불린다(10프로 할인)
		customerHeo.bonusPoint = 10000;
		System.out.println(customerHeo.showCustomerInfo() + "지불금액은 " + customerHeo.calcPrice(10000) + "원 입니다.");
		//재정의 된 메서드는 원래 메서드와 이름이 같아도 주소가 다르다.
	}

}
