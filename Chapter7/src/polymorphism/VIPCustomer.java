package polymorphism;

public class VIPCustomer extends Customer{

	
	double salesRatio;
	private int agentID;
	
	/*public VIPCustomer() {
		
		super(); //�ڵ����� ���� Ŭ������ ����Ʈ �����ڰ� ȣ���
		         //(���� Ŭ������ �޸���ġ �� �������� ������ �ִ�)
				 //���� ���� Ŭ�������� �Ű����� �޴� �⺻ �����ڰ� �ƴ� �����ڰ� ������ ����
				 //�� ��쿡�� ���������� ������ ȣ��
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() ������ ȣ��");
		
	}*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName); //������ ȣ��
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		//System.out.println("VIPCustomer(int, String) ������ ȣ��");
	}

	@Override//annotation
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	//�ڹٿ����� �׻� �ν��Ͻ��� �޼��尡 ȣ���: ����޼���
	

}