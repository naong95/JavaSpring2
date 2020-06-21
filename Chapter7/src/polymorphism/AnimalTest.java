package polymorphism;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal{
	
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
}



//여러 클래스가 애니멀이라는 타입 하나로 같이 돌아갈 수 있다.
public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		

	}
	
	public void moveAnimal(Animal animal) {
		animal.move(); //하나의 코드가 여러 자료형이 구현돼서 다른 실행이 이루어짐.
	}
	
	public void moveAnimal(Human animal) { //각각 하면 따로 만들면 3개를 만들어야한다.
		animal.move();
	}

}
