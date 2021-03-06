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

	//커스토머에서 상속 받아서 골드고객 만들기
	//어레이리스트로 고객 5명이 10000원짜리 상품 구매 구현
	//메이플 버닝
}
