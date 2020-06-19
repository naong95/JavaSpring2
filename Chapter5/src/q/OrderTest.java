package q;

public class OrderTest {

	public static void main(String[] args) {

		Order firstOrder = new Order();
		
		firstOrder.numberOfOrder = "201907210001";
		firstOrder.ID = "abc123";
		firstOrder.date = "2019년 7월 21일";
		firstOrder.name = "홍길순";
		firstOrder.goodsNumber = "PD0345-12";
		firstOrder.address = "서울시 영등포구 여의도동 20번지";
		
		firstOrder.showOrderInfo();
		
	}

}
