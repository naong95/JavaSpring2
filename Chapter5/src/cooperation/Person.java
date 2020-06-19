package cooperation;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		setName(name);
		setMoney(money);
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void buyStarCoffee(Star starCoffee, int money) {
		System.out.println(name + "님이 " + money + "으로 별 다방 아메리카노를 구입했습니다.");
	}
	public void buyBeanCoffee(Bean beanCoffee, int money) {
		System.out.println(name + "님이 " + money + "으로 콩 다방 라떼를 구입했습니다.");
	}
}
