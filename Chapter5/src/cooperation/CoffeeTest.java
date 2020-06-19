package cooperation;

public class CoffeeTest {

	public static void main(String[] args) {
		Person kim = new Person("Kim", 10000);
		Person Lee = new Person("Lee", 10000);
		
		Star starCoffee = new Star();
		Bean beanCoffee = new Bean();
		
		kim.buyStarCoffee(starCoffee, 4000);
		Lee.buyBeanCoffee(beanCoffee, 4500);
	}

}
