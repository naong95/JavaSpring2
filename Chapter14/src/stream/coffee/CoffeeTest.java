package stream.coffee;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee americano = new KenyaAmericano();
		americano.brewing();
		System.out.println();
		
		
		Coffee kenyLatte = new Latte(new KenyaAmericano());
		kenyLatte.brewing();
		System.out.println();
		
		Coffee EtiopiaMocha = new Mocha(new Latte(new EtiopiaAmericano()));
		EtiopiaMocha.brewing();
	}

}
