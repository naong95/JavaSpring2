package q;

public class Order {
	
	String numberOfOrder;
	String ID;
	String date;
	String name;
	String goodsNumber;
	String address;

	void showOrderInfo() {
		System.out.println("주문 번호: " + numberOfOrder);
		System.out.println("주문자 아이디: " + ID);
		System.out.println("주문 날짜: " + date);
		System.out.println("주문자 이름: " + name);
		System.out.println("주문 상품 번호: " + goodsNumber);
		System.out.println("배송 주소: " + address);
	}
}
