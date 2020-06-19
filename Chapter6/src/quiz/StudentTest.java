package quiz;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee");
		studentLee.addBook("태백산맥1");
		studentLee.addBook("태백산맥2");
		
		Student studentKim = new Student("Kim");
		studentKim.addBook("토지1");
		studentKim.addBook("토지2");
		studentKim.addBook("토지3");
		
		Student studentHeo = new Student("Heo");
		studentHeo.addBook("해리포터1");
		studentHeo.addBook("해리포터2");
		studentHeo.addBook("해리포터3");
		studentHeo.addBook("해리포터4");
		studentHeo.addBook("해리포터5");
		studentHeo.addBook("해리포터6");
		
		studentLee.showInfo();
		studentKim.showInfo();
		studentHeo.showInfo();
	}

}
