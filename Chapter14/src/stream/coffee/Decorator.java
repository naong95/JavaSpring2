package stream.coffee;

public abstract class Decorator extends Coffee{

	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();
	} //구현되어 있어도 추상클래스로 사용가능
}
