package q;

public class OrderTest {

	public static void main(String[] args) {

		Order firstOrder = new Order();
		
		firstOrder.numberOfOrder = "201907210001";
		firstOrder.ID = "abc123";
		firstOrder.date = "2019�� 7�� 21��";
		firstOrder.name = "ȫ���";
		firstOrder.goodsNumber = "PD0345-12";
		firstOrder.address = "����� �������� ���ǵ��� 20����";
		
		firstOrder.showOrderInfo();
		
	}

}
