package polymorphism;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eating() {
		System.out.println();
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
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}



//여러 클래스가 애니멀이라는 타입 하나로 같이 돌아갈 수 있다.
public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		/*Human human = (Human)hAnimal; //휴먼으로 다운캐스팅 해야지 리드북스 사용가능, 다운캐스팅은 명시적으로
		human.readBooks();*/
		
		
		/*if(hAnimal instanceof Human) {
			Human human = (Human)hAnimal;
			human.readBooks();
		} //instanceof는 true false 체크해서 반환해줌
		*/
		
		/*
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		*/
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		
		/*
		for(Animal animal : animalList) {
			animal.move(); //코드는 하나지만 다양하게 호출된다.
		}
		*/

	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			}
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				System.out.println("error");
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move(); //하나의 코드가 여러 자료형이 구현돼서 다른 실행이 이루어짐.
	}
	
	/*public void moveAnimal(Human animal) { //각각 하면 따로 만들면 3개를 만들어야한다.
		animal.move();
	}*/

}
