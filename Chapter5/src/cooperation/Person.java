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
		System.out.println(name + "���� " + money + "���� �� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.");
	}
	public void buyBeanCoffee(Bean beanCoffee, int money) {
		System.out.println(name + "���� " + money + "���� �� �ٹ� �󶼸� �����߽��ϴ�.");
	}
}
