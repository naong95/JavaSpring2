package inheritance;

public class VIPCustomer extends Customer{

	
	double salesRatio;
	private int agentID;
	
	/*public VIPCustomer() {
		
		super(); //자동으로 상위 클래스의 디폴트 생성자가 호출됨
		         //(상위 클래스의 메모리위치 즉 참조값을 가지고 있다)
				 //만약 상위 클래스에서 매개변수 받는 기본 생성자가 아닌 생성자가 있으면 오류
				 //그 경우에는 명시적으로 생성자 호출
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
		
	}*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName); //명시적 호출
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
}
