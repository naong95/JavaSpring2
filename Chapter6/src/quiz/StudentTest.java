package quiz;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee");
		studentLee.addBook("�¹���1");
		studentLee.addBook("�¹���2");
		
		Student studentKim = new Student("Kim");
		studentKim.addBook("����1");
		studentKim.addBook("����2");
		studentKim.addBook("����3");
		
		Student studentHeo = new Student("Heo");
		studentHeo.addBook("�ظ�����1");
		studentHeo.addBook("�ظ�����2");
		studentHeo.addBook("�ظ�����3");
		studentHeo.addBook("�ظ�����4");
		studentHeo.addBook("�ظ�����5");
		studentHeo.addBook("�ظ�����6");
		
		studentLee.showInfo();
		studentKim.showInfo();
		studentHeo.showInfo();
	}

}
