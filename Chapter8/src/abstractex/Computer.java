package abstractex;

public abstract class Computer {

	//�߻� Ŭ������ �ܵ����� �ƴ϶� ���� Ŭ������ ���Ƿ��� ����
	//�ϳ��� �߻� �޼��带 �����ϸ� abstract��
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	
	
}
