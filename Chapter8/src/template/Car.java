package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {} //하위 클래스가 재정의 하면 그때 기능이 생기는 매서드.
	
	final public void run() { //final 쓰면 재정의 할 수 없는 메서드가 됨.
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}

}
