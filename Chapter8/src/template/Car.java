package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void washCar() {} //���� Ŭ������ ������ �ϸ� �׶� ����� ����� �ż���.
	
	final public void run() { //final ���� ������ �� �� ���� �޼��尡 ��.
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}

}