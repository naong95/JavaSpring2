package inheritance;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "이순신");
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		
		
		
		Customer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
		//customerKim.
		//하위 클래스의 타입은 상위 클래스의 타입으로 묵시적 형변환이 된다.
		//업캐스팅: 역은 성립하지 않는다
		//하위 클래스 == 상위 클래스 + @
		//하지만 업캐스팅이 되면 상위 클래스의 인스턴스밖에 참조 못함
		//인스턴스는 하위 클래스의 메모리 만큼 힙에 만들어지지만
		//업캐스팅함으로 결국 상위 클래스의 형으로 바뀐 것이기에 참조 못함
	}
	//하위 클래스가 생성 될 때 상위 클래스가 먼저 생성 됨

}
