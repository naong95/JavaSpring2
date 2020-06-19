package thisex;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("이름 없음", 1); //초기화 안 하면 스트링은 널로, 인트는 0으로 초기화
	} //다른 생성자를 불렀으면 이 작업을 해야되는데 이전에 다른 스테이트먼트가 있으면 안돼
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + ", " + age);
	}
	
	public Person getSelf() {
		return this; //자신의 주소를 반환: 반환 타입은 자신의 타입 여기서는 person 타입
	}
}
