package thisex;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("�̸� ����", 1); //�ʱ�ȭ �� �ϸ� ��Ʈ���� �η�, ��Ʈ�� 0���� �ʱ�ȭ
	} //�ٸ� �����ڸ� �ҷ����� �� �۾��� �ؾߵǴµ� ������ �ٸ� ������Ʈ��Ʈ�� ������ �ȵ�
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + ", " + age);
	}
	
	public Person getSelf() {
		return this; //�ڽ��� �ּҸ� ��ȯ: ��ȯ Ÿ���� �ڽ��� Ÿ�� ���⼭�� person Ÿ��
	}
}
