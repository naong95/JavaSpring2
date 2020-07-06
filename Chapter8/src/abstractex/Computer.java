package abstractex;

public abstract class Computer {

	//추상 클래스는 단독용이 아니라 상위 클래스로 사용되려고 만듬
	//하나의 추상 메서드를 포함하면 abstract로
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	
}
