package intefaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.sayHello();
		
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		
		Sell seller = customer;
		seller.sell();
		seller.order();
	}
	//default method가 있어도 인스턴스껄로 불린다.
}
